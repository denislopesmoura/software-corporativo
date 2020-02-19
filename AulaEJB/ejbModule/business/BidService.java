package business;

import javax.jws.WebService;
import model.Bid;

@WebService
public interface BidService {

	public void addBid(Bid bid);
}
