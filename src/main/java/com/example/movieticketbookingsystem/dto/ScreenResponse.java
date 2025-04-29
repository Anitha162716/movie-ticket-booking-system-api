package com.example.movieticketbookingsystem.dto;

import com.example.movieticketbookingsystem.enums.ScreenType;
import lombok.Builder;

import java.util.List;

@Builder
public record ScreenResponse(
        String screenId,
        ScreenType screenType,
        Integer capacity,
        Integer noOfRows,
        List<SeatResponse> seats


) {
}
