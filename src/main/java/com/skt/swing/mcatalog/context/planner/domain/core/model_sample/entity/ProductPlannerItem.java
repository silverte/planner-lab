package com.skt.swing.mcatalog.context.planner.domain.core.model_sample.entity;

import java.util.List;

import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo.ProductPlannerAuditVo;
import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo.ProductPlanItemClCdVo;
import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo.ProductPlanItemCreateClCdEnum;
import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo.ProductRelationCdEnum;

import lombok.Data;

@Data
public class ProductPlannerItem {

    private String productPlanItemId; // Key?

    private String productPlanItemName;

    private String supPlanItemId; // 이건 멀 의미하지?

    private ProductPlanItemCreateClCdEnum productPlanItemCreateClCdEnum;
    
    private List<ProductPlanItemClCdVo> productPlanItemClCdVoList;

    private String sclDisplaySequence;
    
    private ProductRelationCdEnum productRelationCdEnum;

    private List<ProductPlanItemCl> productPlanItemClList; //ProductPlannerItemCl 는 Entity 인가 Vo 인가? 일단은 Entity

    private boolean infoItemYn;

    private boolean useYn;

    private ProductPlannerAuditVo productPlannerAuditVo;

    
}