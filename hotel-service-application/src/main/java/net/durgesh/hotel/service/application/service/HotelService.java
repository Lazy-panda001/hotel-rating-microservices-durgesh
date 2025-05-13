package net.durgesh.hotel.service.application.service;

import net.durgesh.hotel.service.application.Entity.HotelEntity;

import java.util.List;

public interface HotelService {

    // Method to create a new hotel
    HotelEntity createHotel(HotelEntity hotelEntity);

    // Method to get a hotel by its ID
    HotelEntity getHotelById(String id);

    // Method to get all hotels
    List<HotelEntity> getAllHotels();


    // Method to update an existing hotelEntity
    void updateHotel(String id, HotelEntity hotelEntity);

    // Method to delete a hotel by its ID
    void deleteHotel(String id);

}
