package com.cultuzz.accounting.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.beans.CultswitchNewTariffHistory;
import com.cultuzz.accounting.exception.DataAccessException;
import com.cultuzz.accounting.exception.DataNotFoundException;
import com.cultuzz.accounting.exception.InValidInputException;
import com.cultuzz.accounting.manager.read.CultSwitchNewTariffReadManager;
import com.cultuzz.accounting.manager.write.CultSwitchNewTariffWriteManager;
import com.cultuzz.accounting.service.CultSwitchNewTariffService;

@Component
public class CultSwitchNewTariffServiceImpl implements
		CultSwitchNewTariffService {

	@Autowired
	private CultSwitchNewTariffReadManager cultSwitchNewTariffReadManager;

	@Autowired
	private CultSwitchNewTariffWriteManager cultSwitchNewTariffWriteManager;

	@Override
	public List<CultswitchNewTariff> getAllCultSwitchNewTariffs() {
		List<CultswitchNewTariff> cultSwitchNewTariffs = cultSwitchNewTariffReadManager
				.getAllCultSwitchNewTariffs();
		if (cultSwitchNewTariffs == null) {
			throw new DataNotFoundException("No CultSwitch New Tariffs Found");
		}
		return cultSwitchNewTariffs;
	}

	@Override
	public CultswitchNewTariff getCultSwitchNewTariff(
			Integer cultswitchNewTariffId) {
		CultswitchNewTariff cultSwitchNewTariff = cultSwitchNewTariffReadManager
				.getCultSwitchNewTariff(cultswitchNewTariffId);
		if (cultSwitchNewTariff == null) {
			throw new DataNotFoundException(
					"No CultSwitch New Tariff Found for Id "
							+ cultswitchNewTariffId);
		}

		return cultSwitchNewTariff;
	}

	public CultswitchNewTariff getCultSwitchNewTariffByCurrency(String currency) {

		if (currency == null || currency.isEmpty()) {
			throw new InValidInputException("Invalid Input Given");
		}

		CultswitchNewTariff cultSwitchNewTariff = cultSwitchNewTariffReadManager
				.getCultSwitchNewTariffByCurrency(currency);
		if (cultSwitchNewTariff == null) {
			throw new DataNotFoundException(
					"No CultSwitch New Tariff Found for Currency " + currency);
		}

		return cultSwitchNewTariff;
	}

	@Override
	public Integer addCultSwitchNewTariff(
			CultswitchNewTariff cultswitchNewTariff) {
		CultswitchNewTariff beanCultswitchNewTariff = cultSwitchNewTariffReadManager
				.getCultSwitchNewTariffByCurrency(cultswitchNewTariff
						.getCurrency());

		if (beanCultswitchNewTariff == null) {

			Integer cultswitchNewTariffId = cultSwitchNewTariffWriteManager
					.addCultSwitchNewTariff(cultswitchNewTariff);
			if(cultswitchNewTariffId != null && cultswitchNewTariffId !=0){
				addToCultSwitchNewTariffHistory(cultswitchNewTariff);
			}
			return cultswitchNewTariffId;

		} else {
			System.out.println("data already exists for this currency "
					+ beanCultswitchNewTariff);
			cultswitchNewTariff.setId(beanCultswitchNewTariff.getId());
			updateCultSwitchNewTariff(cultswitchNewTariff);

			return beanCultswitchNewTariff.getId();
		}

	}

	@Override
	public boolean updateCultSwitchNewTariff(
			CultswitchNewTariff cultswitchNewTariff) {

		boolean updateStatus = false;
		
		CultswitchNewTariff beanCultswitchNewTariff = cultSwitchNewTariffReadManager
				.getCultSwitchNewTariff(cultswitchNewTariff.getId());
		if (beanCultswitchNewTariff == null) {
			throw new DataNotFoundException("No data found for Id "
					+ cultswitchNewTariff.getId());
		}
		
		updateStatus = cultSwitchNewTariffWriteManager
		.updateCultSwitchNewTariff(cultswitchNewTariff);
		
		if(updateStatus){
			Integer historyId = cultSwitchNewTariffWriteManager
					.addToCultSwitchNewTariffHistory(cultswitchNewTariff);

			if (historyId == null || historyId == 0) {
				throw new DataAccessException("Data not Archived"
						+ beanCultswitchNewTariff);
			}
		}

		return updateStatus;
	}

	@Override
	public Integer addToCultSwitchNewTariffHistory(
			CultswitchNewTariff cultswitchNewTariff) {
		return cultSwitchNewTariffWriteManager
				.addToCultSwitchNewTariffHistory(cultswitchNewTariff);
	}

	@Override
	public List<CultswitchNewTariffHistory> getAllCultSwitchNewTariffHistories() {
		List<CultswitchNewTariffHistory> cultswitchNewTariffHistories = cultSwitchNewTariffReadManager
				.getAllCultSwitchNewTariffHistories();
		if (cultswitchNewTariffHistories == null) {
			throw new DataNotFoundException("No CultSwitch New Tariff Histories Found");	
		}
		return cultswitchNewTariffHistories;
	}

}
