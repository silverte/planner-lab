package com.skt.swing.mcatalog.context.planner.infra.persistent;

import com.skt.swing.mcatalog.context.planner.domain.core.model.Planner;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.PlanItmCssInfo;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.Button;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.CheckBox;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.CheckComboBox;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.Combo;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.Find;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.Input;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.InputCalendar;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.InputFind;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.Lov;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.Radio;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.TextArea;
import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd.TextAreaFind;

public class PlanItmMapper {
	
	public static MprdPlanItmLst build(Planner planner) {

		MprdPlanItmLst mprdPlanItmLst = new MprdPlanItmLst();
		
		//planItmBasicInfo 세팅
		mprdPlanItmLst.setPlanItmId(planner.getPlanItmBasicInfo().get(0).getPlanItmId());
		mprdPlanItmLst.setAuditId(planner.getPlanItmBasicInfo().get(0).getAuditId());
		mprdPlanItmLst.setAuditDtm(planner.getPlanItmBasicInfo().get(0).getAuditDtm());
		mprdPlanItmLst.setSupPlanItmId(planner.getPlanItmBasicInfo().get(0).getSupPlanItmId());
		mprdPlanItmLst.setPlanItmNm(planner.getPlanItmBasicInfo().get(0).getPlanItmNm());
		mprdPlanItmLst.setCreClCd(planner.getPlanItmBasicInfo().get(0).getCreClCd());
		mprdPlanItmLst.setPlanItmTypCd(planner.getPlanItmTypCd());
		mprdPlanItmLst.setPlanItmTypDtlCd(planner.getPlanItmTypDtlCd());		
		mprdPlanItmLst.setPlanItmLclCd(planner.getPlanItmBasicInfo().get(0).getPlanItmLclCd());
		mprdPlanItmLst.setPlanItmMclCd(planner.getPlanItmBasicInfo().get(0).getPlanItmMclCd());
		mprdPlanItmLst.setSclDispSeq(planner.getPlanItmBasicInfo().get(0).getSclDispSeq());		
		mprdPlanItmLst.setProdRelCd(planner.getPlanItmBasicInfo().get(0).getProdRelCd());
		mprdPlanItmLst.setInfoItmYn(planner.getPlanItmBasicInfo().get(0).getInfoItmYn());
		mprdPlanItmLst.setUseYn(planner.getPlanItmBasicInfo().get(0).getUseYn());
		
		//planItmCssInfo 세팅
		mprdPlanItmLst.setInsMthdCd(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getInsMthdCd());
		mprdPlanItmLst.setDispLocRow(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispLocRow());
		mprdPlanItmLst.setDispLocCol(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getRdispLocCol());
		mprdPlanItmLst.setDispLocMrgCnt(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispLocMrgCnt());
		mprdPlanItmLst.setDispLocColSeq(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispLocColSeq());
		mprdPlanItmLst.setDispLblNm(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispLblNm());
		mprdPlanItmLst.setDispItmHidYn(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispItmHidYn());
		mprdPlanItmLst.setDispItmMndtYn(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispItmMndtYn());
		mprdPlanItmLst.setDispItmReadOnly(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispItmReadOnly());
		mprdPlanItmLst.setDispItmDesc(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispItmDesc());
		mprdPlanItmLst.setDispItmSize(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispItmSize());
		mprdPlanItmLst.setDispItmIniVal(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispItmIniVal());
		mprdPlanItmLst.setDispObjClas(planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo().getDispObjClas());
		
		//planItmCssInfo - 입력방식에따른 컬럼값 세팅  
		PlanItmCssInfo planItmCssInfo = planner.getPlanItmBasicInfo().get(0).getPlanItmCssInfo();
		
		if( planItmCssInfo  instanceof Combo) {
			mprdPlanItmLst.setSelItmCd(((Combo)planItmCssInfo).getSelItmCd());					//선택항목
			mprdPlanItmLst.setSelItmCtt(((Combo)planItmCssInfo).getSelItmCtt());				//선택항목내용
		
		}else if(planItmCssInfo  instanceof Lov) {
			mprdPlanItmLst.setSelItmCd(((Lov)planItmCssInfo).getSelItmCd());					//선택항목
			mprdPlanItmLst.setSelItmCtt(((Lov)planItmCssInfo).getSelItmCtt());					//선택항목내용
			mprdPlanItmLst.setSelSrchCond(((Lov)planItmCssInfo).getSelSrchCond());				//선택검색조건
			mprdPlanItmLst.setSelSrchKey(((Lov)planItmCssInfo).getSelSrchKey());				//선택검색키
			mprdPlanItmLst.setPrtItmDisp(((Lov)planItmCssInfo).getPrtItmDisp());				//출력항목표시
			mprdPlanItmLst.setPrtSelMapp(((Lov)planItmCssInfo).getPrtSelMapp());				//출력선택매핑
		
		}else if(planItmCssInfo  instanceof Input) {
			mprdPlanItmLst.setInsValTypCd(((Input)planItmCssInfo).getInsValTypCd());			//입력값타입
			mprdPlanItmLst.setInsValUnitCd(((Input)planItmCssInfo).getInsValUnitCd());			//입력값단위
			mprdPlanItmLst.setInsValLeng(((Input)planItmCssInfo).getInsValLeng());				//입렵값최대길이
			mprdPlanItmLst.setInsMinLeng(((Input)planItmCssInfo).getInsMinLeng());				//입력값최소길이
			mprdPlanItmLst.setDispPrtForm(((Input)planItmCssInfo).getDispPrtForm());			//표시출력양식
		
		}else if(planItmCssInfo  instanceof TextArea) {
			mprdPlanItmLst.setInsValTypCd(((TextArea)planItmCssInfo).getInsValTypCd());			//입력값타입
			mprdPlanItmLst.setInsValUnitCd(((TextArea)planItmCssInfo).getInsValUnitCd());		//입력값단위
			mprdPlanItmLst.setInsValLeng(((TextArea)planItmCssInfo).getInsValLeng());			//입렵값최대길이
			mprdPlanItmLst.setInsMinLeng(((TextArea)planItmCssInfo).getInsMinLeng());			//입력값최소길이
		
		}else if(planItmCssInfo  instanceof CheckBox) {
			mprdPlanItmLst.setSelItmCd(((CheckBox)planItmCssInfo).getSelItmCd());				//선택항목
			mprdPlanItmLst.setSelItmCtt(((CheckBox)planItmCssInfo).getSelItmCtt());				//선택항목내용			
		
		}else if(planItmCssInfo  instanceof Radio) {
			mprdPlanItmLst.setSelItmCd(((Radio)planItmCssInfo).getSelItmCd());					//선택항목
			mprdPlanItmLst.setSelItmCtt(((Radio)planItmCssInfo).getSelItmCtt());				//선택항목내용				
		
		}else if(planItmCssInfo  instanceof Button) {
			mprdPlanItmLst.setExecClCd(((Button)planItmCssInfo).getExecClCd());					//실행구분
			mprdPlanItmLst.setExecDtlCtt(((Button)planItmCssInfo).getExecDtlCtt());				//실행상세내용
			mprdPlanItmLst.setPrtSelMapp(((Button)planItmCssInfo).getPrtSelMapp());				//출력선택매핑
		
		}else if(planItmCssInfo  instanceof InputCalendar) {
			mprdPlanItmLst.setInsValTypCd(((InputCalendar)planItmCssInfo).getInsValTypCd());	//입력값타입
			mprdPlanItmLst.setInsValUnitCd(((InputCalendar)planItmCssInfo).getInsValUnitCd());	//입력값단위
			mprdPlanItmLst.setInsValLeng(((InputCalendar)planItmCssInfo).getInsValLeng());		//입렵값최대길이
			mprdPlanItmLst.setInsMinLeng(((InputCalendar)planItmCssInfo).getInsMinLeng());		//입력값최소길이			
		
		}else if(planItmCssInfo  instanceof Find) {
			mprdPlanItmLst.setExecClCd(((Find)planItmCssInfo).getExecClCd());					//실행구분
			mprdPlanItmLst.setExecDtlCtt(((Find)planItmCssInfo).getExecDtlCtt());				//실행상세내용
			mprdPlanItmLst.setPrtSelMapp(((Find)planItmCssInfo).getPrtSelMapp());				//출력선택매핑			
		
		}else if(planItmCssInfo  instanceof CheckComboBox) {
			mprdPlanItmLst.setSelItmCd(((CheckComboBox)planItmCssInfo).getSelItmCd());			//선택항목
			mprdPlanItmLst.setSelItmCtt(((CheckComboBox)planItmCssInfo).getSelItmCtt());		//선택항목내용			
		
		}else if(planItmCssInfo  instanceof InputFind) {
			mprdPlanItmLst.setInsValTypCd(((InputFind)planItmCssInfo).getInsValTypCd());		//입력값타입
			mprdPlanItmLst.setInsValUnitCd(((InputFind)planItmCssInfo).getInsValUnitCd());		//입력값단위
			mprdPlanItmLst.setInsValLeng(((InputFind)planItmCssInfo).getInsValLeng());			//입렵값최대길이
			mprdPlanItmLst.setInsMinLeng(((InputFind)planItmCssInfo).getInsMinLeng());			//입력값최소길이
			mprdPlanItmLst.setDispPrtForm(((InputFind)planItmCssInfo).getDispPrtForm());		//표시출력양식
			mprdPlanItmLst.setExecClCd(((InputFind)planItmCssInfo).getExecClCd());				//실행구분
			mprdPlanItmLst.setExecDtlCtt(((InputFind)planItmCssInfo).getExecDtlCtt());			//실행상세내용
		
		}else if(planItmCssInfo  instanceof TextAreaFind) {
			mprdPlanItmLst.setInsValTypCd(((TextAreaFind)planItmCssInfo).getInsValTypCd());		//입력값타입
			mprdPlanItmLst.setInsValUnitCd(((TextAreaFind)planItmCssInfo).getInsValUnitCd());	//입력값단위
			mprdPlanItmLst.setInsValLeng(((TextAreaFind)planItmCssInfo).getInsValLeng());		//입렵값최대길이
			mprdPlanItmLst.setInsMinLeng(((TextAreaFind)planItmCssInfo).getInsMinLeng());		//입력값최소길이
			mprdPlanItmLst.setDispPrtForm(((TextAreaFind)planItmCssInfo).getDispPrtForm());		//표시출력양식
			mprdPlanItmLst.setExecClCd(((TextAreaFind)planItmCssInfo).getExecClCd());			//실행구분
			mprdPlanItmLst.setExecDtlCtt(((TextAreaFind)planItmCssInfo).getExecDtlCtt());		//실행상세내용			
		}
		
		return mprdPlanItmLst;

	}

}
