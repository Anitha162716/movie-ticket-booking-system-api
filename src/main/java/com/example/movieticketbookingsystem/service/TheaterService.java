package com.example.movieticketbookingsystem.service;

import com.example.movieticketbookingsystem.dto.TheaterRegistrationRequest;
import com.example.movieticketbookingsystem.dto.TheaterRequest;
import com.example.movieticketbookingsystem.dto.TheaterResponse;

public interface TheaterService {
    TheaterResponse addTheater(String email, TheaterRequest theaterRequest);

    TheaterResponse addTheater(String email, TheaterRegistrationRequest theaterRegistrationRequest);
    TheaterResponse findTheater(String theaterId);
    TheaterResponse updateTheater(String theaterId, TheaterRequest registrationRequest);

}
