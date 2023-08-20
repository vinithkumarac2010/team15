package com.virtusa.hackathon.chistory.model;

import javax.persistence.Column;
import javax.persistence.Entity;

//@Entity
public class CRDRHistory {
	
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "crdr_ind")
	private String crdrInd;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCrdrInd() {
		return crdrInd;
	}

	public void setCrdrInd(String crdrInd) {
		this.crdrInd = crdrInd;
	}

}
