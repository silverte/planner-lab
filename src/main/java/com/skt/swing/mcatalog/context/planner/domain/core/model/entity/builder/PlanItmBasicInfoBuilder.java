package com.skt.swing.mcatalog.context.planner.domain.core.model.entity.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.PlanItmBasicInfo;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.CreClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ExecClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValUnitCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ProdRelCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.SelItmCd;

public class PlanItmBasicInfoBuilder {

	public static List<PlanItmBasicInfo> basicInfoMapp(String 			planItmId
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
													  ,	String			execDtlCtt){
		
		
		List<PlanItmBasicInfo> planItmBasicInfoList = new ArrayList<>();
		PlanItmBasicInfo planItmBasicInfo=  PlanItmBasicInfo.builder()
															  .planItmId(planItmId)
															  .auditId(auditId)
															  .auditDtm(auditDtm)
															  .planItmNm(planItmNm)
															  .supPlanItmId(supPlanItmId)
															  .creClCd(creClCd)
															  .planItmLclCd(planItmLclCd)
															  .planItmMclCd(planItmMclCd)
															  .sclDispSeq(sclDispSeq)
															  .prodRelCd(prodRelCd)
															  .infoItmYn(infoItmYn)
															  .useYn(useYn)
															  .insMthdCd(insMthdCd)
															  .dispLocRow(dispLocRow)
															  .rdispLocCol(rdispLocCol)
															  .dispLocMrgCnt(dispLocMrgCnt)
															  .dispLocColSeq(dispLocColSeq)
															  .dispLblNm(dispLblNm)
															  .dispItmHidYn(dispItmHidYn)
															  .dispItmMndtYn(dispItmMndtYn)
															  .dispItmReadOnly(dispItmReadOnly)
															  .dispItmSize(dispItmSize)
															  .dispItmIniVal(dispItmIniVal)
															  .dispObjClas(dispObjClas)
															  .dispObjStyl(dispObjStyl)
															  .dispItmDesc(dispItmDesc)
															  .selItmCd(selItmCd)
															  .selItmCtt(selItmCtt)
															  .selSrchCond(selSrchCond)
															  .selSrchKey(selSrchKey)
															  .prtItmDisp(prtItmDisp)
															  .prtSelMapp(prtSelMapp)
															  .insValTypCd(insValTypCd)
															  .insValUnitCd(insValUnitCd)
															  .insValLeng(insValLeng)
															  .insMinLeng(insMinLeng)
															  .dispPrtForm(dispPrtForm)
															  .execClCd(execClCd)
															  .execDtlCtt(execDtlCtt)
															 .build();	
		
		planItmBasicInfoList.add(planItmBasicInfo);
		
		return planItmBasicInfoList;
		
	}


}
