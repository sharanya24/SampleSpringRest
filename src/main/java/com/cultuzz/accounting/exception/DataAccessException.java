package com.cultuzz.accounting.exception;

public class DataAccessException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataAccessException(String errorMessage) {
		super(errorMessage);
	}
}
