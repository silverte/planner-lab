package com.skt.swing.mcatalog.context.planner.domain.core.model.entity;

import com.skt.swing.mcatalog.context.planner.application.dto.PlanItmRequestDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlanItmClcd {
//	[기획항목 분류 코드 및 값]
	
	private String type;	//분류명 ex) planItmLclCd,planItmMclCd
	private String value;	//분류값 ex) A0000,A1000

	public PlanItmClcd(String type,String value) {
		this.type	= type;
		this.value	= value;
	}
	
	public static PlanItmClcd build(PlanItmRequestDTO params) {
		
		//1.기획항목기본정보 세팅
		String type = params.getPlanItmLclCd();
		String value = params.getPlanItmMclCd();
		
		PlanItmClcd planItmClcd  = new PlanItmClcd(type,value); 
		
		return planItmClcd;		
	}
}
