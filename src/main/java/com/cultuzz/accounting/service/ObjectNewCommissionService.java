package com.cultuzz.accounting.service;

import com.cultuzz.accounting.beans.ObjectNewCommissionStatus;

public interface ObjectNewCommissionService {
	public boolean setObjectNewCommissionStatus(ObjectNewCommissionStatus objectNewCommissionStatus);
	public ObjectNewCommissionStatus getObjectNewCommissionStatus(int objectId);
}
