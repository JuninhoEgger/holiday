package com.egger.holiday.resource;

import com.egger.holiday.api.HolidayApi;
import com.egger.holiday.model.response.HolidayResponse;
import com.egger.holiday.service.HolidayService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@Api(tags = {"Feriados"})
public class HolidayResource implements HolidayApi {

    private final HolidayService holidayService;

    public HolidayResource(HolidayService holidayService) {
        this.holidayService = holidayService;
    }

    @Override
    public ResponseEntity<List<HolidayResponse>> getHolidaysByYear(String year, HttpServletRequest request) {
        return ok().body(holidayService.getHolidaysByYear(year));
    }
}
