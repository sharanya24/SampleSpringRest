package com.cultuzz.accounting.ws.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cultuzz.accounting.beans.Currency;
import com.cultuzz.accounting.service.CurrencyService;

@RestController
@RequestMapping("currencies")
public class CurrencyResource {

	@Autowired
	private CurrencyService currencyService;
	
	
	
	@RequestMapping(value= "/" , method=RequestMethod.GET)
	public List<Currency> getAllCurrencies(){
		
		return currencyService.getAllCurrencies();
	}
	
	// to handler exceptions directly without aop
	
//	@ExceptionHandler(NullPointerException.class)
//
//	public ResponseEntity<ClientErrorInformation> rulesForCustomerNotFound(HttpServletRequest req, Exception e) 
//
//	{
//
//	ClientErrorInformation error = new ClientErrorInformation(e.toString(), req.getRequestURI());
//
//	return new ResponseEntity<ClientErrorInformation>(error, HttpStatus.NOT_FOUND);
//
//	}
//	
	
}
