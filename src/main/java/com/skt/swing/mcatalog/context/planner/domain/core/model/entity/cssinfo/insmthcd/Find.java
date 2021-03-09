package com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd;

import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.PlanItmCssInfo;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.ExecClCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Find extends PlanItmCssInfo{
	private ExecClCd	execClCd;	//실행구분
	private String		execDtlCtt;	//실행상세내용
	private String		prtSelMapp;	//출력선택매핑

	@Builder
	public Find(String 		planItmId
			   ,InsMthdCd	insMthdCd
			   ,int			dispLocRow
			   ,int 		rdispLocCol
			   ,int			dispLocMrgCnt
			   ,int			dispLocColSeq
			   ,String		dispLblNm
			   ,Boolean 	dispItmHidYn
			   ,Boolean 	dispItmMndtYn
			   ,Boolean 	dispItmReadOnly
			   ,int			dispItmSize
			   ,String		dispItmIniVal
			   ,String		dispObjClas
			   ,String		dispObjStyl
			   ,String		dispItmDesc
			   ,ExecClCd	execClCd
			   ,String		execDtlCtt
			   ,String		prtSelMapp) {
	
		super(planItmId,insMthdCd,dispLocRow,rdispLocCol,dispLocMrgCnt,dispLocColSeq,dispLblNm,dispItmHidYn
			 ,dispItmMndtYn,dispItmReadOnly,dispItmSize,dispItmIniVal,dispObjClas,dispObjStyl,dispItmDesc);
		this.execClCd	= execClCd;
		this.execDtlCtt	= execDtlCtt;
		this.prtSelMapp	= prtSelMapp;	
	}
	
}
