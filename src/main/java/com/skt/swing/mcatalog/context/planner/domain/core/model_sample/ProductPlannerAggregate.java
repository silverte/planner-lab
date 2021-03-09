package com.skt.swing.mcatalog.context.planner.domain.core.model_sample;

import java.util.List;

import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.entity.ProductPlannerItem;
import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo.ProductPlannerTypeCdEnum;
import com.skt.swing.mcatalog.context.planner.domain.core.model_sample.vo.ProductPlannerTypeDetailCdEnum;

import io.swagger.annotations.ApiParam;
import lombok.Builder;
import lombok.Data;

@Data
public class ProductPlannerAggregate {

    private ProductPlannerTypeCdEnum productPlannerTypeCdEnum;
    private ProductPlannerTypeDetailCdEnum productPlannerTypeDetailCdEnum;

    List<ProductPlannerItem> productPlannerItemList;


    @Builder
    public ProductPlannerAggregate(String productPlannerTypeCd) {

        productPlannerTypeCdEnum = ProductPlannerTypeCdEnum.valueOf(productPlannerTypeCd);
        
    }
}