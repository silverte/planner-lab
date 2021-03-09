package com.skt.swing.mcatalog.context.planner.infra.persistent;

import java.util.ArrayList;
import java.util.List;

import com.skt.swing.mcatalog.context.planner.domain.core.model.Planner;
import com.skt.swing.mcatalog.context.planner.domain.core.model.SampleAggregate;
import com.skt.swing.mcatalog.context.planner.domain.infra_port.PlannerPersistentPort;
import com.skt.swing.mcatalog.context.planner.infra.persistent.MprdPlanItmLstRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlannerOracleRepository implements PlannerPersistentPort {

	@Autowired
	private MprdPlanItmLstRepository mprdPlanItmLstRepository;

	@Autowired
	private MprdPlanItmClLstRepository mprdPlanItmClLstRepository;
	
	
    @Override
    public List<SampleAggregate> select(SampleAggregate query) {

        List<SampleAggregate> result = new ArrayList<SampleAggregate>();

        result.add(new SampleAggregate("1"));
        result.add(new SampleAggregate("2"));
        result.add(new SampleAggregate("3"));

        return result;

        //return sqlSession.selectList("planner.SampleMapper.selectSampleList", query);
    }
    
	@Override
	public void planItmSave(Planner planner) {
		
		// planner정보 -> Entity로 세팅
		MprdPlanItmLst mprdPlanItmLst = PlanItmMapper.build(planner);
		
		mprdPlanItmLstRepository.save(mprdPlanItmLst);

	}

	@Override
	public Long newId(String planItmTypCd) {	
		return mprdPlanItmLstRepository.findNextKey(planItmTypCd);
	}
}