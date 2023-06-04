package com.epicode_w4p.services;

import java.util.Optional;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode_w4p.models.User;
import com.epicode_w4p.repositories.UserRepo;

@Service
public class UserService {
  
   @Autowired
   private UserRepo userRepository;
   
   @Autowired
    @Qualifier("userBean")
    ObjectProvider<User> userBean;

    public void saveUser(User u){
        userRepository.save(u);
    }

    public void updateUser(User u){
            userRepository.save(u);
    }

    public void deleteUser(User u){
        userRepository.delete(u);
    }

    public Optional<User> findUserById(long id){
        return userRepository.findById(id);
    }

    public User createUser() {
            return userBean.getObject();      
    }
}
