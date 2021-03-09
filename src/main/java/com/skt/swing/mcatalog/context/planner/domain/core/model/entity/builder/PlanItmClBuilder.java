package com.skt.swing.mcatalog.context.planner.domain.core.model.entity.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.PlanItmCl;

public class PlanItmClBuilder {
	
	public static List<PlanItmCl> planItmClMapp(String	planItmClCd	
											  , String	auditId		
											  , Date 	auditDtm
											  , String	planItmClNm	
											  , int		clDispSeq		
											  , Boolean	useYn){
		
		List<PlanItmCl> planItmClList = new ArrayList<PlanItmCl>();
		
		PlanItmCl planItmCl = PlanItmCl.builder()
										 .planItmClCd(planItmClCd)
										 .auditId(auditId)
										 .auditDtm(auditDtm)
										 .planItmClNm(planItmClNm)
										 .clDispSeq(clDispSeq)
										 .useYn(useYn)
										.build();
		
		planItmClList.add(planItmCl);
		
		return planItmClList;
	}
}
