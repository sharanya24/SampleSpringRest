package com.cultuzz.accounting.service;

import java.util.List;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.beans.CultswitchNewTariffHistory;

public interface CultSwitchNewTariffService {

	public List<CultswitchNewTariff> getAllCultSwitchNewTariffs();
	
	public CultswitchNewTariff getCultSwitchNewTariff(Integer cultswitchNewTariffId);
	
	public CultswitchNewTariff getCultSwitchNewTariffByCurrency(String currency);
	
	public Integer addCultSwitchNewTariff(CultswitchNewTariff cultswitchNewTariff);
	
	public boolean updateCultSwitchNewTariff(CultswitchNewTariff cultswitchNewTariff);
	
	public Integer addToCultSwitchNewTariffHistory(CultswitchNewTariff beanCultswitchNewTariff);
	
	public List<CultswitchNewTariffHistory> getAllCultSwitchNewTariffHistories();
}
