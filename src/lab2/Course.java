package lab2;

/**
 * This interface defines a Course and is implemented by each specific course within the program.
 * @author Jordan Sadi
 * @version 1.00
 */
public interface Course {
    String getCourseNumber();
    void setCourseNumber(String courseNumber);
    double getCredits();
    void setCredits(double credits);
    String getCourseName();
    void setCourseName(String courseName);
}
