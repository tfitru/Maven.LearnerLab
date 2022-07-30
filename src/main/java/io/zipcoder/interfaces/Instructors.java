package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Instructors extends People<Instructor>{

    private static final Instructors instance = new Instructors();
    public List<Educator> instanceList;


    Instructors() {
        this.instanceList = new ArrayList<>();
        this.instanceList.add(Educator.INSTRUCTOR1);
        this.instanceList.add(Educator.INSTRUCTOR2);
    }

    public static Instructors getInstance() {
        return instance;
    }

    public void add(Educator instructor){
        this.instanceList.add(instructor);
    }

    @Override
    public Instructor toArray() {
        return null;
    }



}
