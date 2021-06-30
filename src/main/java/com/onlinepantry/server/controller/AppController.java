package com.onlinepantry.server.controller;

import com.onlinepantry.common.json.RegisterMessage;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AppController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @PostMapping("/register")
    public void registerUser(@Validated @RequestBody RegisterMessage message){ //validation annotation for doing validation defined in RegisterMessage

       log.info("Register message: {}", message);

    }

}
