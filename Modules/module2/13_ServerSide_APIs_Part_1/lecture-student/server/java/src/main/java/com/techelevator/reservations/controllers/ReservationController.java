package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private HotelDao hotelDao;
    private ReservationDao reservationdao;

    public ReservationController(){
        this.hotelDao = new MemoryHotelDao();
        this.reservationdao = new MemoryReservationDao( hotelDao);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Reservation> list (){
        return reservationdao.findAll();
    }
}
