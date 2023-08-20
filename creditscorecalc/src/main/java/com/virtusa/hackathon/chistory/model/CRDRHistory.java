package com.virtusa.hackathon.chistory.model;


//@Entity
public class CRDRHistory {
	

	private int customerId;

	private int amount;

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
