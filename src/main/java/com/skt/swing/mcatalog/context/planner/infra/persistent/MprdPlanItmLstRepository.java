/******************************************************************************
 * 프로그램명	: 기획항목리스트 Repository
 * 설명           : 기획항목리스트 엔티티에 접근 하기 위한 소스
 * ProgramID: MprdPlanItmLstRepository.java
 * 작성자		: P123113
 * 작성일		: 2019-11-25
 * 변경로그	:
 * CHG-CD   :   성명         :   반영일자              :   변경 내용
 * ---------- -------------- ------------- ------------------------------------  
 * ver1.01  : P156920   : 2020.05.08      : 1) planItmId Type변경(NUMBER->VARCHAR) 
 *-----------------------------------------------------------------------------
*******************************************************************************/
package com.skt.swing.mcatalog.context.planner.infra.persistent;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.skt.swing.mcatalog.context.planner.infra.persistent.MprdPlanItmLst;
import com.skt.swing.mcatalog.context.planner.domain.core.model.enums.PlanItmTypCd;

@RepositoryRestResource
@SuppressWarnings("unchecked")
public interface MprdPlanItmLstRepository extends PagingAndSortingRepository<MprdPlanItmLst, Long>, QuerydslPredicateExecutor<MprdPlanItmLst> {
	@Query("SELECT NVL(max(to_number(substr(planItmId,5,10)))+1,100000) FROM MprdPlanItmLst WHERE substr(planItmId,1,4) = :planItmTypCd")
	Long findNextKey(@Param("planItmTypCd") String planItmTypCd);
}
