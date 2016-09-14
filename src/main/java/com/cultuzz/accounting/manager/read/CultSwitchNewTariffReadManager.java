package com.cultuzz.accounting.manager.read;

import java.util.List;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.beans.CultswitchNewTariffHistory;

public interface CultSwitchNewTariffReadManager {

	public List<CultswitchNewTariff> getAllCultSwitchNewTariffs();

	public CultswitchNewTariff getCultSwitchNewTariff(Integer cultswitchNewTariffId);
	
	public CultswitchNewTariff getCultSwitchNewTariffByCurrency(String currency);
	
	public List<CultswitchNewTariffHistory> getAllCultSwitchNewTariffHistories();
}
