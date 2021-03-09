package com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ProductRelationCdEnum {

    ORIGINAL("ORG"), 
    RESERVATION("RSV"),
    TODAY_RESERVATION("TDAYRSV"),
    FORCE_REGISTER("FORCING"),
    RVI("RVI"),
    ;

    private String type;

    private ProductRelationCdEnum(String type){
        this.type = type;
    }
}