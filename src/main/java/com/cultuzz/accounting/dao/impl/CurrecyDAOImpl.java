package com.cultuzz.accounting.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Repository;

import com.cultuzz.accounting.beans.Currency;
import com.cultuzz.accounting.dao.AbstractDAO;
import com.cultuzz.accounting.dao.CurrencyDAO;
	
@Repository
public class CurrecyDAOImpl extends AbstractDAO implements CurrencyDAO {
	

	@Override
	public List<Currency> fetchAllCurrencies() {
		
		List<Currency> beanCurrencies = null;
		
		Session session = getReadSession();
		
		Criteria criteria = session.createCriteria(com.cultuzz.accounting.hbm.accounting.Currency.class);
		
		@SuppressWarnings("unchecked")
		List<com.cultuzz.accounting.hbm.accounting.Currency> list = criteria.list();
		
		if(list != null && !list.isEmpty()){
			beanCurrencies = new ArrayList<Currency>();
			for (com.cultuzz.accounting.hbm.accounting.Currency hbmCurrency : list) {
				Currency beanCurrency = getBeanFactory().getCurrency();
				beanCurrency.setId(hbmCurrency.getId());
				beanCurrency.setName(hbmCurrency.getName());
				beanCurrency.setShortName(hbmCurrency.getShortName());
				beanCurrency.setSymbol(hbmCurrency.getSymbol());
				beanCurrency.setLastUpdated(hbmCurrency.getLastUpdated());
				
				beanCurrencies.add(beanCurrency);
			}
		}
		
		return beanCurrencies;
	}

}
