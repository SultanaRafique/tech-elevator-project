package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public ReservationController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    @RequestMapping(path = "/hotels/{id}/reservations")
    public List<Reservation> getReservationsForHotel(@PathVariable("id") int hotelId) {
        return reservationDao.findByHotel(hotelId);
    }


   /* @RequestMapping(path = "/reservations")
    public List<Reservation> getReservationsForHotel(@RequestParam(defaultValue = "1") int hotelId ) {
        return reservationDao.findByHotel(hotelId);
    }*/


    @RequestMapping(path = "/hotels/{hotelId}/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation, @PathVariable int hotelId) {
        return reservationDao.create(reservation, hotelId);
    }


    @RequestMapping(path = "/message", method = RequestMethod.GET)
    public String getMessage() {
        return "Hello!";
    }

    @RequestMapping(path = "/sayHello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(required = false) String name, @RequestParam int number) {
        System.out.println("number: " + number);
        if (name != null) {
            return "Hello " + name + "!";
        }
        return "hi!";
    }

    public Reservation update(Reservation reservation){
        Reservation UpdatedReservation = new Reservation();

        return UpdatedReservation;
    }



}
