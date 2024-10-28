package com.devstudios.portfolio.portfolio_backend.application.dtos.coment;




public class Coment {

    private String username;
    private String content;
    private int stars;


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
