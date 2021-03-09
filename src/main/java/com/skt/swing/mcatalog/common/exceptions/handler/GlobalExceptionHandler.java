package com.skt.swing.mcatalog.common.exceptions.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skt.swing.mcatalog.common.exceptions.BizException;
import com.skt.swing.mcatalog.common.exceptions.InterfaceClientException;
import com.skt.swing.mcatalog.common.exceptions.vo.SystemCommonError;
import com.skt.swing.mcatalog.common.mvc.ResponseBase;
import com.skt.swing.mcatalog.common.utils.MessageUtil;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice(value="${spring.application.base-package}", annotations=Controller.class)
@Slf4j
public class GlobalExceptionHandler {

	/**
	 * - VO Valid
	 * - Object Valid
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public Object methodArgumentNotValidExceptionHandler(HttpServletRequest request, HttpServletResponse response, MethodArgumentNotValidException e) throws Exception {

		log.error(e.getMessage(), e);

		String contentType = request.getHeader("accept");

		if(contentType!=null && contentType.contains(MediaType.APPLICATION_JSON_VALUE)){ 
			String code = "";
			return ResponseBase.error( new BizException( code, MessageUtil.get(code, e.toString(), e.getMessage()) ) );	
		} else { 
			String code = "";
			BizException bizException = new BizException( code, MessageUtil.get(code, e.toString(), e.getMessage()) );

			ModelAndView modelAndView = new ModelAndView("common/error/error-page");
			modelAndView.addObject("exception", bizException);
			return modelAndView;
		}
	}

	/**
	 * BizException
	 *
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = BizException.class)
	public Object bizExceptionErrorHandler(HttpServletRequest request, HttpServletResponse response, BizException e) throws Exception {

		log.error(e.getMessage(), e);

		String contentType = request.getHeader("accept");

		if(contentType!=null && contentType.contains(MediaType.APPLICATION_JSON_VALUE)){ 
			return ResponseBase.error( e );		
		} else { 
			ModelAndView modelAndView = new ModelAndView("common/error/error-page");
			modelAndView.addObject("exception", e);
			return modelAndView;
		}
	}

	/**
	 * InterfaceClientException
	 *
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = InterfaceClientException.class)
	public Object interfaceClientException(HttpServletRequest request, HttpServletResponse response, InterfaceClientException e) throws Exception {

		//TODO 유형에 따라 추가 처리가 필요하면 수정
			// if (e instanceof WebTException) {

			// } else if (e instanceof WebTServiceException) {

			// } else {

			// 	// messageArgs 에 메시지를 넘기는 경우 처리
			// 	if (e.getMessageArgs() != null && e.getExceptionCode().equals(e.getMessage())
			// 			&& e.getMessageArgs().length > 0) {
			// 		message = String.join(",", e.getMessageArgs());
			// 	}
			// }

		log.error(e.getMessage(), e);

		String contentType = request.getHeader("accept");
	
		if(contentType!=null && contentType.contains(MediaType.APPLICATION_JSON_VALUE)){ 
			return ResponseBase.error( e );
		} else { 
			ModelAndView modelAndView = new ModelAndView("common/error/error-page");
			modelAndView.addObject("exception", e);
			return modelAndView;
		}
	}

	@ExceptionHandler(value = Exception.class)
	public Object defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {

		log.error(e.getMessage(), e);

		String contentType = request.getHeader("accept");

		if(contentType!=null && contentType.contains(MediaType.APPLICATION_JSON_VALUE)){ 

			HttpStatus status = getStatus(request);

			String code = "";
			if (status.equals(HttpStatus.NOT_FOUND)) {
				code = SystemCommonError.NOT_FOUND.getCode();
			}
			else {
				code = SystemCommonError.SYSTEM_ERROR.getCode();
			}

			return ResponseBase.error( new BizException( code, MessageUtil.get(code, e.toString(), e.getMessage()) ) );
		
		} else { 
			BizException exception;

			HttpStatus status = getStatus(request);

			if (status.equals(HttpStatus.NOT_FOUND)) {
				String code = SystemCommonError.NOT_FOUND.getCode();
				exception = new BizException( code, MessageUtil.get(code, e.toString(), e.getMessage()) );
			} else {
				exception = getBizException(request);
			}

			response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

			ModelAndView modelAndView = new ModelAndView("common/error/error-page");
			modelAndView.addObject("exception", exception);
			return modelAndView;
		}
	}
	
	// private ErrorVo getDefaultErrorVo(Exception e) {
	// 	String code     = "ERROR.SYS.9999";
	// 	String message  = MessageUtil.get(code, e.toString(), e.getMessage());
	// 	ErrorVo errorVo = new ErrorVo(code, message);

	// 	log.error(e.getMessage(), e);

	// 	return errorVo;
	// }

	private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        } else {
            try {
                return HttpStatus.valueOf(statusCode);
            } catch (Exception var4) {
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }
        }
	}
	
	private BizException getBizException(HttpServletRequest request) {

        Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");

        BizException exception;
        if (throwable != null && throwable.getCause() != null && throwable.getCause() instanceof BizException) {
            exception = (BizException) throwable.getCause();
        } else {
			String code = SystemCommonError.SYSTEM_ERROR.getCode();
			exception = new BizException( code, MessageUtil.get(code));
        }

        return exception;
    }
}
