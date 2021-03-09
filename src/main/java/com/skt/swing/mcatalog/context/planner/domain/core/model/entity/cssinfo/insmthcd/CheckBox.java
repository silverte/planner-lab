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
public class CheckBox extends PlanItmCssInfo{
	private SelItmCd	selItmCd;	//선택항목
	private String		selItmCtt;	//선택항목내용
	
	@Builder
	public CheckBox( String 	planItmId
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
					,String 	selItmCtt) {
		
		super(planItmId,insMthdCd,dispLocRow,rdispLocCol,dispLocMrgCnt,dispLocColSeq,dispLblNm,dispItmHidYn
			 ,dispItmMndtYn,dispItmReadOnly,dispItmSize,dispItmIniVal,dispObjClas,dispObjStyl,dispItmDesc);
		this.selItmCd	= selItmCd;
		this.selItmCtt	= selItmCtt;
	}

}
