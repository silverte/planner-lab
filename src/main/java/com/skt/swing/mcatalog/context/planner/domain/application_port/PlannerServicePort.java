package com.skt.swing.mcatalog.context.planner.domain.application_port;

import java.util.List;

import com.skt.swing.mcatalog.context.planner.domain.core.model.Planner;
import com.skt.swing.mcatalog.context.planner.domain.core.model.SampleAggregate;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypCd;


public interface PlannerServicePort {
    
    public List<SampleAggregate> getSample(SampleAggregate query); 
    public void savePlanItmInfo(Planner planner);
    public Long newId(String planItmTypCd);
}