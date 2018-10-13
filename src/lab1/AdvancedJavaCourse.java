package lab1;

import javax.swing.JOptionPane;

/**
 * This class inherits from the Course abstract class and defines an AdvancedJavaCourse.
 * @author Jordan Sadi
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {
    private String prerequisites;

    /**
     * This constructor creates an instance of the AdvancedJavaCourse class
     * @param courseName String the name of the AdvancedJavaCourse
     * @param courseNumber String the course number for the AdvancedJavaCourse
     */
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    /**
     * This method returns the value of the prerequisites for an AdvancedJavaCourse instance
     * @return String the prerequisites for the AdvancedJavaCourse
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * This method attempts to set the value of the prerequisites for an AdvancedJavaCourse instance
     * If the parameter is null or empty, an error message is displayed
     * @param prerequisites String the intended prerequisite(s) for the AdvancedJavaCourse
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