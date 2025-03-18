package com.tutormatch;

import com.tutormatch.management.TutorMatchingSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Tutor-Tutee Matching Platform!");
        TutorMatchingSystem system = new TutorMatchingSystem();
        system.start();
    }
}
