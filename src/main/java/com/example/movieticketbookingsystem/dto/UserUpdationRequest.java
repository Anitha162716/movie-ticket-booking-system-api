package com.example.movieticketbookingsystem.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record UserUpdationRequest(
        String username,
//        String email,
        String phoneNumber,
        LocalDate dateOfBirth
)
{}
