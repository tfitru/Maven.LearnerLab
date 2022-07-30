package io.zipcoder.interfaces;

import java.util.List;

public interface Teacher {

    void teach(Learner learner, double numberOfHours);

    void lecture(List<Student> learners, double numberOfHours);


}
