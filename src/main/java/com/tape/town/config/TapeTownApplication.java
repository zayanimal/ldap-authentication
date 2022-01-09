package com.tape.town.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("development")
public class TapeTownApplication {

    public static void main(String[] args) {
        SpringApplication.run(TapeTownApplication.class, args);
    }
}
