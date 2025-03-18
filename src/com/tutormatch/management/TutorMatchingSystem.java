package com.tutormatch.management;

import com.tutormatch.user.Tutor;
import com.tutormatch.user.Tutee;
import com.tutormatch.session.Session;
import java.util.ArrayList;
import java.util.List;

public class TutorMatchingSystem {
    private List<Tutor> tutors;
    private List<Tutee> tutees;
    private List<Session> sessions;

    public TutorMatchingSystem() {
        tutors = new ArrayList<>();
        tutees = new ArrayList<>();
        sessions = new ArrayList<>();
    }

    public void start() {
        System.out.println("Tutor Matching System is now running...");
    }
}
