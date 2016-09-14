package com.cultuzz.accounting.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.beans.CultswitchNewTariffHistory;
import com.cultuzz.accounting.dao.AbstractDAO;
import com.cultuzz.accounting.dao.CultSwitchNewTariffDAO;

@Repository
public class CultSwitchNewTariffDAOImpl extends AbstractDAO implements CultSwitchNewTariffDAO {

	@Override
	public List<CultswitchNewTariff> fetchAllCultSwitchNewTariffs() {
		List<CultswitchNewTariff> beanCultSwitchNewTariffs = null;
		
		Session session = getReadSession();
		Criteria criteria = session.createCriteria(com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff.class);
		
		@SuppressWarnings("unchecked")
		List<com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff> hbmCultswitchNewTariffs = criteria.list();
		
		if(hbmCultswitchNewTariffs != null && !hbmCultswitchNewTariffs.isEmpty()){
			beanCultSwitchNewTariffs = new ArrayList<CultswitchNewTariff>();
			
			for (com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff hbmCultswitchNewTariff : hbmCultswitchNewTariffs) {
				
				CultswitchNewTariff beanCultswitchNewTariff = getBeanFactory().getCultswitchNewTariff();
				
				beanCultswitchNewTariff.setId(hbmCultswitchNewTariff.getId());
				beanCultswitchNewTariff.setCurrency(hbmCultswitchNewTariff.getCurrency());
				beanCultswitchNewTariff.setCommission(hbmCultswitchNewTariff.getCommission());
				beanCultswitchNewTariff.setEndDate(hbmCultswitchNewTariff.getEndDate());
				beanCultswitchNewTariff.setMinimumValue(hbmCultswitchNewTariff.getMinimumValue());
				beanCultswitchNewTariff.setMaximumValue(hbmCultswitchNewTariff.getMaximumValue());
				beanCultswitchNewTariff.setCreatorUserId(hbmCultswitchNewTariff.getCreatorUserId());
				beanCultswitchNewTariff.setLastUpdated(hbmCultswitchNewTariff.getLastUpdated());
				
				beanCultSwitchNewTariffs.add(beanCultswitchNewTariff);
			}
			
		}
		
		return beanCultSwitchNewTariffs;
	}

	@Override
	public CultswitchNewTariff fetchCultSwitchNewTariff(
			Integer cultswitchNewTariffId) {
		CultswitchNewTariff beanCultswitchNewTariff = null;
		
		Session session = getReadSession();
		Criteria criteria = session.createCriteria(com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff.class);
		
		criteria.add(Restrictions.eq("id", cultswitchNewTariffId));
		
		com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff hbmCultswitchNewTariff = (com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff)criteria.uniqueResult();
		
		if(hbmCultswitchNewTariff != null){
			beanCultswitchNewTariff = getBeanFactory().getCultswitchNewTariff();
			
			beanCultswitchNewTariff.setId(hbmCultswitchNewTariff.getId());
			beanCultswitchNewTariff.setCurrency(hbmCultswitchNewTariff.getCurrency());
			beanCultswitchNewTariff.setCommission(hbmCultswitchNewTariff.getCommission());
			beanCultswitchNewTariff.setEndDate(hbmCultswitchNewTariff.getEndDate());
			beanCultswitchNewTariff.setMinimumValue(hbmCultswitchNewTariff.getMinimumValue());
			beanCultswitchNewTariff.setMaximumValue(hbmCultswitchNewTariff.getMaximumValue());
			beanCultswitchNewTariff.setCreatorUserId(hbmCultswitchNewTariff.getCreatorUserId());
			beanCultswitchNewTariff.setLastUpdated(hbmCultswitchNewTariff.getLastUpdated());
			
		}
		
		return beanCultswitchNewTariff;
	}

	@Override
	public CultswitchNewTariff fetchCultSwitchNewTariffByCurrency(
			String currency) {
CultswitchNewTariff beanCultswitchNewTariff = null;
		
		Session session = getReadSession();
		Criteria criteria = session.createCriteria(com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff.class);
		
		criteria.add(Restrictions.eq("currency", currency));
		
		com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff hbmCultswitchNewTariff = (com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff)criteria.uniqueResult();
		
		if(hbmCultswitchNewTariff != null){
			beanCultswitchNewTariff = getBeanFactory().getCultswitchNewTariff();
			
			beanCultswitchNewTariff.setId(hbmCultswitchNewTariff.getId());
			beanCultswitchNewTariff.setCurrency(hbmCultswitchNewTariff.getCurrency());
			beanCultswitchNewTariff.setCommission(hbmCultswitchNewTariff.getCommission());
			beanCultswitchNewTariff.setEndDate(hbmCultswitchNewTariff.getEndDate());
			beanCultswitchNewTariff.setMinimumValue(hbmCultswitchNewTariff.getMinimumValue());
			beanCultswitchNewTariff.setMaximumValue(hbmCultswitchNewTariff.getMaximumValue());
			beanCultswitchNewTariff.setCreatorUserId(hbmCultswitchNewTariff.getCreatorUserId());
			beanCultswitchNewTariff.setLastUpdated(hbmCultswitchNewTariff.getLastUpdated());
			
		}
		
		return beanCultswitchNewTariff;
	}

	@Override
	public List<CultswitchNewTariffHistory> fetchAllCultSwitchNewTariffHistories() {
		List<CultswitchNewTariffHistory> beanCultSwitchNewTariffHistories = null;
		
		Session session = getReadSession();
		Criteria criteria = session.createCriteria(com.cultuzz.accounting.hbm.accounting.CultswitchNewTariffHistory.class);
		
		@SuppressWarnings("unchecked")
		List<com.cultuzz.accounting.hbm.accounting.CultswitchNewTariffHistory> hbmCultswitchNewTariffHistories = criteria.list();
		
		if(hbmCultswitchNewTariffHistories != null && !hbmCultswitchNewTariffHistories.isEmpty()){
			beanCultSwitchNewTariffHistories = new ArrayList<CultswitchNewTariffHistory>();
			
			for (com.cultuzz.accounting.hbm.accounting.CultswitchNewTariffHistory hbmCultswitchNewTariffHistory : hbmCultswitchNewTariffHistories) {
				
				CultswitchNewTariffHistory beanCultswitchNewTariffHistory = getBeanFactory().getCultswitchNewTariffHistory();
				
				beanCultswitchNewTariffHistory.setId(hbmCultswitchNewTariffHistory.getId());
				beanCultswitchNewTariffHistory.setCurrency(hbmCultswitchNewTariffHistory.getCurrency());
				beanCultswitchNewTariffHistory.setCommission(hbmCultswitchNewTariffHistory.getCommission());
				beanCultswitchNewTariffHistory.setEndDate(hbmCultswitchNewTariffHistory.getEndDate());
				beanCultswitchNewTariffHistory.setMinimumValue(hbmCultswitchNewTariffHistory.getMinimumValue());
				beanCultswitchNewTariffHistory.setMaximumValue(hbmCultswitchNewTariffHistory.getMaximumValue());
				beanCultswitchNewTariffHistory.setCreatorUserId(hbmCultswitchNewTariffHistory.getCreatorUserId());
				beanCultswitchNewTariffHistory.setCreatedTime(hbmCultswitchNewTariffHistory.getCreatedTime());
				beanCultswitchNewTariffHistory.setLastUpdated(hbmCultswitchNewTariffHistory.getLastUpdated());
				
				beanCultSwitchNewTariffHistories.add(beanCultswitchNewTariffHistory);
			}
			
		}
		
		return beanCultSwitchNewTariffHistories;
	}

}
