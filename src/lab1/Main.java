package lab1;

public class Main {
    public static void main(String[] args) {
        /*
        using abstraction and inheritance significantly reduced the amount of code necessary for this program
        this saved both time and effort and reduced the lines of code in the program by approximately 120
        */

        /*
        in this main method, advancedJava and introJava both need to access the setPrerequisites() and
        getPrerequisites() methods, which are not in the Course abstract class
        because of this, they cannot be declared as Courses and must instead be an AdvancedJavaCourse and IntroJavaCourse
        */
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "152 135");
        IntroJavaCourse introJava = new IntroJavaCourse("Java Programming", "152 134");

        /*
        the IntroToProgrammingCourse class contains nothing that is not part of the Course abstract class
        because of this, introProgramming can be declared as a Course
        */
        Course introProgramming = new IntroToProgrammingCourse("Introduction to Programming", "152 107");

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
