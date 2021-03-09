package com.skt.swing.mcatalog.context.planner.application.dto;

import java.util.Date;

import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.CreClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ExecClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValUnitCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypDtlCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ProdRelCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.SelItmCd;

import lombok.Data;

@Data
public class PlanItmResponseDTO {
    
	private String planItmId;
	private String auditId;
	private Date auditDtm;
	private String supPlanItmId;
	private String planItmNm;
	private CreClCd creClCd;
	private PlanItmTypCd planItmTypCd;
	private PlanItmTypDtlCd planItmTypDtlCd;
	private String planItmLclCd;
	private String planItmMclCd;
	private Integer sclDispSeq;
	private ProdRelCd prodRelCd;
	private Boolean infoItmYn;
	private Boolean useYn;
	private InsMthdCd insMthdCd;
	private InsValTypCd insValTypCd;
	private InsValUnitCd insValUnitCd;
	private Integer insValLeng;
	private Integer insMinLeng;
	private Integer dispLocRow;
	private Integer dispLocCol;
	private Integer dispLocMrgCnt;
	private Integer dispLocColSeq;
	private String dispLblNm;
	private Boolean dispItmHidYn;
	private Boolean dispItmMndtYn;
	private Boolean dispItmReadOnly;
	private String dispItmDesc;
	private Integer dispItmSize;
	private String dispItmIniVal;
	private String dispObjClas;
	private String dispObjStyl;
	private String dispPrtForm;
	private SelItmCd selItmCd;
	private String selItmCtt;
	private String selSrchCond;
	private String selSrchKey;
	private String prtItmDisp;
	private String prtSelMapp;
	private ExecClCd execClCd;
	private String execDtlCtt;
	private String newIdType;
}