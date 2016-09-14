package com.cultuzz.accounting.manager.write.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.dto.CultSwitchNewTariffDTO;
import com.cultuzz.accounting.manager.write.CultSwitchNewTariffWriteManager;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
public class CultSwitchNewTariffWriteManagerImpl implements
		CultSwitchNewTariffWriteManager {

	@Autowired
	private CultSwitchNewTariffDTO cultSwitchNewTariffDTO;

	@Override
	public Integer addCultSwitchNewTariff(
			CultswitchNewTariff cultswitchNewTariff) {

		return cultSwitchNewTariffDTO
				.addCultSwitchNewTariff(cultswitchNewTariff);

	}

	@Override
	public boolean updateCultSwitchNewTariff(
			CultswitchNewTariff cultswitchNewTariff) {
		return cultSwitchNewTariffDTO.updateCultSwitchNewTariff(cultswitchNewTariff);
	}

	@Override
	public Integer addToCultSwitchNewTariffHistory(
			CultswitchNewTariff cultswitchNewTariff) {
		return cultSwitchNewTariffDTO.addToCultSwitchNewTariffHistory(cultswitchNewTariff);
	}

}
