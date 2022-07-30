package io.zipcoder.interfaces;

import java.util.List;

public enum Educator implements Teacher {

    INSTRUCTOR1(new Instructor(3, "Dolio")),
    INSTRUCTOR2(new Instructor(5, "Kris"));

    private final Instructor instructor;

    private double timeWorked;

    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    Educator(Instructor instructor) {
        this.instructor = instructor;

    }

    public Instructor getInstructor() {
        return this.instructor;
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
    }

    @Override
    public void lecture(List<Student> learners, double numberOfHours) {

    }
}
