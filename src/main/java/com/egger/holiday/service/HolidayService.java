package com.egger.holiday.service;

import com.egger.holiday.feign.HolidayFeignClient;
import com.egger.holiday.model.response.HolidayResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayService {

    private final HolidayFeignClient holidayFeignClient;

    public HolidayService(HolidayFeignClient holidayFeignClient) {
        this.holidayFeignClient = holidayFeignClient;
    }

    public List<HolidayResponse> getHolidaysByYear(String year) {
        return holidayFeignClient.getHolidaysByYear(year);
    }
}
