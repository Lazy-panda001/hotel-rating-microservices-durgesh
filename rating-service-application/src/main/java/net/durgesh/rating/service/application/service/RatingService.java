package net.durgesh.rating.service.application.service;

import net.durgesh.rating.service.application.entity.RatingEntity;

import java.util.List;

public interface RatingService {

    // Method to create a new rating
    RatingEntity createRating(RatingEntity ratingEntity);

    // Method to get all ratings
    List<RatingEntity> getAllRatings();


    // Method to get all ratings by a specific user
    List<RatingEntity> getRatingsByUserId(String userId);

    // Method to get a rating by its hotel ID
    List<RatingEntity> getRatingsByHotelId(String hotelId);

    // Method to delete a rating by its ID
    void deleteRating(String ratingId);

    // Method to update an existing rating
    RatingEntity updateRating(RatingEntity ratingEntity);
}
