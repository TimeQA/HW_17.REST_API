package com.example.models;

public class LoginBodyPojoModel {
    private String email,
            password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    "{ \"email\": \"eve.holt@reqres.in\", \"password\": \"cityslicka\" }";


}