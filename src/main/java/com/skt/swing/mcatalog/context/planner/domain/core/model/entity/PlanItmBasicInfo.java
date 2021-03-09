package com.skt.swing.mcatalog.context.planner.domain.core.model.entity;

import java.util.Date;

import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.builder.PlanItmCssInfoBuilder;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.CreClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ExecClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValUnitCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ProdRelCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.SelItmCd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public  class PlanItmBasicInfo {
//  [기획항목 기본정보]	
	
	private String planItmId;		//기획항목ID
	private String auditId;			//최종변경자ID
	private Date auditDtm;			//최종변경일시
	private String planItmNm;		//기획항목명
	private String supPlanItmId;	//상위기획항목ID
	private CreClCd creClCd;		//생성구분코드
	private String planItmLclCd;	//대분류코드
	private String planItmMclCd;	//중분류코드
	private int sclDispSeq;			//소분류표시순번
	private ProdRelCd prodRelCd;	//본상품과의관계코드
	private Boolean infoItmYn;		//정보항목여부
	private Boolean useYn;			//사용여부
	
	private PlanItmCssInfo       planItmCssInfo;	//기획항목 CSS정보
		
	@Builder
	public PlanItmBasicInfo ( String 		planItmId
							, String 		auditId
							, Date			auditDtm
							, String 		planItmNm
							, String 		supPlanItmId
							, CreClCd 		creClCd
							, String 		planItmLclCd
							, String 		planItmMclCd
							, int 			sclDispSeq
							, ProdRelCd 	prodRelCd
							, Boolean 		infoItmYn
							, Boolean 		useYn
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
		
		this.planItmId		= planItmId;
		this.auditId		= auditId;
		this.auditDtm		= auditDtm;
		this.planItmNm		= planItmNm;	
		this.supPlanItmId	= supPlanItmId;	
		this.creClCd		= creClCd;		
		this.planItmLclCd	= planItmLclCd;	
		this.planItmMclCd	= planItmMclCd;	
		this.sclDispSeq		= sclDispSeq;			
		this.prodRelCd		= prodRelCd;	
		this.infoItmYn		= infoItmYn;		
		this.useYn			= useYn;
		this.planItmCssInfo = PlanItmCssInfoBuilder.insMthCdMapp(  planItmId
																  ,insMthdCd
																  ,dispLocRow
																  ,rdispLocCol
																  ,dispLocMrgCnt
																  ,dispLocColSeq
																  ,dispLblNm
																  ,dispItmHidYn
																  ,dispItmMndtYn
																  ,dispItmReadOnly
																  ,dispItmSize
																  ,dispItmIniVal
																  ,dispObjClas
																  ,dispObjStyl
																  ,dispItmDesc
																  ,selItmCd
																  ,selItmCtt
																  ,selSrchCond
																  ,selSrchKey
																  ,prtItmDisp
																  ,prtSelMapp
																  ,insValTypCd
																  ,insValUnitCd
																  ,insValLeng
																  ,insMinLeng
																  ,dispPrtForm
																  ,execClCd
																  ,execDtlCtt);
								
		
	}
	
	/* Builder 사용 안했을시
	public static PlanItmBasicInfo build(PlanItmRequestDTO params) {
		
		PlanItmBasicInfo planItmBasicInfo = null;
		PlanItmCssInfo planItmCssInfo = null;

		
		if(params.getInsMthdCd().equals(InsMthdCd.COMBO)) {						
			planItmCssInfo = new Combo(params);						
		}else if(params.getInsMthdCd().equals(InsMthdCd.LOV)) {
			planItmCssInfo = (PlanItmCssInfo) new Lov(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.INPUT)) {
			planItmCssInfo = (PlanItmCssInfo) new Input(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.TEXTAREA)) {
			planItmCssInfo = (PlanItmCssInfo) new TextArea(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.CHECK)) {
			planItmCssInfo = (PlanItmCssInfo) new CheckBox(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.RADIO)) {
			planItmCssInfo = (PlanItmCssInfo) new Radio(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.BUTTON)) {
			planItmCssInfo = (PlanItmCssInfo) new Button(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.INCALENDAR)) {
			planItmCssInfo = (PlanItmCssInfo) new InputCalendar(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.FIND)) {
			planItmCssInfo = (PlanItmCssInfo) new Find(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.CHK_COMBO)) {
			planItmCssInfo = (PlanItmCssInfo) new CheckComboBox(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.INPUT_FIND)) {
			planItmCssInfo = (PlanItmCssInfo) new InputFind(params);
		}else if(params.getInsMthdCd().equals(InsMthdCd.TXTAR_FIND)) {
			planItmCssInfo = (PlanItmCssInfo) new TextAreaFind(params);
		}
		
		PlanItmBasicInfo planItmBasicInfo = new PlanItmBasicInfo( params.getPlanItmId()
																, params.getAuditId()
																, params.getAuditDtm()
																, params.getPlanItmNm()
																, params.getSupPlanItmId()
																, params.getCreClCd()
																, params.getPlanItmLclCd()
																, params.getPlanItmMclCd()
																, params.getSclDispSeq()
																, params.getProdRelCd()
																, params.getInfoItmYn()
																, params.getUseYn()
																, planItmCssInfo
																);

		
		return planItmBasicInfo;	
	}
	*/

}