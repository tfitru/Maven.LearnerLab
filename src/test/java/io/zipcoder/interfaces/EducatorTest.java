package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {


    @Test
    public void testImplementation() {
        // Given
        Instructor dolio = Educator.INSTRUCTOR1.getInstructor();

        // Then
        Assert.assertTrue(dolio instanceof Instructor);

    }

    @Test
    public void testInheritance() {
        // Given
        Instructor kris = Educator.INSTRUCTOR2.getInstructor();

        // Then
        Assert.assertTrue(kris instanceof Instructor);
    }


    @Test
    public void testTeach() {
        // Given
        Instructor dolio = Educator.INSTRUCTOR1.getInstructor();
        Student bob = new Student(24, null);
        dolio.teach(bob, 100);
        Double expectedDouble = 100.0;


        // When
        Double actualDouble = bob.getTotalStudyTime();


        // Then
        Assert.assertEquals(expectedDouble,actualDouble);
    }


    @Test
    public void testLecture() {
        // Given
        Instructor kris = Educator.INSTRUCTOR1.getInstructor();
        Student bob = new Student(35, "bob");
        Student frank = new Student(35, "frank");
        Student butts = new Student(35, "butts");
        Student kramer = new Student(35, "kramer");
        Student gwen = new Student(35, "gwen");
        ZipCodeWilmington.getInstance().add(bob);
        ZipCodeWilmington.getInstance().add(frank);
        ZipCodeWilmington.getInstance().add(butts);
        ZipCodeWilmington.getInstance().add(kramer);
        ZipCodeWilmington.getInstance().add(gwen);
        Double expectedHours = 10.0;



      // When
        ZipCodeWilmington.getInstance().hostLecture(Educator.INSTRUCTOR2, 50);
        Double numberOfHours = Students.getInstance().instanceList.get(0).getTotalStudyTime();
        // Then
        Assert.assertEquals(expectedHours, numberOfHours);

    }

    @Test
    public void testLecture_testTimeWorked() {
        // Given
        Instructor kris = Educator.INSTRUCTOR1.getInstructor();
        Student bob = new Student(35, "bob");
        Student frank = new Student(35, "frank");
        Student butts = new Student(35, "butts");
        Student kramer = new Student(35, "kramer");
        Student gwen = new Student(35, "gwen");
        ZipCodeWilmington.getInstance().add(bob);
        ZipCodeWilmington.getInstance().add(frank);
        ZipCodeWilmington.getInstance().add(butts);
        ZipCodeWilmington.getInstance().add(kramer);
        ZipCodeWilmington.getInstance().add(gwen);
        Double expectedWorkedHours = 50.0;
        // When
        ZipCodeWilmington.getInstance().hostLecture(Educator.INSTRUCTOR2.getInstructor().getId(), 50);
        Double numberOfHours1 = Educator.INSTRUCTOR2.getTimeWorked();
        // Then
        Assert.assertEquals(expectedWorkedHours, numberOfHours1);

    }



}




