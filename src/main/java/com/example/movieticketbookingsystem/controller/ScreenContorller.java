package com.example.movieticketbookingsystem.controller;

import com.example.movieticketbookingsystem.dto.ScreenRequest;
import com.example.movieticketbookingsystem.dto.ScreenResponse;
import com.example.movieticketbookingsystem.service.ScreenService;
import com.example.movieticketbookingsystem.util.ResponseStructure;
import com.example.movieticketbookingsystem.util.RestResponseBuilder;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ScreenContorller {
        private final ScreenService screenService;
        private final RestResponseBuilder responseBuilder;

        @PostMapping("theaters/{theaterId}/screens")
        public ResponseEntity<ResponseStructure<ScreenResponse>> addScreen(@RequestBody ScreenRequest screenRequest, @PathVariable String theaterId){
            ScreenResponse screenResponse = screenService.addScreen(screenRequest, theaterId);
            return responseBuilder.sucess(HttpStatus.OK, "Screen has been successfully created", screenResponse);
        }
    @GetMapping("theaters/{theaterId}/screens/{screenId}")
    public ResponseEntity<ResponseStructure<ScreenResponse>> findScreen(@PathVariable String theaterId, @PathVariable String screenId){
        ScreenResponse screenResponse = screenService.findScreen(theaterId, screenId);
        return responseBuilder.sucess(HttpStatus.OK, "Screen has been successfully fetched", screenResponse);
    }






}

