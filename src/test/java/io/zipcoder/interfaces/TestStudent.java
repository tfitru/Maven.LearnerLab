package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        // When
        Student student = new Student(23, null);



        // Given
        if(student instanceof Person.Learner){
            System.out.println("This is true!");
        }



        // Then
        Assert.assertTrue(student instanceof Person.Learner);
    }


    @Test
    public void testInheritance() {
        // When
        Student student = new Student(25, null);


        // Given
        if(student instanceof Person){
            System.out.println("True!");
        } else {
            System.out.println("False");
        }

        // Then
        Assert.assertTrue(student instanceof Person);
    }


    @Test
    public void testTotalStudyTime() {

        // Given
        Student student = new Student(30, null);
        student.learn(100);
        Double expectedDouble = 100.0;


//        public void learn(double numberOfHours) {
//            for(int i =0; i<numberOfHours; i++) {
//                this.totalStudyTime++;
//            }
//        }


        // When
        Double acutalDouble = student.getTotalStudyTime();



        // Then

        Assert.assertEquals(expectedDouble, acutalDouble);


    }






}
