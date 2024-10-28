package com.devstudios.portfolio.portfolio_backend.presentation.interceptors;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;




@ControllerAdvice
public class HandleErrors {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Map<String, Object>> handleDuplicatedKeys( DataIntegrityViolationException ex ){
        String key = ex.getMessage().split("\\(")[1].split("\\)")[0];
        String value = ex.getMessage().split("\\(")[2].split("\\)")[0];

        String message = "Coment with '" + key + ": " + value + "' already exists";

        return getResponse(message, 400);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleBadRequest( MethodArgumentNotValidException ex ){
        List<String> errors = ex.getBindingResult()
            .getFieldErrors().stream()
                .map( e -> {
                    String field = e.getField();
                    String err = e.getDefaultMessage();

                    return field + ": " + err;
                }).toList();

        return getResponse(errors, 400);
    }

    private ResponseEntity<Map<String, Object>> getResponse( Object err, int status ){
        Map<String, Object> res = new HashMap<>();

        res.put("err", err);
        res.put("date", LocalDate.now());
        res.put("status", status);

        return ResponseEntity.status(status).body(res);
    }

}
