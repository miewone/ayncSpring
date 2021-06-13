package com.example.ayncspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AyncSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AyncSpringApplication.class, args);
    }

}
