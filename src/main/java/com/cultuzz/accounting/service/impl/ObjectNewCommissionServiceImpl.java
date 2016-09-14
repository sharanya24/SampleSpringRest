package com.cultuzz.accounting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cultuzz.accounting.beans.ObjectNewCommissionStatus;
import com.cultuzz.accounting.exception.DataNotFoundException;
import com.cultuzz.accounting.manager.read.ObjectNewCommissionReadManager;
import com.cultuzz.accounting.manager.write.ObjectNewCommissionWriteManager;
import com.cultuzz.accounting.service.ObjectNewCommissionService;

@Component
public class ObjectNewCommissionServiceImpl implements
		ObjectNewCommissionService {

	@Autowired
	private ObjectNewCommissionWriteManager objectNewCommissionWriteManager;
	
	@Autowired
	private ObjectNewCommissionReadManager objectNewCommissionReadManager;
	
	@Override
	public boolean setObjectNewCommissionStatus(
			ObjectNewCommissionStatus objectNewCommissionStatus) {
		
		ObjectNewCommissionStatus beanObjectNewCommissionStatus = objectNewCommissionReadManager.getObjectNewCommissionStatus(objectNewCommissionStatus.getObjectId());
		
		if(beanObjectNewCommissionStatus != null && beanObjectNewCommissionStatus.isNewCommissionStatus()){
			if(objectNewCommissionStatus.getEffectiveDate().after(beanObjectNewCommissionStatus.getEffectiveDate())){
				objectNewCommissionStatus.setNewCommissionStatus(true);
			}else{	
				return false;
			}
		}
		
		return objectNewCommissionWriteManager.setObjectNewCommissionStatus(objectNewCommissionStatus);
	}

	@Override
	public ObjectNewCommissionStatus getObjectNewCommissionStatus(int objectId) {
		
		ObjectNewCommissionStatus objectNewCommissionStatus = objectNewCommissionReadManager.getObjectNewCommissionStatus(objectId);
		
		if(objectNewCommissionStatus == null){
			throw new DataNotFoundException("No data found for ObjectId: "+objectId);
		}
		
		return objectNewCommissionStatus;
	}

}
