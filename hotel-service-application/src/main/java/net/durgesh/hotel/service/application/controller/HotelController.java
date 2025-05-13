package net.durgesh.hotel.service.application.controller;

import net.durgesh.hotel.service.application.Entity.HotelEntity;
import net.durgesh.hotel.service.application.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hotels")
public class HotelController {

    // Inject the HotelService here (not shown in this snippet)

    @Autowired
    private HotelService hotelService;

    // Define your endpoints here
    // For example, you can create methods to handle CRUD operations for hotels
    // You can use @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping annotations
    // to define the HTTP methods for each endpoint

    // Example endpoint to get all hotels
    // create hotel
    @PostMapping
    public ResponseEntity<HotelEntity> createHotel(@RequestBody HotelEntity hotelEntity) {
        // create hotel
        HotelEntity createdHotel = hotelService.createHotel(hotelEntity);
        return ResponseEntity.status(201).body(createdHotel);
    }

    // get hotel by id
    @GetMapping("/{hotelId}")
    public ResponseEntity<HotelEntity> getHotelById(@PathVariable String hotelId) {
        // get hotel by id
        HotelEntity hotelEntity = hotelService.getHotelById(hotelId);
        return ResponseEntity.ok(hotelEntity);
    }

    // get all hotels
    @GetMapping("/all")
    public ResponseEntity<List<HotelEntity>> getAllHotels() {
        // get all hotels
        List<HotelEntity> hotels = hotelService.getAllHotels();
        return ResponseEntity.ok(hotels);
    }
}
