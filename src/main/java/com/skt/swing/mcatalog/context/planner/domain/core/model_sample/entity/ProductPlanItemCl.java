package com.skt.swing.mcatalog.context.planner.domain.core.model_sample.entity;

import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo.ProductPlannerAuditVo;

import lombok.Data;

@Data
public class ProductPlanItemCl {
    
    private String productPlanItemClCd;
    private String productPlanItemClName;
    private String clDistSequence;

    private boolean userYn;
    
    private ProductPlannerAuditVo productPlannerAuditVo;
}