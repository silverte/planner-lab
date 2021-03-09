package com.skt.swing.mcatalog.context.planner.application.dto_sample;

import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.ProductPlannerAggregate;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetRequestDTO {

    private String planItmTypCd;

    @ApiParam(hidden=true)
    public Object getProductPlannerAggregateForQuery(){
        return ProductPlannerAggregate.builder()
            .productPlannerTypeCd(this.planItmTypCd)
            .build();
    }
}

// {
//     "auditDtm": "2020-06-15T01:15:13.059Z",
//     "auditId": "lab_usr",
//     "creClCd": "INPT",
//     "dispItmDesc": "string",
//     "dispItmHidYn": "Y",
//     "dispItmIniVal": "string",
//     "dispItmMndtYn": "Y",
//     "dispItmReadOnly": "Y",
//     "dispItmSize": 0,
//     "dispLblNm": "string",
//     "dispLocCol": 0,
//     "dispLocColSeq": 0,
//     "dispLocMrgCnt": 0,
//     "dispLocRow": 0,
//     "dispObjClas": "string",
//     "dispObjStyl": "string",
//     "dispPrtForm": "string",
//     "execClCd": "NONE",
//     "execDtlCtt": "string",
//     "infoItmYn": "Y",
//     "insMinLeng": 0,
//     "insMthdCd": "NONE",
//     "insValLeng": 0,
//     "insValTypCd": "NONE",
//     "insValUnitCd": "NONE",
//     "planItmId": "INSU100006",
//     "planItmLclCd": "A0000",
//     "planItmMclCd": "A1000",
//     "planItmNm": "lab_기획항목저장테스트",
//     "planItmTypCd": "INSU",
//     "planItmTypDtlCd": "NONE",
//     "prodRelCd": "ORG",
//     "prtItmDisp": "string",
//     "prtSelMapp": "string",
//     "sclDispSeq": 3,
//     "selItmCd": "NONE",
//     "selItmCtt": "string",
//     "selSrchCond": "string",
//     "selSrchKey": "string",
//     "supPlanItmId": "string",
//     "useYn": "Y"
//   }