package io.zipcoder.interfaces;

public class Person {

    private String name;

    final private long id;

    public Person(long id, String name){
        this.id = id;
        this.name = name;

    }

    public Long getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;

    }


    public interface Learner {
         void learn(double numberOfHours);

         Double getTotalStudyTime();
    }

}
