package com.skt.swing.mcatalog.context.planner.domain.core.model.entity;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlanItmCl {
//	[기획항목 분류목록]
	private String		planItmClCd;	//기획항목분류코드
	private String		auditId;		//최종변경자ID
	private Date 		auditDtm;		//최종변경일시
	private String		planItmClNm;	//기획항목분류명
	private int			clDispSeq;		//분류표시순번
	private Boolean		useYn;			//사용여부
	
	@Builder
	public PlanItmCl( String	planItmClCd	
					, String	auditId		
					, Date 		auditDtm
					, String	planItmClNm	
					, int		clDispSeq		
					, Boolean	useYn		) {
		this.planItmClCd	= planItmClCd;
		this.auditId		= auditId;
		this.auditDtm		= auditDtm;
		this.planItmClNm	= planItmClNm;
		this.clDispSeq		= clDispSeq;
		this.useYn			= useYn;
	}
	
	/*Builder 사용 안했을시
	public static PlanItmCl build(PlanItmRequestDTO params) {
		PlanItmCl planItmCl = new PlanItmCl(params.getPlanItmClCd()
										  , params.getAuditId()
										  , params.getAuditDtm()
										  , params.getPlanItmClNm()
										  , params.getClDispSeq()
										  , params.getUseYn());
		return planItmCl;		
		
	}*/

}
