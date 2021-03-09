package com.skt.swing.mcatalog.common.exceptions;

/**
 *  BizException
 */
public class BizException extends BaseException {

	private static final long serialVersionUID = 2637926937069390865L;

	public BizException(String exceptionCode) {
		super(exceptionCode);
	}

	/**
	 * @param exceptionCode
	 *            예외 유형을 정의하는 코드.
	 * @param cause
	 *            최초 발생한 예외. 해당 예외는 기본 예외로 전환된다.
	 */
	@SuppressWarnings("all")
	public BizException(String exceptionCode, Throwable cause) {
		super(exceptionCode, cause,null  );
	}

	/**
	 * @param exceptionCode
	 *            예외 유형을 정의하는 코드.
	 * @param messageArgs
	 *            예외 메시지 변환에 사용되는 메시지 파라미터.
	 */
	public BizException(String exceptionCode, String... messageArgs) {
		super(exceptionCode, null,messageArgs  );
	}

	/**
	 * @param exceptionCode 예외 유형을 정의하는 코드.
	 * @param messageArgs   예외 메시지 변환에 사용되는 메시지 파라미터.
	 */
	public BizException(String exceptionCode, Object... messageArgs) {
		super(exceptionCode, null, messageArgs);
	}
}
