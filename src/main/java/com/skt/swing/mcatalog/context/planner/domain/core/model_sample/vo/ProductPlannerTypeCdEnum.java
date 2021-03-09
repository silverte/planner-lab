package com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ProductPlannerTypeCdEnum {

    INSU("INSU"), 
    CLUB("CLUB");

    private String type;

    private ProductPlannerTypeCdEnum(String type){
        this.type = type;
    }
}