package com.raystec.hibernate;

public class Bid_OnebyMany {

	private long id;
	private int amount;
	private long itemid;
	
	public Bid_OnebyMany() {
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getItemid() {
		return itemid;
	}

	public void setItemid(long itemid) {
		this.itemid = itemid;
	}
 
}
