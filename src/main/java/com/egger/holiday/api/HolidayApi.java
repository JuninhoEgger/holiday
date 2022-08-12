package com.egger.holiday.api;

import com.egger.holiday.model.response.HolidayResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api("Feriados")
@RequestMapping("/holidays")
public interface HolidayApi {

    @ApiOperation(
            value = "Busca uma lista de feriados",
            nickname = "getHolidaysByYear",
            notes = "Busca uma lista de feriados conforme o ano informado"
    )
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK")})
    @GetMapping(value = "getHolidaysByYear/{year}", produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<HolidayResponse>> getHolidaysByYear(
            @ApiParam(value = "O ano que deseja saber os feriados", required = true)
            @PathVariable("year") String year, HttpServletRequest request
    );

}
