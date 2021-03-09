/******************************************************************************
 * 프로그램명	: 기획항목분류목록 Repository
 * 설명           : 기획항목분류목록 엔티티에 접근 하기 위한 소스
 * ProgramID: MprdPlanItmClLstRepository.java
 * 작성자		: P123113
 * 작성일		: 2019-11-25
 * 변경로그	:
 * CHG-CD   :   성명         :   반영일자              :   변경 내용
 * ---------- -------------- ------------- ------------------------------------  
 *
 *-----------------------------------------------------------------------------
*******************************************************************************/
package com.skt.swing.mcatalog.context.planner.infra.persistent;

import java.util.List;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.skt.swing.mcatalog.context.planner.infra.persistent.MprdPlanItmClLst;


@RepositoryRestResource
public interface MprdPlanItmClLstRepository extends PagingAndSortingRepository<MprdPlanItmClLst, Long>, QuerydslPredicateExecutor<MprdPlanItmClLst> {

}
