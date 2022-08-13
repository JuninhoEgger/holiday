package com.egger.holiday.service;

import com.egger.holiday.feign.HolidayFeignClient;
import com.egger.holiday.mapper.HolidayMapper;
import com.egger.holiday.model.response.Holiday;
import com.egger.holiday.model.response.HolidayResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HolidayServiceTest {

    @Mock
    private HolidayFeignClient holidayFeignClient;
    @Mock
    private HolidayMapper holidayMapper;
    @InjectMocks
    private HolidayService holidayService;

    @Test
    void shouldReturnHolidaysWithYear() {
        //Given
        String year = "2022";
        List<Holiday> holidays = mockListHoliday();
        List<HolidayResponse> holidayResponse = mockHolidayResponse();

        //When
        when(holidayFeignClient.getHolidaysByYear(year)).thenReturn(holidays);
        when(holidayMapper.toHolidayResponse(holidays)).thenReturn(holidayResponse);
        List<HolidayResponse> actual = holidayService.getHolidaysByYear(year);

        //Then
        assertEquals("2022-01-01", actual.get(0).getDate(), "Deve retornar a mesma data");
        assertEquals("Confraternização mundial", actual.get(0).getName(), "Deve retornar o mesmo nome do feriado");
    }

    private List<Holiday> mockListHoliday() {
        Holiday holiday = new Holiday();
        holiday.setDate("2022-01-01");
        holiday.setName("Confraternização mundial");
        holiday.setType("national");
        List<Holiday> holidayList = new ArrayList<>();
        holidayList.add(holiday);
        return holidayList;
    }

    private List<HolidayResponse> mockHolidayResponse() {
        List<HolidayResponse> holidayResponseList = new ArrayList<>();
        HolidayResponse holidayResponse = new HolidayResponse();
        holidayResponse.setDate("2022-01-01");
        holidayResponse.setName("Confraternização mundial");
        holidayResponseList.add(holidayResponse);
        return holidayResponseList;
    }

}
