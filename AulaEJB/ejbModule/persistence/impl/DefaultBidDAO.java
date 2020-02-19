package persistence.impl;

import java.util.ArrayList;

import model.Bid;
import persistence.BidDAO;

public class DefaultBidDAO implements BidDAO {
	
	private ArrayList<Bid> bidArray;
	
	public void addBid(Bid bid) {
		
		bidArray.add(bid);
		
	}

}
