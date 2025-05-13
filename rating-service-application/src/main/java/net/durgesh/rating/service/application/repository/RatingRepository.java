package net.durgesh.rating.service.application.repository;

import net.durgesh.rating.service.application.entity.RatingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<RatingEntity, String> {
    // Custom query methods can be defined here if needed
    // For example, findByUserId or findByHotelId
    // This will automatically create a query to find ratings by userId or hotelId
    List<RatingEntity> findByUserIdAndHotelId(String userId, String hotelId);

    List<RatingEntity> findByUserId(String userId);
    List<RatingEntity> findByHotelId(String hotelId);
}
