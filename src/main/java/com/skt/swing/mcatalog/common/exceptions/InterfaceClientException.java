package com.skt.swing.mcatalog.common.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 외부 연동 오류
 * */
public class InterfaceClientException extends BaseException {

	private static final long serialVersionUID = -7851745191995195294L;

	private String orgExceptionCode;
	private String orgMessage;
	private String serviceId;
	private InterfaceType interfaceType;
	private List<Map<String,String>> errorStacks=new ArrayList<Map<String,String>>();

	public enum InterfaceType {
		SWING, EAI, ICAS, TID, SMS, IMAS, SEARCH, SKTEL, BANK, KCP, SNS, POST, MBR, TGATE
	};
	
	/**
	 * @param exceptionCode
	 * @deprecated InterfaceClientException(String exceptionCode, InterfaceType interfaceType) 사용
	 */
	@Deprecated
	public InterfaceClientException(String exceptionCode) {
		super(exceptionCode);
	}

	/**
	 * @param exceptionCode
	 *            예외 유형을 정의하는 코드.
	 * @param cause
	 *            최초 발생한 예외. 해당 예외는 기본 예외로 전환된다.
	 * @deprecated InterfaceClientException(String exceptionCode, InterfaceType interfaceType, Throwable cause) 사용
	 */
	@Deprecated
	@SuppressWarnings("all")
	public InterfaceClientException(String exceptionCode, Throwable cause) {
		super(exceptionCode, cause, null);
	}

	/**
	 * @param exceptionCode
	 *            예외 유형을 정의하는 코드.
	 * @param messageArgs
	 *            예외 메시지 변환에 사용되는 메시지 파라미터.
	 * @deprecated InterfaceClientException(String exceptionCode, InterfaceType interfaceType, String... messageArgs) 사용
	 */
	@Deprecated
	public InterfaceClientException(String exceptionCode, String... messageArgs) {
		super(exceptionCode, null, messageArgs);
	}
	
	/**
	 * @param exceptionCode 예외 유형을 정의하는 코드.
	 * @param interfaceType 예외 대상 인터페이스.
	 */
	public InterfaceClientException(String exceptionCode, InterfaceType interfaceType) {
		super(exceptionCode);
		this.interfaceType = interfaceType;
	}
	
	/**
	 * @param exceptionCode 예외 유형을 정의하는 코드.
	 * @param interfaceType 예외 대상 인터페이스.
	 * @param cause
	 */
	@SuppressWarnings("all")
	public InterfaceClientException(String exceptionCode, InterfaceType interfaceType, Throwable cause) {
		super(exceptionCode, cause, null);
		this.interfaceType = interfaceType;
	}
	
	/**
	 * @param exceptionCode 예외 유형을 정의하는 코드.
	 * @param interfaceType 예외 대상 인터페이스.
	 * @param messageArgs 예외 메시지 변환에 사용되는 메시지 파라미터.
	 */
	public InterfaceClientException(String exceptionCode, InterfaceType interfaceType, String... messageArgs) {
		super(exceptionCode, null, messageArgs);
		this.interfaceType = interfaceType;
	}

	public InterfaceType getInterfaceType() {
		return interfaceType;
	}

	public void setInterfaceType(InterfaceType interfaceType) {
		this.interfaceType = interfaceType;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getOrgExceptionCode() {
		return orgExceptionCode;
	}

	public void setOrgExceptionCode(String orgExceptionCode) {
		this.orgExceptionCode = orgExceptionCode;
	}

	public String getOrgMessage() {
		return orgMessage;
	}

	public void setOrgMessage(String orgMessage) {
		this.orgMessage = orgMessage;
	}

	public List<Map<String, String>> getErrorStacks() {
		return errorStacks;
	}

	public void setErrorStacks(List<Map<String, String>> errorStacks) {
		this.errorStacks = errorStacks;
	}
}
