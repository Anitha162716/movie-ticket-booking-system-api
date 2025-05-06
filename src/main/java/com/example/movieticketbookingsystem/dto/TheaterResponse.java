package com.example.movieticketbookingsystem.dto;

import lombok.Builder;

@Builder
public record TheaterResponse(
        String theaterId,
        String name,
        String address,
        String city,
        String landmark

)
{}