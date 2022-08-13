package com.egger.holiday.service;

import com.egger.holiday.feign.HolidayFeignClient;
import com.egger.holiday.mapper.HolidayMapper;
import com.egger.holiday.model.response.HolidayResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayService {

    private final HolidayFeignClient holidayFeignClient;
    private final HolidayMapper holidayMapper;

    public HolidayService(HolidayFeignClient holidayFeignClient, HolidayMapper holidayMapper) {
        this.holidayFeignClient = holidayFeignClient;
        this.holidayMapper = holidayMapper;
    }

    public List<HolidayResponse> getHolidaysByYear(String year) {
        return holidayMapper
                .toHolidayResponse(holidayFeignClient.getHolidaysByYear(year));
    }

}
