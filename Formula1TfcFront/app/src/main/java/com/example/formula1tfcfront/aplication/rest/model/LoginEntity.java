package com.example.formula1tfcfront.aplication.rest.model;

public class LoginEntity {

    private String username;
    private String password;

    public LoginEntity() {
    }

    public LoginEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
