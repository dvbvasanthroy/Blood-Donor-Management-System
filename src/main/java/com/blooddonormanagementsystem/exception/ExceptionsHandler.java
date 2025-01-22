package com.blooddonormanagementsystem.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public String userRegistrationExceptionHandler(DataIntegrityViolationException violationException, Model model) {
		model.addAttribute("exceptionmsg", "Mobile number or Email Id already in use");
		return "Registration";
	}
	
	@ExceptionHandler(UserException.class)
	public String userLoginExceptionHandler(UserException userException, Model model) {
		model.addAttribute("exceptionmsg", userException.getExceptionMessage());
		return "Login";
	}
}
