import io.zipcoder.interfaces.*;
import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture() {
        // Given
        Educator instructor1 = Educator.INSTRUCTOR1;
        Student student = new Student(50, "James");
        Student student1 = new Student(50, "Robert");
        Student student2 = new Student(50, "Kim");
        ZipCodeWilmington.getInstance().add(student);
        ZipCodeWilmington.getInstance().add(student1);
        ZipCodeWilmington.getInstance().add(student2);
        ZipCodeWilmington.getInstance().add(instructor1);
        Double expectedStudentHours = 34.0;

        // When
        ZipCodeWilmington.getInstance().hostLecture(instructor1.getInstructor().getId(), 50);
       Double actualStudentsHours = Students.getInstance().instanceList.get(0).getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudentHours, actualStudentsHours);
    }
}
