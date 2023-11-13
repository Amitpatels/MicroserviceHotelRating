package com.amit.hotel.services;

import com.amit.hotel.entites.Hotel;

import java.util.List;

public interface HotelService {
    //create
    Hotel createHotel(Hotel hotel);

    //get all
    List<Hotel> getAllHotel();

    //get Single
    Hotel getHotelById(String id);
}
