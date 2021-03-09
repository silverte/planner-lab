package com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ProductPlannerTypeDetailCdEnum {

    NONE("NONE");

    private String cd;

    private ProductPlannerTypeDetailCdEnum(String cd){
        this.cd = cd;
    }
}