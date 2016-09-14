package com.cultuzz.accounting.dto.impl;

import org.hibernate.classic.Session;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cultuzz.accounting.beans.ObjectNewCommissionStatus;
import com.cultuzz.accounting.dto.AbstractDTO;
import com.cultuzz.accounting.dto.ObjectNewCommissionDTO;

@Repository
public class ObjectNewCommissionDTOImpl extends AbstractDTO implements ObjectNewCommissionDTO {


	
	@Override
	public boolean setObjectNewCommissionStatus(
			ObjectNewCommissionStatus beanObjectNewCommissionStatus) {
		
		
		com.cultuzz.accounting.hbm.accounting.ObjectNewCommissionStatus hbmObjectNewCommissionStatus = new com.cultuzz.accounting.hbm.accounting.ObjectNewCommissionStatus();
		
		hbmObjectNewCommissionStatus.setObjectId(beanObjectNewCommissionStatus.getObjectId());
		hbmObjectNewCommissionStatus.setNewCommissionStatus(beanObjectNewCommissionStatus.isNewCommissionStatus());
		hbmObjectNewCommissionStatus.setEffectiveDate(beanObjectNewCommissionStatus.getEffectiveDate());
		hbmObjectNewCommissionStatus.setAssignedUserId(beanObjectNewCommissionStatus.getAssignedUserId());
		
		
		Session session = getWriteSession();
		session.saveOrUpdate(hbmObjectNewCommissionStatus);
		
		return true;
	}

}
