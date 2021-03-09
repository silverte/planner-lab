package com.skt.swing.mcatalog.context.planner.domain.core.model.entity.builder;

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
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ExecClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValUnitCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.SelItmCd;

public class PlanItmCssInfoBuilder {
	
	public static PlanItmCssInfo insMthCdMapp(String 		planItmId
											, InsMthdCd 	insMthdCd
											, int			dispLocRow
											, int 			rdispLocCol
											, int			dispLocMrgCnt
											, int			dispLocColSeq
											, String		dispLblNm
											, Boolean 		dispItmHidYn
											, Boolean 		dispItmMndtYn
											, Boolean 		dispItmReadOnly
											, int			dispItmSize
											, String		dispItmIniVal
											, String		dispObjClas
											, String		dispObjStyl
											, String		dispItmDesc
											, SelItmCd		selItmCd
											, String 		selItmCtt
											, String		selSrchCond
											, String		selSrchKey
											, String		prtItmDisp
											, String		prtSelMapp
											, InsValTypCd	insValTypCd
											, InsValUnitCd	insValUnitCd
											, int			insValLeng
											, int			insMinLeng
											, String		dispPrtForm
											, ExecClCd		execClCd
											, String		execDtlCtt) {
		
		PlanItmCssInfo planItmCssInfo = null;
		
		if(insMthdCd.equals(InsMthdCd.COMBO)) {	
			planItmCssInfo = Combo.builder()
									.planItmId(planItmId)
									.insMthdCd(insMthdCd)
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
								   .build();
		}else if(insMthdCd.equals(InsMthdCd.LOV)) {
			planItmCssInfo = Lov.builder()
									.planItmId(planItmId)
									.insMthdCd(insMthdCd)
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
								   .build();
		}else if(insMthdCd.equals(InsMthdCd.INPUT)) {
			planItmCssInfo = Input.builder()
									.planItmId(planItmId)
									.insMthdCd(insMthdCd)
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
									.insValTypCd(insValTypCd)
									.insValUnitCd(insValUnitCd)
									.insValLeng(insValLeng)
									.insMinLeng(insMinLeng)
									.dispPrtForm(dispPrtForm)
								   .build();			
		}else if(insMthdCd.equals(InsMthdCd.TEXTAREA)) {
			planItmCssInfo = TextArea.builder()
										.planItmId(planItmId)
										.insMthdCd(insMthdCd)
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
										.insValTypCd(insValTypCd)
										.insValUnitCd(insValUnitCd)
										.insValLeng(insValLeng)
										.insMinLeng(insMinLeng)
									   .build();			
		}else if(insMthdCd.equals(InsMthdCd.CHECK)) {
			planItmCssInfo = CheckBox.builder()
										.planItmId(planItmId)
										.insMthdCd(insMthdCd)
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
									   .build();			
		}else if(insMthdCd.equals(InsMthdCd.RADIO)) {
			planItmCssInfo = Radio.builder()
									.planItmId(planItmId)
									.insMthdCd(insMthdCd)
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
								   .build();			
		}else if(insMthdCd.equals(InsMthdCd.BUTTON)) {
			planItmCssInfo = Button.builder()
									 .planItmId(planItmId)
									 .insMthdCd(insMthdCd)
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
									 .execClCd(execClCd)
									 .execDtlCtt(execDtlCtt)
									 .prtSelMapp(prtSelMapp)
								   .build();			
		}else if(insMthdCd.equals(InsMthdCd.INCALENDAR)) {
			planItmCssInfo = InputCalendar.builder()
											.planItmId(planItmId)
											.insMthdCd(insMthdCd)
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
											.insValTypCd(insValTypCd)
											.insValUnitCd(insValUnitCd)
											.insValLeng(insValLeng)
											.insMinLeng(insMinLeng)
										   .build();			
		}else if(insMthdCd.equals(InsMthdCd.FIND)) {
			planItmCssInfo = Find.builder()
									.planItmId(planItmId)
									.insMthdCd(insMthdCd)
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
									.execClCd(execClCd)
									.execDtlCtt(execDtlCtt)
									.prtSelMapp(prtSelMapp)
								   .build();			
		}else if(insMthdCd.equals(InsMthdCd.CHK_COMBO)) {
			planItmCssInfo = CheckComboBox.builder()
											.planItmId(planItmId)
											.insMthdCd(insMthdCd)
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
										   .build();			
		}else if(insMthdCd.equals(InsMthdCd.INPUT_FIND)) {
			planItmCssInfo = InputFind.builder()
										.planItmId(planItmId)
										.insMthdCd(insMthdCd)
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
										.insValTypCd(insValTypCd)
										.insValUnitCd(insValUnitCd)
										.insValLeng(insValLeng)
										.insMinLeng(insMinLeng)
										.dispPrtForm(dispPrtForm)
										.execClCd(execClCd)
										.execDtlCtt(execDtlCtt)
									   .build();			
		}else if(insMthdCd.equals(InsMthdCd.TXTAR_FIND)) {
			planItmCssInfo = TextAreaFind.builder()
											.planItmId(planItmId)
											.insMthdCd(insMthdCd)
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
											.insValTypCd(insValTypCd)
											.insValUnitCd(insValUnitCd)
											.insValLeng(insValLeng)
											.insMinLeng(insMinLeng)
											.dispPrtForm(dispPrtForm)
											.execClCd(execClCd)
											.execDtlCtt(execDtlCtt)
										   .build();			
		}else {
			//입력방식코드가 없을땐 CSS 디폴트정보세팅
			planItmCssInfo = new PlanItmCssInfo( planItmId
					 						   , insMthdCd
					 						   , dispLocRow
					 						   , rdispLocCol
					 						   , dispLocMrgCnt
					 						   , dispLocColSeq
					 						   , dispLblNm, dispItmHidYn
					 						   , dispItmMndtYn
					 						   , dispItmReadOnly
					 						   , dispItmSize
					 						   , dispItmIniVal
					 						   , dispObjClas
					 						   , dispObjStyl
					 						   , dispItmDesc);
		}
				
		return planItmCssInfo;
		
	}

}
