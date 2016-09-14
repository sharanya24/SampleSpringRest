package com.cultuzz.accounting.exception;

public class InValidInputException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InValidInputException(String errorStr) {
		super(errorStr);
	}

}
