package lab1;

/**
 * This class inherits from the Course abstract class and defines an IntroToProgrammingCourse
 * @author Jordan Sadi
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course {
    /**
     * This constructor creates an instance of the IntroToProgrammingCourse class
     * @param courseName String the name of the IntroToProgrammingCourse
     * @param courseNumber String the course number for the IntroToProgrammingCourse
     */
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }
}