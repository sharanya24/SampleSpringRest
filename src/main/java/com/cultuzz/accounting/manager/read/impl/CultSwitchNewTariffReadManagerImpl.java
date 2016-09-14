package com.cultuzz.accounting.manager.read.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.beans.CultswitchNewTariffHistory;
import com.cultuzz.accounting.dao.CultSwitchNewTariffDAO;
import com.cultuzz.accounting.manager.read.CultSwitchNewTariffReadManager;

@Service
@Transactional(propagation=Propagation.SUPPORTS , readOnly=true)
public class CultSwitchNewTariffReadManagerImpl implements
		CultSwitchNewTariffReadManager {
	
	@Autowired
	private CultSwitchNewTariffDAO cultSwitchNewTariffDAO; 

	@Override
	public List<CultswitchNewTariff> getAllCultSwitchNewTariffs() {
		return cultSwitchNewTariffDAO.fetchAllCultSwitchNewTariffs();
	}

	@Override
	public CultswitchNewTariff getCultSwitchNewTariff(
			Integer cultswitchNewTariffId) {
		return cultSwitchNewTariffDAO.fetchCultSwitchNewTariff(cultswitchNewTariffId);
	}

	@Override
	public CultswitchNewTariff getCultSwitchNewTariffByCurrency(String currency) {
		return cultSwitchNewTariffDAO.fetchCultSwitchNewTariffByCurrency(currency);
	}

	@Override
	public List<CultswitchNewTariffHistory> getAllCultSwitchNewTariffHistories() {
		return cultSwitchNewTariffDAO.fetchAllCultSwitchNewTariffHistories();
	}

}
