package com.tutormatch.management;

import com.tutormatch.user.Tutor;
import com.tutormatch.user.Tutee;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Tutor> tutors = new ArrayList<>();
    private List<Tutee> tutees = new ArrayList<>();

    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
    }

    public void addTutee(Tutee tutee) {
        tutees.add(tutee);
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public List<Tutee> getTutees() {
        return tutees;
    }
}
