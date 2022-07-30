package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {


    @Test
    public void testAdd() {
        // Given
        Person person = new Person(35, "Person");
        People<Person> x = new People<Person>() {
            @Override
            public Person toArray() {
                return null;
            }
        };

        x.add(person);

        // Then

        Assert.assertTrue(x.contains(person));


    }

    @Test
    public void testRemove() {
        // Given
        Person person = new Person(45, "Bob");
        People<Person> x = new People<Person>() {
            @Override
            public Person toArray() {
                return null;
            }
        };
        x.add(person);

        // When
        x.remove(person);

        // Then
        Assert.assertFalse(x.contains(person));
    }


    @Test
    public void testFindById() {
        // Given
        Person person = new Person(234, null);
        Person expectedPerson = person;
        People<Person> x = new People<Person>() {
            @Override
            public Person toArray() {
                return null;
            }
        };

        x.add(person);
        Person actualId = x.findById(234);

        // Then
        Assert.assertEquals(expectedPerson, actualId);
    }
}
