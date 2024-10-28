package com.devstudios.portfolio.portfolio_backend.application.dtos.response;

import java.time.LocalDate;



public class ResponseDto<T> {

    private T data;
    private String message;
    private int status;
    private LocalDate date = LocalDate.now();


    public ResponseDto(){}

    public ResponseDto(T data, String message, int status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }


    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

}
