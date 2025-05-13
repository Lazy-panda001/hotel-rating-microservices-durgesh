package net.durgesh.rating.service.application.service.impl;

import net.durgesh.rating.service.application.entity.RatingEntity;
import net.durgesh.rating.service.application.repository.RatingRepository;
import net.durgesh.rating.service.application.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    // Assuming you have a repository to interact with the database
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public RatingEntity createRating(RatingEntity ratingEntity) {
        return ratingRepository.save(ratingEntity);
    }

    @Override
    public List<RatingEntity> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<RatingEntity> getRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<RatingEntity> getRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

    @Override
    public void deleteRating(String ratingId) {

    }

    @Override
    public RatingEntity updateRating(RatingEntity ratingEntity) {
        return null;
    }
}
