package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Auction> auctions = new ArrayList<>();

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");
        auctions.add(generalAuction);

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        System.out.println("Winner of general auction is: " + generalAuction.getHighBid().getBidder() + " $" +
                generalAuction.getHighBid().getBidAmount());

        ReserveAuction reserveAuction = new ReserveAuction("Bicycle", 100);
        auctions.add(reserveAuction);


        System.out.println("Reserve item for sale: " + reserveAuction.getItemForSale());
        reserveAuction.placeBid( new Bid("Yoav", 90));
        reserveAuction.placeBid( new Bid("Wanda", 120));

        System.out.println("Winner of reserve auction is: " + reserveAuction.getHighBid().getBidder() + " $" +
        reserveAuction.getHighBid().getBidAmount());

        BuyoutAuction buyoutAuction = new BuyoutAuction("Car", 7500);
        auctions.add(buyoutAuction);

        buyoutAuction.placeBid(new Bid("Yoav", 1000));
        buyoutAuction.placeBid(new Bid("Jaime", 9000));
        buyoutAuction.placeBid(new Bid("Rich", 15000));
        System.out.println("Winner of buyout auction is: " + buyoutAuction.getHighBid().getBidder()  + " $" +
                buyoutAuction.getHighBid().getBidAmount());


        for (Auction auction : auctions) {
            System.out.println("Auction for " + auction.getItemForSale() + " Winner: " + auction.getHighBid().getBidder() +
                    " $" + auction.getHighBid().getBidAmount());
        }

    }
}
