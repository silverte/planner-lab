package com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ProductPlanItemCreateClCdEnum {

    INPUT("INPUT"), 
    AUTO("AUTO");

    private String type;

    private ProductPlanItemCreateClCdEnum(String type){
        this.type = type;
    }
}