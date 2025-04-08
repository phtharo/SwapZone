package com.example.savethanh2.model;

public class UserModel {
    private String userName;
    private String email;

    // Default constructor required for Firebase
    public UserModel() {
    }

    public UserModel(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
