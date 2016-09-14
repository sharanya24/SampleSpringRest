package com.cultuzz.accounting.manager.write;

import com.cultuzz.accounting.beans.CultswitchNewTariff;

public interface CultSwitchNewTariffWriteManager {

	public Integer addCultSwitchNewTariff(CultswitchNewTariff cultswitchNewTariff);

	public boolean updateCultSwitchNewTariff(CultswitchNewTariff cultswitchNewTariff);
	
	public Integer addToCultSwitchNewTariffHistory(CultswitchNewTariff cultswitchNewTariff);
}
