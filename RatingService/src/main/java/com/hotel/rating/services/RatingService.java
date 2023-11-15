package com.hotel.rating.services;

import com.hotel.rating.entites.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating createRating(Rating rating);

    //get All ratings
    List<Rating> getAllRating();

    //get all rating by userId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel id
    List<Rating> getRatingByHotelId(String hotelId);
}
