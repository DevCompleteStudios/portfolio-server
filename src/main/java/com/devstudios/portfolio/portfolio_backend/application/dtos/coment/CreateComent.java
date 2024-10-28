package com.devstudios.portfolio.portfolio_backend.application.dtos.coment;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class CreateComent {

    @NotEmpty
    @Email
    private String email;

    @Size(min=5, max=100)
    @NotEmpty
    private String username;

    @NotEmpty
    @Size(min=10, max=250)
    private String content;

    @NotEmpty
    @Min(value = 1)
    @Max(value= 5)
    private int stars;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
