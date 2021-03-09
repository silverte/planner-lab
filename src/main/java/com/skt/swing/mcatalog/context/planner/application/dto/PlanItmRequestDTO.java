package com.skt.swing.mcatalog.context.planner.application.dto;

import java.util.Date;

import com.skt.swing.mcatalog.context.planner.domain.core.model.Planner;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.CreClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ExecClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValUnitCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypDtlCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ProdRelCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.SelItmCd;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class PlanItmRequestDTO {
	
	//Planner
	private PlanItmTypCd planItmTypCd;
	private PlanItmTypDtlCd planItmTypDtlCd;
	
	//PlanItmBasicInfo
	private String planItmId;
	private String auditId;
	private Date auditDtm;
	private String supPlanItmId;
	private String planItmNm;
	private CreClCd creClCd;
	private String planItmLclCd;
	private String planItmMclCd;
	private Integer sclDispSeq;
	private ProdRelCd prodRelCd;
	private Boolean infoItmYn;
	private Boolean useYn;
	
	//PlanItmCssIfno
	private InsMthdCd insMthdCd;
	private Integer dispLocRow;
	private Integer dispLocCol;
	private Integer dispLocMrgCnt;
	private Integer dispLocColSeq;
	private String dispLblNm;
	private Boolean dispItmHidYn;
	private Boolean dispItmMndtYn;
	private Boolean dispItmReadOnly;
	private Integer dispItmSize;
	private String dispItmIniVal;
	private String dispObjClas;
	private String dispObjStyl;
	private String dispItmDesc;
	
	//planItmCssInfo-입력방식정보
	private InsValTypCd insValTypCd;
	private InsValUnitCd insValUnitCd;
	private Integer insValLeng;
	private Integer insMinLeng;
	private String dispPrtForm;
	private SelItmCd selItmCd;
	private String selItmCtt;
	private String selSrchCond;
	private String selSrchKey;
	private String prtItmDisp;
	private String prtSelMapp;
	private ExecClCd execClCd;
	private String execDtlCtt;
		
	//planItmCl
	private String planItmClCd;	
	private String planItmClNm;	
	private int	clDispSeq;

	//채번유형
	private String newIdType;
	
	@ApiParam
	public Planner build() {
		return Planner.builder()
						.planItmTypCd(this.planItmTypCd)
						.planItmTypDtlCd(this.planItmTypDtlCd)
						.planItmId(this.planItmId)
						.auditId(this.auditId)
						.auditDtm(this.auditDtm)
						.planItmNm(this.planItmNm)
						.supPlanItmId(this.supPlanItmId)
						.creClCd(this.creClCd)
						.planItmLclCd(this.planItmLclCd)
						.planItmMclCd(this.planItmMclCd)
						.sclDispSeq(this.sclDispSeq)
						.prodRelCd(this.prodRelCd)
						.infoItmYn(this.infoItmYn)
						.useYn(this.useYn)
						.insMthdCd(this.insMthdCd)
						.dispLocRow(this.dispLocRow)
						.rdispLocCol(this.dispLocCol)
						.dispLocMrgCnt(this.dispLocMrgCnt)
						.dispLocColSeq(this.dispLocColSeq)
						.dispLblNm(this.dispLblNm)
						.dispItmHidYn(this.dispItmHidYn)
						.dispItmMndtYn(this.dispItmMndtYn)
						.dispItmReadOnly(this.dispItmReadOnly)
						.dispItmSize(this.dispItmSize)
						.dispItmIniVal(this.dispItmIniVal)
						.dispObjClas(this.dispObjClas)
						.dispObjStyl(this.dispObjStyl)
						.dispItmDesc(this.dispItmDesc)
						.selItmCd(this.selItmCd)
						.selItmCtt(this.selItmCtt)
						.selSrchCond(this.selSrchCond)
						.selSrchKey(this.selSrchKey)
						.prtItmDisp(this.prtItmDisp)
						.prtSelMapp(this.prtSelMapp)
						.insValTypCd(this.insValTypCd)
						.insValUnitCd(this.insValUnitCd)
						.insValLeng(this.insValLeng)
						.insMinLeng(this.insMinLeng)
						.dispPrtForm(this.dispPrtForm)
						.execClCd(this.execClCd)
						.execDtlCtt(this.execDtlCtt)
						.planItmClCd(this.planItmClCd)	
						.planItmClNm(this.planItmClNm)	
						.clDispSeq(this.clDispSeq)
					  .build();			
	}
}