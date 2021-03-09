package com.skt.swing.mcatalog.context.planner.domain.core.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.PlanItmBasicInfo;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.PlanItmCl;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.builder.PlanItmBasicInfoBuilder;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.builder.PlanItmClBuilder;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.CreClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ExecClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValUnitCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypDtlCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ProdRelCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.SelItmCd;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Planner {
	
	//	[Planner Main]
	private PlanItmTypCd			planItmTypCd;		//상품유형코드
	private PlanItmTypDtlCd 		planItmTypDtlCd;	//상품상세유형코드
	private List<PlanItmBasicInfo>	planItmBasicInfo;	//기획항목 기본정보
	private List<PlanItmCl> 	 	planItmCl;			//기획항목 분류목록
	
	@Builder
	public Planner( PlanItmTypCd 	planItmTypCd 
				  , PlanItmTypDtlCd planItmTypDtlCd
				  , String 			planItmId
				  , String 			auditId
				  , Date			auditDtm
				  , String 			planItmNm
				  , String 			supPlanItmId
				  , CreClCd 		creClCd
				  , String 			planItmLclCd
				  , String 			planItmMclCd
				  , int 			sclDispSeq
				  , ProdRelCd 		prodRelCd
				  , Boolean 		infoItmYn
				  , Boolean 		useYn
				  , InsMthdCd 		insMthdCd
				  , int				dispLocRow
				  , int 			rdispLocCol
				  , int				dispLocMrgCnt
				  , int				dispLocColSeq
				  , String			dispLblNm
				  , Boolean 		dispItmHidYn
				  , Boolean 		dispItmMndtYn
				  , Boolean 		dispItmReadOnly
				  , int				dispItmSize
				  , String			dispItmIniVal
				  , String			dispObjClas
				  , String			dispObjStyl
				  , String			dispItmDesc
				  , SelItmCd		selItmCd
				  , String 			selItmCtt
				  , String			selSrchCond
				  , String			selSrchKey
				  , String			prtItmDisp
				  , String			prtSelMapp
				  , InsValTypCd		insValTypCd
				  , InsValUnitCd	insValUnitCd
				  , int				insValLeng
				  , int				insMinLeng
				  , String			dispPrtForm
				  , ExecClCd		execClCd
				  ,	String			execDtlCtt
				  , String 			planItmClCd	
				  , String 			planItmClNm	
				  , int				clDispSeq) {
		
		this.planItmTypCd		= planItmTypCd;
		this.planItmTypDtlCd	= planItmTypDtlCd;		
		this.planItmBasicInfo	= PlanItmBasicInfoBuilder.basicInfoMapp(planItmId
																	  , auditId
																	  , auditDtm
																	  , planItmNm
																	  , supPlanItmId
																	  , creClCd
																	  , planItmLclCd
																	  , planItmMclCd
																	  , sclDispSeq
																	  , prodRelCd
																	  , infoItmYn
																	  , useYn
																	  , insMthdCd
																	  , dispLocRow
																	  , rdispLocCol
																	  , dispLocMrgCnt
																	  , dispLocColSeq
																	  , dispLblNm
																	  , dispItmHidYn
																	  , dispItmMndtYn
																	  , dispItmReadOnly
																	  , dispItmSize
																	  , dispItmIniVal
																	  , dispObjClas
																	  , dispObjStyl
																	  , dispItmDesc
																	  , selItmCd
																	  , selItmCtt
																	  , selSrchCond
																	  , selSrchKey
																	  , prtItmDisp
																	  , prtSelMapp
																	  , insValTypCd
																	  , insValUnitCd
																	  , insValLeng
																	  , insMinLeng
																	  , dispPrtForm
																	  , execClCd
																	  , execDtlCtt);
		
		this.planItmCl			= PlanItmClBuilder.planItmClMapp(planItmClCd
				                                      	   	   , auditId
				                                      	   	   , auditDtm
				                                      	   	   , planItmClNm
				                                      	   	   , clDispSeq
				                                      	   	   , useYn);
	}
	
	/* Builder사용 안했을시
	public static Planner build(PlanItmRequestDTO params) {
		
		//기획항목 기본정보
		List<PlanItmBasicInfo> planItmBasicInfo	= new ArrayList<PlanItmBasicInfo>();
		planItmBasicInfo.add(PlanItmBasicInfo.build(params));
		
		//기획항목 분류목록
		List<PlanItmCl> planItmCl = new ArrayList<PlanItmCl>();
		planItmCl.add( PlanItmCl.build(params));
		
		Planner planner = new Planner(params.getPlanItmTypCd()
									, params.getPlanItmTypDtlCd()
									, planItmBasicInfo
									, planItmCl);

		return planner;
	}*/
}
