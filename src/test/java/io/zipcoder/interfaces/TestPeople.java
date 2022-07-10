package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    private List<Person> personList = new ArrayList<>();


    @Test
    public void testAdd() {
        // Given
        Person person = new Person(35, "Person");

        // When
        personList.add(person);

        // Then
        System.out.println(personList);

    }

    @Test
    public void testRemove() {
        // Given
        Person person = new Person(45, "Bob");
        personList.add(person);



        // When
        personList.remove(person);


        // Then
        System.out.println(personList);

    }


    @Test
    public void testFindById() {
        // Given




        // When



        // Then




    }



}
