package lab2;

import javax.swing.JOptionPane;

/**
 * This class implements the Course interface and defines an IntroToProgrammingCourse.
 * @author Jordan Sadi
 * @version 1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName, courseNumber;
    private double credits;

    /**
     * This constructor creates an instance of the IntroToProgrammingCourse class
     * @param courseName String the name of the IntroToProgrammingCourse
     * @param courseNumber String the course number for the IntroToProgrammingCourse
     */
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    /**
     * This method returns the value of the courseNumber for an IntroToProgrammingCourse
     * @return String the courseNumber for the IntroToProgrammingCourse
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * This method attempts to set the value of the courseNumber for an IntroToProgrammingCourse
     * If the parameter is null or empty, an error message is displayed
     * @param courseNumber double the intended courseNumber for the IntroToProgrammingCourse
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
     * This method returns the value of the credits for an IntroToProgrammingCourse
     * @return double the credits for the IntroToProgrammingCourse
     */
    public double getCredits() {
        return credits;
    }

    /**
     * This method attempts to set the value of the credits for an IntroToProgrammingCourse
     * If the parameter is not within the desired range, an error message is displayed
     * @param credits double the intended number of credits for the IntroToProgrammingCourse
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
     * This method returns the value of the courseName for an IntroToProgrammingCourse
     * @return String the courseName for the IntroToProgrammingCourse
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * This method attempts to set the value of the courseName for an IntroToProgrammingCourse
     * If the parameter is null or empty, an error message is displayed
     * @param courseName double the intended courseName for the IntroToProgrammingCourse
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