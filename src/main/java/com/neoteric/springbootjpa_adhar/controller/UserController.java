package com.neoteric.springbootjpa_adhar.controller;

import com.neoteric.springbootjpa_adhar.entity.UserEntity;
import com.neoteric.springbootjpa_adhar.model.User;
import com.neoteric.springbootjpa_adhar.repository.UserRepository;
import com.neoteric.springbootjpa_adhar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    public UserService userService;
    @Autowired
    public UserRepository userRepository;

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody User user){
        UserEntity userEntity= userService.saveUser(user);


        userRepository.save(userEntity);
        return ResponseEntity.ok(userEntity);
    }

    @PostMapping("/process")
    public String processUser(@RequestBody User user) {
        try {
            userService.someMethod(user);
            return "User processed successfully!";
        } catch (Exception e) {
            return "Error processing user: " + e.getMessage();
        }
    }



}
