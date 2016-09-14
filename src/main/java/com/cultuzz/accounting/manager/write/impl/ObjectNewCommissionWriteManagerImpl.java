package com.cultuzz.accounting.manager.write.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cultuzz.accounting.beans.ObjectNewCommissionStatus;
import com.cultuzz.accounting.dto.ObjectNewCommissionDTO;
import com.cultuzz.accounting.manager.write.ObjectNewCommissionWriteManager;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
public class ObjectNewCommissionWriteManagerImpl implements
		ObjectNewCommissionWriteManager {

	@Autowired
	private ObjectNewCommissionDTO objectNewCommissionDTO;
	
	@Override
	public boolean setObjectNewCommissionStatus(
			ObjectNewCommissionStatus objectNewCommissionStatus) {
		return objectNewCommissionDTO.setObjectNewCommissionStatus(objectNewCommissionStatus);
	}

}
