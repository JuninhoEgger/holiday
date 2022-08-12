package com.egger.holiday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableFeignClients
@EnableWebMvc
@SpringBootApplication
public class HolidayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolidayApplication.class, args);
    }

}
