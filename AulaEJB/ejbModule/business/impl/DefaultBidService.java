package business.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import business.BidService;
import model.Bid;
import persistence.BidDAO;

@Stateless
public class DefaultBidService implements BidService {
	
	@Inject
	private BidDAO dao;
	
	@Override
	public void addBid(Bid bid) {
		dao.addBid(bid);
	}

}
