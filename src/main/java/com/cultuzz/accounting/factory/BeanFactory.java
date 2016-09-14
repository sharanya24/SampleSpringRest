package com.cultuzz.accounting.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.beans.CultswitchNewTariffHistory;
import com.cultuzz.accounting.beans.Currency;

@Component
public class BeanFactory {
	
	@Bean
	public Currency getCurrency(){
		return new Currency();
	}
	
	@Bean
	public CultswitchNewTariff getCultswitchNewTariff(){
		return new CultswitchNewTariff();
	}
	
	@Bean
	public CultswitchNewTariffHistory getCultswitchNewTariffHistory(){
		return new CultswitchNewTariffHistory();
	}
}
