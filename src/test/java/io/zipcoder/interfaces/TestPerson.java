package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {


    @Test
    public void testConstructor() {
        // Given
        String expectedName = "";
        long expectedId = Integer.MAX_VALUE;
        Person person = new Person(expectedId, expectedName);

        //When
        String actualName = person.getName();
        long actualId = person.getId();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    public void testSetName() {
        // Given
        String expectedName = "Frank";
        long expectedId = Integer.MAX_VALUE;
        Person person = new Person(expectedId, expectedName);

        //When
        String actualName = person.getName();
        long actualId = person.getId();


        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);

    }
}
