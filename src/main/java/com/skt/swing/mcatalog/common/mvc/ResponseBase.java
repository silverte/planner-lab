package com.skt.swing.mcatalog.common.mvc;

import java.util.HashMap;

import com.skt.swing.mcatalog.common.exceptions.BizException;
import com.skt.swing.mcatalog.common.exceptions.InterfaceClientException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


public class ResponseBase {
	
	// public static <T> T ok() {
	//     return ResponseBase.of(new ErrorVo(), MediaType.APPLICATION_JSON_VALUE, HttpStatus.OK);
	// }
	
	public static <T> T ok(Object object) {
	    return ResponseBase.of(object, MediaType.APPLICATION_JSON_VALUE, HttpStatus.OK);
	}

	public static <T> T of(Object object) {
	    return ResponseBase.of(object, MediaType.APPLICATION_JSON_VALUE, HttpStatus.OK);
	}

	public static <T> T of(Object object, HttpStatus httpStatus) {
		return ResponseBase.of(object, MediaType.APPLICATION_JSON_VALUE, httpStatus);
	}

	@SuppressWarnings("unchecked")
	public static <T> T of(Object object, String mediaType, HttpStatus httpStatus) {
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Type", mediaType);

		return (T) new ResponseEntity<Object>(object, headers, httpStatus);
	}

	@SuppressWarnings("all")
	public static <T> T error(BizException bizException) {
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);

		HashMap<String, Object> error = new HashMap<String, Object>();
	    HashMap<String, Object> item = new HashMap<String, Object>();
	    item.put("code", bizException.getExceptionCode());
	    item.put("message",bizException.getMessageArgs() );

	    error.put("error", item);

		return (T) new ResponseEntity<HashMap>(error, headers, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@SuppressWarnings("all")
	public static <T> T error(InterfaceClientException interfaceClientException) {
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);

		HashMap<String, Object> error = new HashMap<String, Object>();
	    HashMap<String, Object> item = new HashMap<String, Object>();
	    item.put("code", interfaceClientException.getExceptionCode());
	    item.put("message",interfaceClientException.getMessageArgs() );

	    error.put("error", item);

		return (T) new ResponseEntity<HashMap>(error, headers, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	// @SuppressWarnings("all")
	// public static <T> T error(ErrorVo errorVo) {
	// 	HttpHeaders headers = new HttpHeaders();
	//     headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);

	// 	HashMap<String, Object> error = new HashMap<String, Object>();
	//     HashMap<String, Object> item = new HashMap<String, Object>();
	//     item.put("code", errorVo.getCode());
	//     item.put("message",errorVo.getMessage());

	//     error.put("error", item);

	// 	return (T) new ResponseEntity<HashMap>(error, headers, HttpStatus.INTERNAL_SERVER_ERROR);
	// }

	@SuppressWarnings("unchecked")
	public static <T> T error(Object object) {
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);

		return (T) new ResponseEntity<Object>(object, headers, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
