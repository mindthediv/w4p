package com.epicode_w4p.runner;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode_w4p.models.User;
import com.epicode_w4p.repositories.UserRepo;
import com.epicode_w4p.services.UserService;


@Component
public class WpRunner implements CommandLineRunner {
    @Autowired
    public UserRepo userRepo;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
   User u1 = userService.createUser();
    //    System.out.println(u1.toString());
  userService.saveUser(u1);

       
    }
    
}
