package com.devstudios.portfolio.portfolio_backend.presentation.interceptors;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;




@ControllerAdvice
public class HandleErrors {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDuplicatedKeys( DataIntegrityViolationException ex ){
        String key = ex.getMessage().split("\\(")[1].split("\\)")[0];
        String value = ex.getMessage().split("\\(")[2].split("\\)")[0];

        String message = "Coment with '" + key + ": " + value + "' already exists";

        return ResponseEntity.status(200).body(message);
    }

}
