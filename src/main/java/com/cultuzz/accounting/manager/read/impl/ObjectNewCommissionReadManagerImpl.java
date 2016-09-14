package com.cultuzz.accounting.manager.read.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cultuzz.accounting.beans.ObjectNewCommissionStatus;
import com.cultuzz.accounting.dao.ObjectNewCommissionDAO;
import com.cultuzz.accounting.manager.read.ObjectNewCommissionReadManager;

@Service
@Transactional(propagation=Propagation.SUPPORTS , readOnly=true)
public class ObjectNewCommissionReadManagerImpl implements
		ObjectNewCommissionReadManager {

	@Autowired
	private ObjectNewCommissionDAO objectNewCommissionDAO;
	
	@Override
	public ObjectNewCommissionStatus getObjectNewCommissionStatus(int objectId) {
		return objectNewCommissionDAO.fetchObjectNewCommissionStatus(objectId);
	}

}
