package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class Students extends People<Student>{

    // Eager Initialization

    private static final Students instance = new Students();
    public List<Student> instanceList;

    Students() {
        this.instanceList = new ArrayList<>();
    }

    public static Students getInstance() {
        return instance;
    }

    public void add(Student student) {
        this.instanceList.add(student);
    }

    @Override
    public Student toArray() {
        return null;
    }

}
