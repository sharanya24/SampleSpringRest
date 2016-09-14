package com.cultuzz.accounting.beans;

public class ClientErrorInformation {
	
	private String error;
	private String uri;
	
	public ClientErrorInformation() {
		// TODO Auto-generated constructor stub
	}

	public ClientErrorInformation(String error, String uri) {
		super();
		this.error = error;
		this.uri = uri;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorCode() {
		return uri;
	}

	public void setErrorCode(String errorCode) {
		this.uri = errorCode;
	}
	
	
	
}
