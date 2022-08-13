package com.egger.holiday.model.response;

import io.swagger.v3.oas.annotations.media.Schema;

public class Holiday {

    @Schema(description = "A data do feriado", example = "1998-01-01")
    private String date;

    @Schema(description = "O nome do feriado", example = "Confraternização mundial")
    private String name;

    @Schema(description = "O tipo do feriado", example = "national")
    private String type;

    public Holiday() {
    }

    public Holiday(String date, String name, String type) {
        this.date = date;
        this.name = name;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
