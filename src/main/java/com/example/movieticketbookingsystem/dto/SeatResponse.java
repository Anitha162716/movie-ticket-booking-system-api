package com.example.movieticketbookingsystem.dto;

import lombok.Builder;

@Builder
public record SeatResponse(
        String seatId,
        String name

) {
}
