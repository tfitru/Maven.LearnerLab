package io.zipcoder.interfaces;

import java.util.List;

public class Instructor extends Person implements Teacher {

    double numberOfHoursPerLearner;


    public Instructor(long id, String name) {
        super(id, name);


    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(List<Student> learners, double numberOfHours) {

        numberOfHoursPerLearner = numberOfHours/learners.size();

        for(int i = 0; i<learners.size(); i++){
            learners.get(i).learn(numberOfHoursPerLearner);
        }


    }

}
