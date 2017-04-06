package com.in28minutes.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionCpntroller {
	
	private Log logger = LogFactory.getLog(ExceptionCpntroller.class);
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(HttpServletRequest request, Exception ex){
		logger.error("Request " + request.getRequestURL() + " Threw an Exception", ex);
		return "error";
	}

}
