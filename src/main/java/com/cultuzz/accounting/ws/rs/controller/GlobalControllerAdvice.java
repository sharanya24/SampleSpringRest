package com.cultuzz.accounting.ws.rs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cultuzz.accounting.beans.ClientErrorInformation;
import com.cultuzz.accounting.exception.DataAccessException;
import com.cultuzz.accounting.exception.DataNotFoundException;
import com.cultuzz.accounting.exception.InValidInputException;

@ControllerAdvice(basePackages = { "com.cultuzz.accounting.ws.rs.controller" })
public class GlobalControllerAdvice {

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<ClientErrorInformation> dataNotFound(
			HttpServletRequest req, DataNotFoundException ex)

	{

		System.out.println("control came");
		System.out.println(req.getRequestURI());
		ClientErrorInformation error = new ClientErrorInformation(
				ex.getLocalizedMessage(), req.getRequestURI());

		return new ResponseEntity<ClientErrorInformation>(error,
				HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler(InValidInputException.class)
	public ResponseEntity<ClientErrorInformation> invalidInput(
			HttpServletRequest req, InValidInputException ex)

	{

		System.out.println("control came");
		System.out.println(req.getRequestURI());
		ClientErrorInformation error = new ClientErrorInformation(
				ex.getLocalizedMessage(), req.getRequestURI());

		return new ResponseEntity<ClientErrorInformation>(error,
				HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(DataAccessException.class)
	public ResponseEntity<ClientErrorInformation> dataAccessException(
			HttpServletRequest req, DataAccessException ex)

	{

		System.out.println("control came");
		System.out.println(req.getRequestURI());
		ClientErrorInformation error = new ClientErrorInformation(
				ex.getLocalizedMessage(), req.getRequestURI());

		return new ResponseEntity<ClientErrorInformation>(error,
				HttpStatus.BAD_REQUEST);

	}

}
