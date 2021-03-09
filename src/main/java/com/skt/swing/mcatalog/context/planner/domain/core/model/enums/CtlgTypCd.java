/******************************************************************************
 * 프로그램명	: 상품유형  코드
 * 설명           : Planner API에서 공통으로 사용하는 코드목록
 * ProgramID: CtlgTypCd.java
 * 작성자		: P156920
 * 작성일		: 2020-06-19
 * 변경로그	:
 * CHG-CD   :   성명         :   반영일자              :   변경 내용
 * ---------- -------------- ------------- ------------------------------------  
 *
 *-----------------------------------------------------------------------------
*******************************************************************************/
package com.skt.swing.mcatalog.context.planner.domain.core.model.enums;

import com.sktelecom.swingmsa.mcatalog.context.base.enums.EnumModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CtlgTypCd implements EnumModel {
	INSU("보험상품"),
	CLUB("클럽상품");
//	B2B1("IoT선납요금제");
	
	private String value;
	
	@Override
	public String getKey() {
		return name();
	}
	
	@Override
	public String getValue() {
		return value;
	}
}
