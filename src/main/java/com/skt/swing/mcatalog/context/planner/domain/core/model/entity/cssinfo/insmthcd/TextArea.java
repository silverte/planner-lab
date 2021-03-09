package com.skt.swing.mcatalog.context.planner.domain.core.model.entity.cssinfo.insmthcd;

import com.skt.swing.mcatalog.context.planner.domain.core.model.entity.PlanItmCssInfo;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValTypCd;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsValUnitCd;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TextArea extends PlanItmCssInfo{

	private InsValTypCd		insValTypCd;	//입력값타입
	private InsValUnitCd	insValUnitCd;	//입력값단위
	private int				insValLeng;		//입렵값최대길이
	private int				insMinLeng;		//입력값최소길이

	@Builder
	public TextArea( String 		planItmId
					 ,InsMthdCd		insMthdCd
					 ,int			dispLocRow
					 ,int 			rdispLocCol
					 ,int			dispLocMrgCnt
					 ,int			dispLocColSeq
					 ,String		dispLblNm
					 ,Boolean 		dispItmHidYn
					 ,Boolean 		dispItmMndtYn
					 ,Boolean 		dispItmReadOnly
					 ,int			dispItmSize
					 ,String		dispItmIniVal
					 ,String		dispObjClas
					 ,String		dispObjStyl
					 ,String		dispItmDesc
					 ,InsValTypCd	insValTypCd
					 ,InsValUnitCd	insValUnitCd
					 ,int			insValLeng
					 ,int			insMinLeng) {
		
		super(planItmId,insMthdCd,dispLocRow,rdispLocCol,dispLocMrgCnt,dispLocColSeq,dispLblNm,dispItmHidYn
			 ,dispItmMndtYn,dispItmReadOnly,dispItmSize,dispItmIniVal,dispObjClas,dispObjStyl,dispItmDesc);
		this.insValTypCd	= insValTypCd;
		this.insValUnitCd	= insValUnitCd;
		this.insValLeng		= insValLeng;
		this.insMinLeng		= insMinLeng;
	}

}
