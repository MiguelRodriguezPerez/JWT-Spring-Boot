package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
public class LoginResponse {
    private String token;

    private long expiresIn;

    public String getToken() {
        return token;
    }

    public LoginResponse setToken(String token){
        this.token = token;
        return this;
    }

    public LoginResponse setExpiresIn(long expiresIn){
        this.expiresIn = expiresIn;
        return this;
    }
}
