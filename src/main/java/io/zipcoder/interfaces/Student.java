package io.zipcoder.interfaces;

public class Student extends Person implements Person.Learner {
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
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

    public interface Teacher {
        void teach(Learner learner, double numberOfHours);

        void lecture(Learner[] learners, double numberOfHours);

    }



}
