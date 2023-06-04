package com.epicode_w4p.models;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

public class Booking {
    @Id
    @SequenceGenerator(name = "bookings_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookings_id")
    long booking_id;
    LocalDate date;
    @ManyToOne
    User user;
    @OneToOne
    Workplace workplace;

}
