package lab1;

import javax.swing.*;

/**
 * This abstract class defines a Course and is inherited by each specific course within the program.
 * @author Jordan Sadi
 * @version 1.00
 */
public abstract class Course {
    private String courseName, courseNumber;
    private double credits;

    /**
     * This method returns the value of the courseNumber for a Course
     * @return String the courseNumber for the Course
     */
    public final String getCourseNumber() {
        return courseNumber;
    }

    /**
     * This method returns the value of the courseName for a Course
     * @return String the courseName for the Course
     */
    public final String getCourseName() {
        return courseName;
    }

    /**
     * This method returns the value of the credits for a Course
     * @return double the credits for the Course
     */
    public final double getCredits() {
        return credits;
    }

    /**
     * This method attempts to set the value of the credits for a Course
     * If the parameter is not within the desired range, an error message is displayed
     * @param credits double the intended number of credits for the Course
     */
    public final void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    /**
     * This method attempts to set the value of the courseNumber for a Course
     * If the parameter is null or empty, an error message is displayed
     * @param courseNumber double the intended courseNumber for the Course
     */
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null or empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    /**
     * This method attempts to set the value of the courseName for a Course
     * If the parameter is null or empty, an error message is displayed
     * @param courseName double the intended courseName for the Course
     */
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null or empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    /**
     * This constructor creates an instance of the Course class
     * @param courseName String the intended courseName for the Course
     * @param courseNumber String the intended courseNumber for the Course
     */
    public Course(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
    }
}