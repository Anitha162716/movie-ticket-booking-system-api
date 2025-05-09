package com.example.movieticketbookingsystem.exceptions.handler;

import com.example.movieticketbookingsystem.exceptions.NoOfRowsExceedCapacityException;
import com.example.movieticketbookingsystem.exceptions.ScreenNotFoundByIdException;
import com.example.movieticketbookingsystem.util.ErrorStructure;
import com.example.movieticketbookingsystem.util.RestResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@AllArgsConstructor

public class ScreenExceptionHandler {
    private final RestResponseBuilder responseBuilder;

    @ExceptionHandler
    public ResponseEntity<ErrorStructure> handleNoOfRowsExceedCapacityException(NoOfRowsExceedCapacityException ex) {
        return responseBuilder.errror(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<ErrorStructure> handleScreenNotFoundByIdException(ScreenNotFoundByIdException ex) {
        return responseBuilder.errror(HttpStatus.NOT_FOUND, ex.getMessage());
    }


}

