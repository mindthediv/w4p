package com.epicode_w4p.configurations;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode_w4p.models.User;
import com.github.javafaker.Faker;

@Configuration
public class userConfig {
  
  
  @Bean("userBean")
  @Scope("prototype")
  public User userBean(){
      Faker f = Faker.instance(new Locale("it-IT"));
      User u1 = new User(0, "afghj", "dfghjkl", "rfghdjksl");
      return u1;
      //  User.builder()
      // .full_name(f.name().firstName())
      // .email(f.internet().emailAddress())
      // .username(f.name().username())
      // .build();

      
  }

}
