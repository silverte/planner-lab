package com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd;

import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.PlanItmCssInfo;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.SelItmCd;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Lov extends PlanItmCssInfo{

	private SelItmCd	selItmCd;	//선택항목
	private String		selItmCtt;	//선택항목내용
	private String		selSrchCond; //선택검색조건
	private String		selSrchKey;	//선택검색키
	private String		prtItmDisp;	//출력항목표시
	private String		prtSelMapp;	//출력선택매핑

	@Builder
	public Lov(String 	planItmId
			,InsMthdCd	insMthdCd
			,int		dispLocRow
			,int 		rdispLocCol
			,int		dispLocMrgCnt
			,int		dispLocColSeq
			,String	 	dispLblNm
			,Boolean 	dispItmHidYn
			,Boolean 	dispItmMndtYn
			,Boolean 	dispItmReadOnly
			,int		dispItmSize
			,String		dispItmIniVal
			,String		dispObjClas
			,String		dispObjStyl
			,String		dispItmDesc
			,SelItmCd	selItmCd
			,String 	selItmCtt
			,String		selSrchCond
			,String		selSrchKey
			,String		prtItmDisp
			,String		prtSelMapp) {
		
		super(planItmId,insMthdCd,dispLocRow,rdispLocCol,dispLocMrgCnt,dispLocColSeq,dispLblNm,dispItmHidYn
			 ,dispItmMndtYn,dispItmReadOnly,dispItmSize,dispItmIniVal,dispObjClas,dispObjStyl,dispItmDesc);
		this.selItmCd		= selItmCd;
		this.selItmCtt		= selItmCtt;
		this.selSrchCond	= selSrchCond;
		this.selSrchKey		= selSrchKey;
		this.prtItmDisp		= prtItmDisp;
		this.prtSelMapp		= prtSelMapp;
	}
	
}
