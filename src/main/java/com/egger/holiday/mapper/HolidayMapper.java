package com.egger.holiday.mapper;

import com.egger.holiday.model.response.Holiday;
import com.egger.holiday.model.response.HolidayResponse;
import org.mapstruct.Mapper;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface HolidayMapper {

    List<HolidayResponse> toHolidayResponse(List<Holiday> holiday);

}
