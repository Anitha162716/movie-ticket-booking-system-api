package com.example.movieticketbookingsystem.exceptions;

public class NoOfRowsExceedCapacityException extends RuntimeException {
    private String message;

    public NoOfRowsExceedCapacityException(String message) {
        this.message = message;
    }
}

