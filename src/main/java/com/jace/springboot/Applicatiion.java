package com.jace.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Applicatiion {
    public static void main(String[] args) {
        SpringApplication.run(Applicatiion.class, args);
    }

}
