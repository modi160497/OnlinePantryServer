package com.onlinepantry.server.controller;

import com.onlinepantry.common.json.RegisterMessage;
import com.onlinepantry.server.dao.UserDao;
import com.onlinepantry.server.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

@RestController
@Slf4j
@RequiredArgsConstructor //
public class AppController {

    private final BCryptPasswordEncoder encoder;
    private final UserDao userDao;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @PostMapping("/register")
    public void registerUser(@Validated @RequestBody RegisterMessage message){ //validation annotation for doing validation defined in RegisterMessage

       var user = userDao.findById(message.getUsername());
       if(user.isPresent()) { //checking to see if the user already exists
           throw new ResponseStatusException(HttpStatus.UNAUTHORIZED); //throw exception if user already registered
       }
       String passHash = encoder.encode(message.getPassword());
       User validUser = new User(message.getUsername(),passHash,message.getUserEmail());
       userDao.save(validUser);


    }



}
