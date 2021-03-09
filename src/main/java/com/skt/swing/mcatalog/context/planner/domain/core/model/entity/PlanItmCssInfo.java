package com.skt.swing.mcatalog.context.planner.domain.core.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.InsMthdCd;

@Getter
@Setter
@ToString
public class PlanItmCssInfo{
//  [Planner CSS 디폴트 정보]	
	private String		planItmId;			//기획항목ID
	private InsMthdCd	insMthdCd;			//입력방식코드
	private int			dispLocRow;			//표시위치행
	private int 		rdispLocCol;		//표시위치열
	private int			dispLocMrgCnt;		//표시위치병합건
	private int			dispLocColSeq;		//표시위치열순번
	private String		dispLblNm;			//표시레이블명
	private Boolean		dispItmHidYn;		//표시항목숨김여부
	private Boolean		dispItmMndtYn;		//표시항목필수여부
	private Boolean  	dispItmReadOnly;	//표시항목읽기전용
	private int			dispItmSize;		//표시항목크기
	private String		dispItmIniVal;		//표시항목초기값
	private String		dispObjClas;		//표시객체클래스
	private String		dispObjStyl;		//표시객체스타일
	private String		dispItmDesc;		//표시항목설명
	
	public PlanItmCssInfo(String 	planItmId
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
						,String		dispItmDesc) {
		
		this.planItmId		= planItmId;
		this.insMthdCd		= insMthdCd;
		this.dispLocRow		= dispLocRow;
		this.rdispLocCol	= rdispLocCol;
		this.dispLocMrgCnt	= dispLocMrgCnt;
		this.dispLocColSeq	= dispLocColSeq;
		this.dispLblNm		= dispLblNm;
		this.dispItmHidYn	= dispItmHidYn;
		this.dispItmMndtYn	= dispItmMndtYn;
		this.dispItmReadOnly= dispItmReadOnly;
		this.dispItmSize	= dispItmSize;
		this.dispItmIniVal	= dispItmIniVal;
		this.dispObjClas	= dispObjClas;
		this.dispObjStyl	= dispObjStyl;
		this.dispItmDesc	= dispObjStyl;	
	}
	
	/*Builder 사용 안했을시
	public static PlanItmCssInfo build(PlanItmRequestDTO params) {

		PlanItmCssInfo planItmCssInfo = new PlanItmCssInfo(params.getPlanItmId()
												  		 , params.getInsMthdCd()
												  		 , params.getDispLocRow()
												  		 , params.getDispLocCol()
												  		 , params.getDispLocMrgCnt()
												  		 , params.getDispLocColSeq()
												  		 , params.getDispLblNm()
												  		 , params.getDispItmHidYn()
												  		 , params.getDispItmMndtYn()
												  		 , params.getDispItmReadOnly()
												  		 , params.getDispItmSize()
												  		 , params.getDispItmIniVal()
												  		 , params.getDispObjClas()
												  		 , params.getDispObjStyl()
												  		 , params.getDispItmDesc());

		return planItmCssInfo;
	}*/

}

