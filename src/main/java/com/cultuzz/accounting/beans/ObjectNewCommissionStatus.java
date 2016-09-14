package com.cultuzz.accounting.beans;

// Generated Feb 18, 2016 11:49:57 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import com.cultuzz.accounting.json.deserializer.CustomJsonDateDeserializer;
import com.cultuzz.accounting.json.serializer.CustomJsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
public class ObjectNewCommissionStatus implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int objectId;
	private boolean newCommissionStatus;
	private Date effectiveDate;
	private int assignedUserId;
	private Date lastUpdated;

	public ObjectNewCommissionStatus() {
	}

	public ObjectNewCommissionStatus(int objectId, boolean newCommissionStatus,
			Date effectiveDate, int assignedUserId, Date lastUpdated) {
		this.objectId = objectId;
		this.newCommissionStatus = newCommissionStatus;
		this.effectiveDate = effectiveDate;
		this.assignedUserId = assignedUserId;
		this.lastUpdated = lastUpdated;
	}

	public int getObjectId() {
		return objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public boolean isNewCommissionStatus() {
		return newCommissionStatus;
	}

	public void setNewCommissionStatus(boolean newCommissionStatus) {
		this.newCommissionStatus = newCommissionStatus;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public int getAssignedUserId() {
		return assignedUserId;
	}

	public void setAssignedUserId(int assignedUserId) {
		this.assignedUserId = assignedUserId;
	}

	@JsonSerialize(using=CustomJsonDateSerializer.class, as = Date.class)
	public Date getLastUpdated() {
		return lastUpdated;
	}

	@JsonDeserialize(using=CustomJsonDateDeserializer.class, as = Date.class)
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ObjectNewCommissionStatus [objectId=");
		builder.append(objectId);
		builder.append(", newCommissionStatus=");
		builder.append(newCommissionStatus);
		builder.append(", effectiveDate=");
		builder.append(effectiveDate);
		builder.append(", assignedUserId=");
		builder.append(assignedUserId);
		builder.append(", lastUpdated=");
		builder.append(lastUpdated);
		builder.append("]");
		return builder.toString();
	}

	
}
