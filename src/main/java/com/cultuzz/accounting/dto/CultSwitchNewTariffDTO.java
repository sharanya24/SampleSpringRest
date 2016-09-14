package com.cultuzz.accounting.dto;

import com.cultuzz.accounting.beans.CultswitchNewTariff;

public interface CultSwitchNewTariffDTO {

	public Integer addCultSwitchNewTariff(CultswitchNewTariff cultswitchNewTariff);

	public boolean updateCultSwitchNewTariff(CultswitchNewTariff cultswitchNewTariff);
	
	public Integer addToCultSwitchNewTariffHistory(CultswitchNewTariff cultswitchNewTariff);
}
