package net.durgesh.hotel.service.application.service.impl;

import lombok.Setter;
import net.durgesh.hotel.service.application.Entity.HotelEntity;
import net.durgesh.hotel.service.application.exception.ResourceNotFoundException;
import net.durgesh.hotel.service.application.repository.HotelRepository;
import net.durgesh.hotel.service.application.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    // Assuming you have a HotelRepository to interact with the database
    @Autowired
    private HotelRepository hotelRepository;

    // Implementing the methods from the HotelService interface
    // Method to create a new hotel
    // This method will save the hotelEntity to the database and return the saved entity
    @Override
    public HotelEntity createHotel(HotelEntity hotelEntity) {
        // Generate a random UUID for the hotelId field
        // This ensures that each hotel has a unique identifier.
        // The UUID is generated using the UUID class from the java.util package.
        // The toString() method converts the UUID to a string representation.
        String randomHotelId = UUID.randomUUID().toString();
        // Set the generated hotelId to the hotelEntity
        hotelEntity.setHotelId(randomHotelId);
        return hotelRepository.save(hotelEntity);
    }

    @Override
    public HotelEntity getHotelById(String id) {
        return hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id: " + id));
    }

    @Override
    public List<HotelEntity> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public void updateHotel(String id, HotelEntity hotelEntity) {

    }

    @Override
    public void deleteHotel(String id) {

    }
}
