package com.onlinepantry.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableTransactionManagement
public class OnlinePantryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlinePantryServerApplication.class,args);
    }

}
