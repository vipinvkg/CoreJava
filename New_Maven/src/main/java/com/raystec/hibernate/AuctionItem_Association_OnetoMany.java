package com.raystec.hibernate;

import java.util.Set;

public class AuctionItem_Association_OnetoMany {

	private long id;
	private Set bids;
	private String description;
	private Bid_OnebyMany successfulBid = null;
			
	public Bid_OnebyMany getSuccessfulBid() {
		return successfulBid;
	}

	public void setSuccessfulBid(Bid_OnebyMany successfulBid) {
		this.successfulBid = successfulBid;
	}

	public AuctionItem_Association_OnetoMany() {
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set getBids() {
		return bids;
	}

	public void setBids(Set bids) {
		this.bids = bids;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
