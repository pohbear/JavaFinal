package com.tutormatch.session;

public class Feedback {
    private String review;
    private int rating;

    public Feedback(String review, int rating) {
        this.review = review;
        this.rating = rating;
    }

    public void displayFeedback() {
        System.out.println("Rating: " + rating + "/5 - " + review);
    }
}
