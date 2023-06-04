package com.epicode_w4p.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.epicode_w4p.models.Booking;


public interface BookingRepo extends JpaRepository<Booking,Long>  {
    
}
