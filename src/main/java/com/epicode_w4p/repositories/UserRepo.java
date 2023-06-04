package com.epicode_w4p.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.epicode_w4p.models.User;

public interface UserRepo extends JpaRepository<User,Long> {
    
}
