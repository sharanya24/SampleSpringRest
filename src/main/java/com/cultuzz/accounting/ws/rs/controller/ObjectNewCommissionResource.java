package com.cultuzz.accounting.ws.rs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cultuzz.accounting.beans.ObjectNewCommissionStatus;
import com.cultuzz.accounting.service.ObjectNewCommissionService;

@RestController
@RequestMapping("/objectNewCommission")
public class ObjectNewCommissionResource {
	
	@Autowired
	private ObjectNewCommissionService objectNewCommissionService;
	
	@RequestMapping(value="/",method=RequestMethod.POST)
	public boolean setObjectNewCommission(@RequestBody ObjectNewCommissionStatus objectNewCommissionStatus){
		return objectNewCommissionService.setObjectNewCommissionStatus(objectNewCommissionStatus);
	}
	
	@RequestMapping(value="/{objectId}" , method=RequestMethod.GET)
	public ObjectNewCommissionStatus getObjectNewCommissionStatus(@PathVariable("objectId") int objectId) {
		
		return objectNewCommissionService.getObjectNewCommissionStatus(objectId); 
	}
}
