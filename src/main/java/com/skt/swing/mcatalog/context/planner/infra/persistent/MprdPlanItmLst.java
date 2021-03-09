/******************************************************************************
 * 프로그램명	: 기획항목리스트 모델
 * 설명           : 상품 기획시 필요한 사용할 시횡항목의 리스트 엔티티 정의 
 * ProgramID: MprdPlanItmClLst.java
 * 작성자		: P123113
 * 작성일		: 2019-11-25
 * 변경로그	:
 * CHG-CD   :   성명         :   반영일자              :   변경 내용
 * ---------- -------------- ------------- ------------------------------------  
 * ver1.01  : P156920   : 2020.05.08      : 1) planItmId Type변경(NUMBER->VARCHAR)
 *                                          2) planItmTypDtlCd추가                                        	
 *-----------------------------------------------------------------------------
*******************************************************************************/
package com.skt.swing.mcatalog.context.planner.infra.persistent;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import com.sktelecom.swingmsa.mcatalog.context.base.generator.CustomIdGenerator;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.CreClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ExecClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValUnitCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypDtlCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ProdRelCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.SelItmCd;
import com.sktelecom.swingmsa.mcatalog.context.util.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
//@GenericGenerator(
//		name = "PLAN_ITM_ID_GENERATOR",
//		strategy = "com.sktelecom.swingmsa.mcatalog.context.base.generator.CustomIdGenerator",
//		parameters = {
//				@org.hibernate.annotations.Parameter(name = CustomIdGenerator.PARAM_TBL_NM, value = "MPRD_PLAN_ITM_LST"),
//				@org.hibernate.annotations.Parameter(name = CustomIdGenerator.PARAM_ID_COL, value = "PLAN_ITM_ID"),
//				@org.hibernate.annotations.Parameter(name = CustomIdGenerator.PARAM_RANGE, value = "3000000000")
//				}
//		)
public class MprdPlanItmLst{

	@Id
//	@GeneratedValue(generator = "PLAN_ITM_ID_GENERATOR")
	private String planItmId;		//ver1.01


	@LastModifiedBy
	@EqualsAndHashCode.Exclude
	private String auditId;
	
	@LastModifiedDate
	@EqualsAndHashCode.Exclude
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	private Date auditDtm;
	
	private String supPlanItmId;	//ver1.01
	
	@Column(nullable = false, length = 100)
	private String planItmNm;
	
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private CreClCd creClCd;
	
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private PlanItmTypCd planItmTypCd;
	
	@Column(length = 10)			//ver1.01
	@Enumerated(EnumType.STRING)
	private PlanItmTypDtlCd planItmTypDtlCd;
	
	@Column(length = 10)
	private String planItmLclCd;
	
//	private Integer lclDispSeq;
	
	@Column(length = 10)
	private String planItmMclCd;
	
//	private Integer mclDispSeq;
	
//	@Column(length = 10)
//	private String planItmSclCd;
	
	private Integer sclDispSeq;
	
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private ProdRelCd prodRelCd;
	
	@Column(nullable = false, length = 1)
	private Boolean infoItmYn;
	
	@Column(nullable = false, length = 11)
	private Boolean useYn;
	
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private InsMthdCd insMthdCd;
	
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private InsValTypCd insValTypCd;
	
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private InsValUnitCd insValUnitCd;
	
	private Integer insValLeng;
	
	private Integer insMinLeng;
	
	@Column(nullable = false)
	private Integer dispLocRow;
	
	@Column(nullable = false)
	private Integer dispLocCol;
	
	@Column(nullable = false)
	private Integer dispLocMrgCnt;
	
	@Column(nullable = false)
	private Integer dispLocColSeq;
	
	@Column(length = 100)
	private String dispLblNm;
	
	@Column(nullable = false, length = 1)
	private Boolean dispItmHidYn;
	
	@Column(nullable = false, length = 1)
	private Boolean dispItmMndtYn;
	
	@Column(nullable = false, length = 1)
	private Boolean dispItmReadOnly;
	
	@Column(length = 1000)
	private String dispItmDesc;
	
	private Integer dispItmSize;
	
	@Column(length = 100)
	private String dispItmIniVal;
	
	@Column(length = 100)
	private String dispObjClas;
	
	@Column(length = 100)
	private String dispObjStyl;
	
	@Column(length = 100)
	private String dispPrtForm;
	
	@Column(length = 10)
	@Enumerated(EnumType.STRING)
	private SelItmCd selItmCd;
	
	@Column(length = 100)
	private String selItmCtt;
	
	@Column(length = 50)
	private String selSrchCond;
	
	@Column(length = 50)
	private String selSrchKey;
	
	@Column(length = 100)
	private String prtItmDisp;
	
	@Column(length = 100)
	private String prtSelMapp;
	
	@Column(length = 10)
	@Enumerated(EnumType.STRING)
	private ExecClCd execClCd;
	
	@Column(length = 1000)
	private String execDtlCtt;  
	
	
	@Transient	
	private String planItmLclCdNm;
	
	@Transient	
	private Integer planItmLclDispSeq;
	
	@Transient	
	private String planItmMclCdNm;
	
	@Transient	
	private Integer planItmMclDispSeq;
	
	@Transient	
	private String creClCdNm;	
	public String getCreClCdNm() {
		return Utils.getEnumValue(CreClCd.class, creClCd);
	}
	
	@Transient	
	private String planItmTypCdNm;	
	public String getPlanItmTypCdNm() {
		return Utils.getEnumValue(PlanItmTypCd.class, planItmTypCd);
	}
	
	@Transient	
	private String prodRelCdNm;	
	public String getProdRelCdNm() {
		return Utils.getEnumValue(ProdRelCd.class, prodRelCd);
	}
	
	@Transient	
	private String insMthdCdNm;	
	public String getInsMthdCdNm() {
		return Utils.getEnumValue(InsMthdCd.class, insMthdCd);
	}
	
	@Transient	
	private String insValTypCdNm;	
	public String getInsValTypCdNm() {
		return Utils.getEnumValue(InsValTypCd.class, insValTypCd);
	}
	
	@Transient	
	private String insValUnitCdNm;	
	public String getInsValUnitCdNm() {
		return Utils.getEnumValue(InsValUnitCd.class, insValUnitCd);
	}
	
	@Transient	
	private String selItmCdNm;	
	public String getSelItmCdNm() {
		return Utils.getEnumValue(SelItmCd.class, selItmCd);
	}
	
	@Transient	
	private String execClCdNm;	
	public String getExecClCdNm() {
		return Utils.getEnumValue(ExecClCd.class, execClCd);
	}
	
	
}
