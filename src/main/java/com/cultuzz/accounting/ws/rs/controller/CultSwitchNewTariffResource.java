package com.cultuzz.accounting.ws.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cultuzz.accounting.beans.CultswitchNewTariff;
import com.cultuzz.accounting.beans.CultswitchNewTariffHistory;
import com.cultuzz.accounting.service.CultSwitchNewTariffService;

@RestController
@RequestMapping("cultswitchNewTariffs")
public class CultSwitchNewTariffResource {
	
	@Autowired
	private CultSwitchNewTariffService cultSwitchNewTariffService;
	

	@RequestMapping(value="/" , method=RequestMethod.GET)
	public List<CultswitchNewTariff> getAllCultSwitchNewTariffs(){
		return cultSwitchNewTariffService.getAllCultSwitchNewTariffs();	
	}
	
	@RequestMapping(value="/history" , method=RequestMethod.GET)
	public List<CultswitchNewTariffHistory> getAllCultSwitchNewTariffHistories(){
		return cultSwitchNewTariffService.getAllCultSwitchNewTariffHistories();	
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public CultswitchNewTariff getCultSwitchNewTariffByCurrency(@RequestParam(value="currency" , required = true) String currency) {
		
		System.out.println("currency "+currency);
		
		return cultSwitchNewTariffService.getCultSwitchNewTariffByCurrency(currency);
	}
	
	@RequestMapping(value="/{cultswitchNewTariffId}" , method=RequestMethod.GET)
	public CultswitchNewTariff getCultSwitchNewTariff(@PathVariable("cultswitchNewTariffId")Integer  cultswitchNewTariffId){
		return cultSwitchNewTariffService.getCultSwitchNewTariff(cultswitchNewTariffId);
	}
	
	@RequestMapping(value="/" , method=RequestMethod.POST , consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer addCultSwitchNewTariff(@RequestBody CultswitchNewTariff cultswitchNewTariff){
		System.out.println(" "+cultswitchNewTariff);
		return cultSwitchNewTariffService.addCultSwitchNewTariff(cultswitchNewTariff);
	}
	
	@RequestMapping(value="/{cultswitchNewTariffId}" , method=RequestMethod.PUT , consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean updateCultSwitchNewTariff(@PathVariable("cultswitchNewTariffId") Integer cultswitchNewTariffId , @RequestBody CultswitchNewTariff cultswitchNewTariff){
		System.out.println(" "+cultswitchNewTariff);
		System.out.println(" "+cultswitchNewTariffId);		
		cultswitchNewTariff.setId(cultswitchNewTariffId);
		return cultSwitchNewTariffService.updateCultSwitchNewTariff(cultswitchNewTariff);
	}
	
}
