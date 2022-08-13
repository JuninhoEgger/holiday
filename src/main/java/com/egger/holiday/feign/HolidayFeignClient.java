package com.egger.holiday.feign;

import com.egger.holiday.model.response.Holiday;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(name = "holidayFeignClient", url = "https://brasilapi.com.br/api/feriados/v1")
public interface HolidayFeignClient {

    @GetMapping(path = "/{year}", produces = APPLICATION_JSON_VALUE)
    List<Holiday> getHolidaysByYear(@PathVariable("year") String year);

}
