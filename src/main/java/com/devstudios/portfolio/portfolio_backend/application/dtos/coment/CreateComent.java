package com.devstudios.portfolio.portfolio_backend.application.dtos.coment;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateComent {

    @NotNull
    @Email
    private String email;

    @Size(min=5, max=100)
    @NotNull
    private String username;

    @NotNull
    @Size(min=10, max=250)
    private String content;

    @NotNull
    @Min(value = 1)
    @Max(value= 5)
    private int stars;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.trim().toLowerCase();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

}
