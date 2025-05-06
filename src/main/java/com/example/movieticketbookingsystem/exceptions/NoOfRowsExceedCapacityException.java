package com.example.movieticketbookingsystem.exceptions;

import lombok.Getter;

@Getter
public class NoOfRowsExceedCapacityException extends RuntimeException {

    private String message;

    public NoOfRowsExceedCapacityException(String message) {
        this.message = message;
    }
}