package com.cultuzz.accounting.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cultuzz.accounting.beans.Currency;
import com.cultuzz.accounting.manager.read.CurrencyReadManager;
import com.cultuzz.accounting.service.CurrencyService;

@Service
public class CurrencyServiceImpl implements CurrencyService{
	
	private CurrencyReadManager currencyReadManager;
	
	public CurrencyReadManager getCurrencyReadManager() {
		return currencyReadManager;
	}
	
	@Autowired
	public void setCurrencyReadManager(CurrencyReadManager currencyReadManager) {
		this.currencyReadManager = currencyReadManager;
	}

	@Override
	public List<Currency> getAllCurrencies() {
		
		List<Currency> currencies = getCurrencyReadManager().getAllCurrencies();
		
		
		
		return currencies;
		
		
	}
}
