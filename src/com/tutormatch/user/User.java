package com.tutormatch.user;

public abstract class User {
    public String username;
    public String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public abstract void displayRole();
}

