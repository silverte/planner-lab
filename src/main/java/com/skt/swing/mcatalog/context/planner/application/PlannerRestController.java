package com.skt.swing.mcatalog.context.planner.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.skt.swing.mcatalog.context.planner.application.dto.GetSampleRequestDTO;
import com.skt.swing.mcatalog.context.planner.application.dto.PlanItmRequestDTO;
import com.skt.swing.mcatalog.context.planner.application.dto.PlanItmResponseDTO;
import com.skt.swing.mcatalog.context.planner.domain.application_port.PlannerServicePort;
import com.skt.swing.mcatalog.context.planner.domain.core.model.Planner;
import com.skt.swing.mcatalog.context.planner.domain.core.model.SampleAggregate;
import com.sktelecom.swingmsa.mcatalog.context.base.exception.BizException;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class PlannerRestController {

	private PlannerServicePort plannerServicePort;

	@Autowired
    public PlannerRestController(PlannerServicePort plannerService) {
        this.plannerServicePort = plannerService;
	}
	
	
	@GetMapping("/sample/{id}")
	@ApiOperation(value = "샘플용",notes="샘플용")
	public List<SampleAggregate> getSample( final GetSampleRequestDTO request ) throws Exception {

		SampleAggregate query = request.getSampleAggregateForQuery();

		List<SampleAggregate> result =  plannerServicePort.getSample(query);

		return result;
	}
	
	@PostMapping("/apiSavePlanItmInfo")
	@ApiOperation(value = "기획항목저장",notes="기획항목을 저장한다")	
	public Map<String, Object>  savePlanItmInfo(@RequestBody PlanItmRequestDTO params) {
		
		Map<String, Object> result	= new HashMap<>();
		Map<String, String> message = new HashMap<>();

		try {
		 
			//DTO -> model
			Planner planner = params.build();
			
			//저장 함수 호출
			plannerServicePort.savePlanItmInfo(planner);
			
	        message.put("code", "0");
	        message.put("message", "정상 처리되었습니다.");
	        
			result.put("error", message);
		} catch(Exception e) {
			throw new BizException(e);
		}

		return result;
	}
	
	@PostMapping("/newId")
	@ApiOperation(value = "기획항목ID채번",notes="기획항목ID를 채번 Rule : planItmTypCd + seq")
	public Map<String, Object> newId(@RequestBody PlanItmRequestDTO params) {
		
		Map<String, Object> result	= new HashMap<>();
		Map<String, String> message = new HashMap<>();
		
		try {
			
			String	planItmTypCd	= params.getPlanItmTypCd().toString();	//param1:상품유형
			String	newIdType		= params.getNewIdType();				//param2:채번유형
			Long	nextKey			= null;
			String	planItmId		= null;
			
			if(newIdType.equals("PLAN")) {
				//기획항목ID채번
				nextKey		= plannerServicePort.newId(planItmTypCd);
				planItmId	= planItmTypCd + String.valueOf(nextKey);
			}
			
			//Response DTO세팅
			PlanItmResponseDTO planItmlst = new PlanItmResponseDTO();
			planItmlst.setPlanItmId(planItmId);
			
			result.put("output1", planItmlst);
			
	        message.put("code", "0");
	        message.put("message", "정상 처리되었습니다.");
	 
	        result.put("error", message);
		} catch(Exception e) {
			throw new BizException(e);
		}
		
		return result;
	}
}
