package com.tutormatch.session;

public class Service {
    private String subject;
    private double hourlyRate;

    public Service(String subject, double hourlyRate) {
        this.subject = subject;
        this.hourlyRate = hourlyRate;
    }

    public void displayService() {
        System.out.println("Service: " + subject + " at $" + hourlyRate + "/hour");
    }
}
