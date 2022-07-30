package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestInstructors {

    @Test
    public void testImplementation() {
        // Given
        Instructor instructor = new Instructor(35, "Frank");




        // Then
        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(45, "Frank");


        Assert.assertTrue(instructor instanceof Teacher);


    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(55, "Frank");
        Student student = new Student(55, "Trunk");

        instructor.teach(student, 50);
        Double numberOfHoursExpected = student.getTotalStudyTime();
        Double actual = student.getTotalStudyTime();



        Assert.assertEquals(numberOfHoursExpected, actual);

    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(55, "Frank");
        Student student = new Student(55, "Trunk");
        Student student1 = new Student(55, "Franklin");
        Student student2 = new Student(55, "Jimmy");
        Student student3 = new Student(55, "Grant");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        instructor.lecture(studentList, 50);
        Double numberOfHoursExpected = student.getTotalStudyTime();
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(numberOfHoursExpected, actual);

    }

}
