package com.raystec.hibernate.inheritance;

public class CreditCard extends Payment {

	private String ccType;
	
	public CreditCard() {}

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	
	
}
