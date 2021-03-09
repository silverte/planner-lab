package com.skt.swing.mcatalog.context.planner.domain.core.service;

import java.util.List;

import com.skt.swing.mcatalog.context.planner.domain.application_port.PlannerServicePort;
import com.skt.swing.mcatalog.context.planner.domain.core.model.Planner;
import com.skt.swing.mcatalog.context.planner.domain.core.model.SampleAggregate;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypCd;
import com.skt.swing.mcatalog.context.planner.domain.infra_port.PlannerPersistentPort;

import org.springframework.beans.factory.annotation.Autowired;

public class PlannerService implements PlannerServicePort {

	private PlannerPersistentPort plannerPersistentPort;

	@Autowired
    public PlannerService(PlannerPersistentPort plannerPersistentPort) {
        this.plannerPersistentPort = plannerPersistentPort;
    }
    
    @Override
    public List<SampleAggregate> getSample(SampleAggregate query) {
        List<SampleAggregate> result = plannerPersistentPort.select(query);
        return result;
    }

	@Override
	public void savePlanItmInfo(Planner planner) {
		plannerPersistentPort.planItmSave(planner);
	}
	
	@Override
	public Long newId(String planItmTypCd) {
		return plannerPersistentPort.newId(planItmTypCd);
	}
    
}