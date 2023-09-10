package com.vti.booking_tour.repositories;

import com.vti.booking_tour.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
