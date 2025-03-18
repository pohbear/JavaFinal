package com.tutormatch.user;

public class Tutor extends User {
    private String subject;
    private double hourlyRate;

    public Tutor(String username, String email, String subject, double hourlyRate) {
        super(username, email);
        this.subject = subject;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void displayRole() {
        System.out.println(username + " is a Tutor for " + subject);
    }
}

