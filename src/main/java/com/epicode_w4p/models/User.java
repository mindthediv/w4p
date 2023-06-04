package com.epicode_w4p.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
    @Id
    @SequenceGenerator(name = "users_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id")
    long user_id;
    @Column(unique = true, nullable = false)
    String username;
    @Column(nullable = false)
    String full_name;
    @Column(unique = true, nullable = false)
    String email;
    // @OneToMany(mappedBy = "booking_id", fetch = FetchType.EAGER)
    // List<Booking> user_bookings;

}
