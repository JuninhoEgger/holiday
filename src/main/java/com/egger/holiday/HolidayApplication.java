package com.egger.holiday;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.boot.SpringApplication.run;

@EnableFeignClients
@EnableWebMvc
@SpringBootApplication
public class HolidayApplication {

    public static void main(String[] args) {
        run(HolidayApplication.class, args);
    }

}
