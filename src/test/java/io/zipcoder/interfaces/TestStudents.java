package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {


    @Test
    public void testGetInstance() {
        // Given
        Students students = new Students();

        // When
        Students instance = students.getInstance();

        // Then
        Assert.assertEquals(instance, students.getInstance());

    }
}
