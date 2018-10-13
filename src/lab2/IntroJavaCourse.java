package lab2;

import javax.swing.*;

/**
 * This class implements the Course interface and defines an IntroJavaCourse.
 * @author Jordan Sadi
 * @version 1.00
 */
public class IntroJavaCourse implements Course {
    private String courseName, courseNumber, prerequisites;
    private double credits;

    /**
     * This constructor creates an instance of the IntroJavaCourse class
     * @param courseName String the name of the IntroJavaCourse
     * @param courseNumber String the course number for the IntroJavaCourse
     */
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    /**
     * This method returns the value of the courseNumber for an IntroJavaCourse
     * @return String the courseNumber for the IntroJavaCourse
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * This method attempts to set the value of the courseNumber for an IntroJavaCourse
     * If the parameter is null or empty, an error message is displayed
     * @param courseNumber double the intended courseNumber for the IntroJavaCourse
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
     * This method returns the value of the credits for an IntroJavaCourse
     * @return double the credits for the IntroJavaCourse
     */
    public double getCredits() {
        return credits;
    }

    /**
     * This method attempts to set the value of the credits for an IntroJavaCourse
     * If the parameter is not within the desired range, an error message is displayed
     * @param credits double the intended number of credits for the IntroJavaCourse
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

    /**
     * This method returns the value of the courseName for an IntroJavaCourse
     * @return String the courseName for the IntroJavaCourse
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method attempts to set the value of the courseName for an IntroJavaCourse
     * If the parameter is null or empty, an error message is displayed
     * @param courseName double the intended courseName for the IntroJavaCourse
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