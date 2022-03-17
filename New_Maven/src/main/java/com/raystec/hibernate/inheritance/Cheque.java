package com.raystec.hibernate.inheritance;

public class Cheque extends Payment {

	private int chqNo;
	private String bankN;

	public Cheque() {
	}

	public int getChqNo() {
		return chqNo;
	}

	public void setChqNo(int chqNo) {
		this.chqNo = chqNo;
	}

	public String getBankN() {
		return bankN;
	}

	public void setBankN(String bankN) {
		this.bankN = bankN;
	}

}
