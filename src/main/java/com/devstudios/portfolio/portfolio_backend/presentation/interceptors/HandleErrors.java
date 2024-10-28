package com.devstudios.portfolio.portfolio_backend.presentation.interceptors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;




@ControllerAdvice
public class HandleErrors {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<String> handleDuplicatedKeys( DataIntegrityViolationException ex ){
        Pattern pattern = Pattern.compile("Key \\((.*?)\\)=\\((.*?)\\)");
        Matcher matcher = pattern.matcher(ex.getMessage());

        String key = matcher.group(1);
        String value = matcher.group(2);

        String message = "Coment with " + key + ": " + value + " already exists";

        return ResponseEntity.status(200).body(message);
    }

}
