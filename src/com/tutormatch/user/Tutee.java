package com.tutormatch.user;

public class Tutee extends User {
    private String learningGoal;

    public Tutee(String username, String email, String learningGoal) {
        super(username, email);
        this.learningGoal = learningGoal;
    }

    @Override
    public void displayRole() {
        System.out.println(username + " is a Tutee aiming to learn " + learningGoal);
    }
}

