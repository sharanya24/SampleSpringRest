package com.cultuzz.accounting.dto.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.dto.AbstractDTO;
import com.cultuzz.accounting.dto.CultSwitchNewTariffDTO;

@Repository
public class CultSwitchNewTariffDTOImpl extends AbstractDTO implements
		CultSwitchNewTariffDTO {

	@Override
	public Integer addCultSwitchNewTariff(
			CultswitchNewTariff beanCultswitchNewTariff) {

		com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff hbmCultswitchNewTariff = new com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff();

		hbmCultswitchNewTariff.setCurrency(beanCultswitchNewTariff
				.getCurrency());
		hbmCultswitchNewTariff.setEndDate(beanCultswitchNewTariff.getEndDate());
		hbmCultswitchNewTariff.setCommission(beanCultswitchNewTariff
				.getCommission());
		hbmCultswitchNewTariff.setMinimumValue(beanCultswitchNewTariff
				.getMinimumValue());
		hbmCultswitchNewTariff.setMaximumValue(beanCultswitchNewTariff
				.getMaximumValue());
		hbmCultswitchNewTariff.setCreatorUserId(beanCultswitchNewTariff
				.getCreatorUserId());

		getWriteSession().save(hbmCultswitchNewTariff);

		return hbmCultswitchNewTariff.getId();

	}

	@Override
	public boolean updateCultSwitchNewTariff(
			CultswitchNewTariff beanCultswitchNewTariff) {
		com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff hbmCultswitchNewTariff = new com.cultuzz.accounting.hbm.accounting.CultswitchNewTariff();

		hbmCultswitchNewTariff.setId(beanCultswitchNewTariff.getId());
		hbmCultswitchNewTariff.setCurrency(beanCultswitchNewTariff
				.getCurrency());
		hbmCultswitchNewTariff.setEndDate(beanCultswitchNewTariff.getEndDate());
		hbmCultswitchNewTariff.setCommission(beanCultswitchNewTariff
				.getCommission());
		hbmCultswitchNewTariff.setMinimumValue(beanCultswitchNewTariff
				.getMinimumValue());
		hbmCultswitchNewTariff.setMaximumValue(beanCultswitchNewTariff
				.getMaximumValue());
		hbmCultswitchNewTariff.setCreatorUserId(beanCultswitchNewTariff
				.getCreatorUserId());

		getWriteSession().update(hbmCultswitchNewTariff);
		
		return true;
	}

	@Override
	public Integer addToCultSwitchNewTariffHistory(
			CultswitchNewTariff beanCultswitchNewTariff) {
		com.cultuzz.accounting.hbm.accounting.CultswitchNewTariffHistory hbmCultswitchNewTariffHistory = new com.cultuzz.accounting.hbm.accounting.CultswitchNewTariffHistory();

		hbmCultswitchNewTariffHistory.setCurrency(beanCultswitchNewTariff
				.getCurrency());
		hbmCultswitchNewTariffHistory.setEndDate(beanCultswitchNewTariff.getEndDate());
		hbmCultswitchNewTariffHistory.setCommission(beanCultswitchNewTariff
				.getCommission());
		hbmCultswitchNewTariffHistory.setMinimumValue(beanCultswitchNewTariff
				.getMinimumValue());
		hbmCultswitchNewTariffHistory.setMaximumValue(beanCultswitchNewTariff
				.getMaximumValue());
		hbmCultswitchNewTariffHistory.setCreatorUserId(beanCultswitchNewTariff
				.getCreatorUserId());
		
		hbmCultswitchNewTariffHistory.setCreatedTime(new Date());

		getWriteSession().save(hbmCultswitchNewTariffHistory);

		return hbmCultswitchNewTariffHistory.getId();
	}

}
