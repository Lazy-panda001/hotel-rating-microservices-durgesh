package net.durgesh.rating.service.application.controller;

import net.durgesh.rating.service.application.entity.RatingEntity;
import net.durgesh.rating.service.application.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create rating
    @PostMapping
    public ResponseEntity<RatingEntity> createRating(@RequestBody RatingEntity ratingEntity) {
        // Logic to create a new rating
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(ratingEntity));
    }

    //get all ratings
    @GetMapping
    public ResponseEntity<List<RatingEntity>> getAllRatings() {
        // Logic to get all ratings
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    //get all ratings by userId
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<RatingEntity>> getRatingsByUserId(@PathVariable String userId) {
        // Logic to get all ratings by userId
        return ResponseEntity.ok(ratingService.getRatingsByUserId(userId));
    }

    //get all ratings by hotelId
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<RatingEntity>> getRatingsByHotelId(@PathVariable String hotelId) {
        // Logic to get all ratings by hotelId
        return ResponseEntity.ok(ratingService.getRatingsByHotelId(hotelId));
    }

}
