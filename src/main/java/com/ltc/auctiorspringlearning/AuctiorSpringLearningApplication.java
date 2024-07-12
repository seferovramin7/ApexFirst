package com.ltc.auctiorspringlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AuctiorSpringLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuctiorSpringLearningApplication.class, args);
    }

}
