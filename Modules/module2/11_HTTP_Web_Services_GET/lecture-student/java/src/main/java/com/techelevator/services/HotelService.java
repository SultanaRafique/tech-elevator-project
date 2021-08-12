package com.techelevator.services;

import com.techelevator.model.City;
import com.techelevator.model.Hotel;
import com.techelevator.model.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private final String API_BASE_URL;
    private RestTemplate restTemplate = new RestTemplate();

    public HotelService(String apiURL) {
        API_BASE_URL = apiURL;
    }

    public Hotel[] listHotels() {
        Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "hotels" , Hotel[].class);
        return hotels;
    }

    public Review[] listReviews() {
        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class );
        return reviews;
    }

    public Hotel getHotelById(int id) {
        Hotel hotel = restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
        return hotel;
    }

    public Review[] getReviewsByHotelId(int hotelID) {
        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "hotels/"  + hotelID + "/reviews", Review[].class);
        return reviews;
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "hotels?stars=" + stars, Hotel[].class);
        return hotels;
    }

    public City getWithCustomQuery(){
        return null;
    }

}
