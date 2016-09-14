package com.cultuzz.accounting.dao;

import java.util.List;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.beans.CultswitchNewTariffHistory;

public interface CultSwitchNewTariffDAO {
	public List<CultswitchNewTariff> fetchAllCultSwitchNewTariffs();

	public CultswitchNewTariff fetchCultSwitchNewTariff(Integer cultswitchNewTariffId);
	
	public CultswitchNewTariff fetchCultSwitchNewTariffByCurrency(String currency);
	
	public List<CultswitchNewTariffHistory> fetchAllCultSwitchNewTariffHistories();
}
