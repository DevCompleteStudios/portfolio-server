package com.devstudios.portfolio.portfolio_backend.application.dtos.coment;

import java.time.LocalDate;



public class ComentDto {

    private Long id;
    private String content;
    private String username;
    private int stars;
    private LocalDate date;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getStars() {
        return stars;
    }
    public void setStars(int stars) {
        this.stars = stars;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }


    

}
