package lab1;

import javax.swing.*;

/**
 * This class inherits from the Course abstract class and defines an IntroJavaCourse.
 * @author Jordan Sadi
 * @version 1.00
 */
public class IntroJavaCourse extends Course {
    private String prerequisites;

    /**
     * This constructor creates an instance of the IntroJavaCourse class
     * @param courseName String the name of the IntroJavaCourse
     * @param courseNumber String the course number for the IntroJavaCourse
     */
    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    /**
     * This method returns the value of the prerequisites for an IntroJavaCourse instance
     * @return String the prerequisites for the IntroJavaCourse
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * This method attempts to set the value of the prerequisites for an IntroJavaCourse instance
     * If the parameter is null or empty, an error message is displayed
     * @param prerequisites String the intended prerequisite(s) for the IntroJavaCourse
     */
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}