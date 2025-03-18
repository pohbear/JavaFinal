package com.tutormatch.session;

import com.tutormatch.user.Tutor;
import com.tutormatch.user.Tutee;

public class Session {
    private Tutor tutor;
    private Tutee tutee;
    private String dateTime;

    public Session(Tutor tutor, Tutee tutee, String dateTime) {
        this.tutor = tutor;
        this.tutee = tutee;
        this.dateTime = dateTime;
    }

    public void displaySession() {
        System.out.println("Session: " + tutor.username + " teaching " + tutee.username + " at " + dateTime);
    }
}
