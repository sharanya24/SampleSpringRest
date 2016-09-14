package com.cultuzz.accounting.beans;

// Generated Feb 13, 2016 1:24:40 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import com.cultuzz.accounting.json.deserializer.CustomJsonDateDeserializer;
import com.cultuzz.accounting.json.serializer.CustomJsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CultswitchNewTariffHistory implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String currency;
	private float commission;
	private Date endDate;
	private float minimumValue;
	private float maximumValue;
	private int creatorUserId;
	private Date createdTime;
	private Date lastUpdated;

	public CultswitchNewTariffHistory() {
	}

	public CultswitchNewTariffHistory(String currency, float commission,
			Date endDate, float minimumValue, float maximumValue,
			int creatorUserId, Date createdTime, Date lastUpdated) {
		this.currency = currency;
		this.commission = commission;
		this.endDate = endDate;
		this.minimumValue = minimumValue;
		this.maximumValue = maximumValue;
		this.creatorUserId = creatorUserId;
		this.createdTime = createdTime;
		this.lastUpdated = lastUpdated;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	@JsonSerialize(using=CustomJsonDateSerializer.class, as = Date.class)
	public Date getEndDate() {
		return endDate;
	}

	@JsonDeserialize(using=CustomJsonDateDeserializer.class, as = Date.class)
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getMinimumValue() {
		return minimumValue;
	}

	public void setMinimumValue(float minimumValue) {
		this.minimumValue = minimumValue;
	}

	public float getMaximumValue() {
		return maximumValue;
	}

	public void setMaximumValue(float maximumValue) {
		this.maximumValue = maximumValue;
	}

	public int getCreatorUserId() {
		return creatorUserId;
	}

	public void setCreatorUserId(int creatorUserId) {
		this.creatorUserId = creatorUserId;
	}

	@JsonSerialize(using=CustomJsonDateSerializer.class, as = Date.class)
	public Date getCreatedTime() {
		return createdTime;
	}

	@JsonDeserialize(using=CustomJsonDateDeserializer.class, as = Date.class)
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
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
		builder.append("CultswitchNewTariffHistory [id=");
		builder.append(id);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", commission=");
		builder.append(commission);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append(", minimumValue=");
		builder.append(minimumValue);
		builder.append(", maximumValue=");
		builder.append(maximumValue);
		builder.append(", creatorUserId=");
		builder.append(creatorUserId);
		builder.append(", createdTime=");
		builder.append(createdTime);
		builder.append(", lastUpdated=");
		builder.append(lastUpdated);
		builder.append("]");
		return builder.toString();
	}

	

}
