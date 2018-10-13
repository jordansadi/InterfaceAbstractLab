package lab2;

import javax.swing.JOptionPane;

/**
 * This class implements the Course interface and defines an AdvancedJavaCourse.
 * @author Jordan Sadi
 * @version 1.00
 */
public class AdvancedJavaCourse implements Course {
    private String courseName, courseNumber, prerequisites;
    private double credits;

    /**
     * This constructor creates an instance of the AdvancedJavaCourse class
     * @param courseName String the name of the AdvancedJavaCourse
     * @param courseNumber String the course number for the AdvancedJavaCourse
     */
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    /**
     * This method returns the value of the courseNumber for an AdvancedJavaCourse
     * @return String the courseNumber for the AdvancedJavaCourse
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * This method attempts to set the value of the courseNumber for an AdvancedJavaCourse
     * If the parameter is null or empty, an error message is displayed
     * @param courseNumber double the intended courseNumber for the AdvancedJavaCourse
     */
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    /**
     * This method returns the value of the credits for an AdvancedJavaCourse
     * @return double the credits for the AdvancedJavaCourse
     */
    public double getCredits() {
        return credits;
    }

    /**
     * This method attempts to set the value of the credits for an AdvancedJavaCourse
     * If the parameter is not within the desired range, an error message is displayed
     * @param credits double the intended number of credits for the AdvancedJavaCourse
     */
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
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

    /**
     * This method returns the value of the courseName for an AdvancedJavaCourse
     * @return String the courseName for the AdvancedJavaCourse
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method attempts to set the value of the courseName for an AdvancedJavaCourse
     * If the parameter is null or empty, an error message is displayed
     * @param courseName double the intended courseName for the AdvancedJavaCourse
     */
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
}