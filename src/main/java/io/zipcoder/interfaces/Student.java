package io.zipcoder.interfaces;

import java.util.List;

public class Student extends Person implements Learner {
    private double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);
        Students.getInstance().add(this);

    }



    @Override
    public void learn(double numberOfHours) {
        for(int i =0; i<numberOfHours; i++) {
            this.totalStudyTime++;
        }
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }






}
