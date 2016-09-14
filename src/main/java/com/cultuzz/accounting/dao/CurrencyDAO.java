package com.cultuzz.accounting.dao;

import java.util.List;

import com.cultuzz.accounting.beans.Currency;

public interface CurrencyDAO {
	
	public List<Currency> fetchAllCurrencies();
	
}
