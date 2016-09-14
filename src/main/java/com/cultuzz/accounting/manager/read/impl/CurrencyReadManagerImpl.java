package com.cultuzz.accounting.manager.read.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cultuzz.accounting.beans.Currency;
import com.cultuzz.accounting.dao.CurrencyDAO;
import com.cultuzz.accounting.manager.read.CurrencyReadManager;

@Component
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class CurrencyReadManagerImpl implements CurrencyReadManager{

	private CurrencyDAO currencyDAO;

	public CurrencyDAO getCurrencyDAO() {
		return currencyDAO;
	}

	@Autowired
	public void setCurrencyDAO(CurrencyDAO currencyDAO) {
		this.currencyDAO = currencyDAO;
	}

	@Override
	public List<Currency> getAllCurrencies() {
		
		return getCurrencyDAO().fetchAllCurrencies();
		
	}

}
