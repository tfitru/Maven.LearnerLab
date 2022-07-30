import io.zipcoder.interfaces.*;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        // Given
        Instructor teacher = new Instructor(1, null);

        // When
        if(teacher instanceof Teacher){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        // Then
        Assert.assertTrue(teacher instanceof Instructor);

    }


    @Test
    public void testInheritance() {
        // Given
        Instructor teacher = new Instructor(5, null);



        // When
        if(teacher instanceof Person){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        // Then

        Assert.assertTrue(teacher instanceof Person);
    }

    @Test
    public void testTeach() {
        // Given
        Instructor teacher = new Instructor(35, null);
        Student bob = new Student(24, null);
        teacher.teach(bob, 100);
        Double expectedDouble = 100.0;


        // When
        Double actualDouble = bob.getTotalStudyTime();



        // Then
        Assert.assertEquals(expectedDouble,actualDouble);
    }



}
