package net.durgesh.hotel.service.application.repository;

import net.durgesh.hotel.service.application.Entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity, String> {
    // Additional query methods can be defined here if needed
    // For example, you can add methods to find hotels by location or name
}
