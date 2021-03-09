package com.skt.swing.mcatalog.common.utils;

import org.springframework.context.support.MessageSourceAccessor;

public class MessageUtil {

	private static MessageSourceAccessor mssAcc = null;

	public static void setMessageSourceAccessor(MessageSourceAccessor messageSourceAccessor) {
		MessageUtil.mssAcc = messageSourceAccessor;
	}
	
	public static String get(String code, String... args) {
		return mssAcc.getMessage(code, args);
	}
	
	public static String get(String code, Object[] args) {
		return mssAcc.getMessage(code, args);
	}

}
