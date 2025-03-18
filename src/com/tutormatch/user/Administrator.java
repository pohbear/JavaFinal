package com.tutormatch.user;

public class Administrator extends User {
    public Administrator(String username, String email) {
        super(username, email);
    }

    @Override
    public void displayRole() {
        System.out.println(username + " is an Administrator.");
    }
}