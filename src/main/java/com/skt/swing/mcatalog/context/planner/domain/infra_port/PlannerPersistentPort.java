package com.skt.swing.mcatalog.context.planner.domain.infra_port;

import java.util.List;

import com.skt.swing.mcatalog.context.planner.domain.core.model.Planner;
import com.skt.swing.mcatalog.context.planner.domain.core.model.SampleAggregate;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypCd;

public interface PlannerPersistentPort {

    public List<SampleAggregate> select(SampleAggregate query);
    public void planItmSave(Planner planner);
    public Long newId(String planItmTypCd);
}