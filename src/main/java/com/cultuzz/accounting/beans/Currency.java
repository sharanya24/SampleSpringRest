package com.cultuzz.accounting.beans;

import java.util.Date;


public class Currency implements java.io.Serializable {

	private Short id;
	private String name;
	private String shortName;
	private String symbol;
	private Date lastUpdated;
	
	private static final long serialVersionUID = 1l;
	
	
	public Currency() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Currency(Short id, String name, String shortName, String symbol,
			Date lastUpdated) {
		super();
		this.id = id;
		this.name = name;
		this.shortName = shortName;
		this.symbol = symbol;
		this.lastUpdated = lastUpdated;
	}



	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Currency [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", shortName=");
		builder.append(shortName);
		builder.append(", symbol=");
		builder.append(symbol);
		builder.append(", lastUpdated=");
		builder.append(lastUpdated);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}