package com.techelevator.auctions.service;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionService {

    private AuctionDao auctionDao;

    public AuctionService() {
        this.auctionDao = new MemoryAuctionDao();
    }

    public List<Auction> list() {
        return auctionDao.list();
    }

    public List<Auction> listWithOptionalTitleLikeAndPrice(String titleLike, double currentBidLte) {
        if (!titleLike.isEmpty() && currentBidLte > 0) {
            return auctionDao.searchByTitleAndPrice(titleLike, currentBidLte);
        } else if (!titleLike.isEmpty()) {
            return auctionDao.searchByTitle(titleLike);
        } else if (currentBidLte > 0) {
            return auctionDao.searchByPrice(currentBidLte);
        } else {
            return list();
        }
    }
}
