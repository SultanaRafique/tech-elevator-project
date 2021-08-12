package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import com.techelevator.auctions.service.AuctionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    /*
    ****** NOTE: Code works but injection examples break test ******
     */

    private AuctionDao dao;
    private AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.dao = new MemoryAuctionDao();
        this.auctionService = new AuctionService();

        // could do this wtih dependency injection:
        //
        // this.auctionService = auctionService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(name = "title_like", defaultValue = "") String titleLike,
                              @RequestParam(name = "currentBid_lte", defaultValue = "0") double currentBidLte) {
        // this method uses auctionService as an example of how this would
        //be done

        if (!titleLike.isEmpty() && currentBidLte > 0) {
            return dao.searchByTitleAndPrice(titleLike, currentBidLte);
        } else if (!titleLike.isEmpty()) {
            return dao.searchByTitle(titleLike);
        } else if (currentBidLte > 0) {
            return dao.searchByPrice(currentBidLte);
        } else {
            return auctionService.list();
        }

        // Using service instead
        //
        // return auctionService.listWithOptionalTitleLikeAndPrice(titleLike, currentBidLte);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return dao.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        return dao.create(auction);
    }



}
