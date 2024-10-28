package com.devstudios.portfolio.portfolio_backend.application.dtos.contact;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;


public class EmailContactDto {

    @Email
    private String email;

    @Size(max = 100)
    private String username;

    @Size(min=8, max=12)
    private Long phoneNumber;

    @Size(min = 5, max = 250)
    private String content;


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
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
