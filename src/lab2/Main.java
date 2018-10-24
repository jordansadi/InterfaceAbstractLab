package lab2;

/**
 * This is the driver class for this package
 * It creates an instance of each type of course, then uses each method for each course
 * Results are printed to the console to verify that each method worked correctly
 * @author Jordan Sadi
 * @version 1.00
 */
public class Main {
    public static void main(String[] args) {
        /*
        In this program, using an interface is extremely inefficient
        Each type of courses uses several of the same method, but each method must be redefined in each class
        Each type of course also has several of the same variables, which also must be redefined in each class
         */

        // Liskov substitution is not possible because an instance cannot be created of an interface
        // that's not true...I was just doing it wrong
        // only introProgramming can be declared as a Course, because the other courses need access to setPrerequisites
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "152 135");
        IntroJavaCourse introJava = new IntroJavaCourse("Java Programming", "152 134");
        Course introProgramming = new IntroToProgrammingCourse("Introduction to Programming",
                "152 107");

        advancedJava.setCredits(4.0);
        introJava.setCredits(4.0);
        introProgramming.setCredits(2.0);

        introJava.setPrerequisites(introProgramming.getCourseNumber());
        advancedJava.setPrerequisites(introJava.getCourseNumber());

        System.out.println(introProgramming.getCourseName() + " is a " + introProgramming.getCredits()
                + " credit course and has no prerequisites");
        System.out.println(introJava.getCourseName() + " is a " + introJava.getCredits()
                + " credit course with a prerequisite of " + introJava.getPrerequisites());
        System.out.println(advancedJava.getCourseName() + " is a " + advancedJava.getCredits()
                + " credit course with a prerequisite of " + advancedJava.getPrerequisites());
    }
}
