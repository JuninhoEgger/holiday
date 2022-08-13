package com.egger.holiday;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.egger.holiday.HolidayApplication.main;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class HolidayResponseApplicationTests {

    @Test
    void contextLoads() {
        main(new String[]{});
        assertTrue(true);
    }

}
