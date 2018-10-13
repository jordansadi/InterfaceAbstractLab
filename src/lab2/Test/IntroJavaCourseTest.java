package lab2.Test;

import org.junit.*;
import lab2.IntroJavaCourse;

public class IntroJavaCourseTest extends junit.framework.TestCase {
    public IntroJavaCourseTest() {}

    IntroJavaCourse testIJC;

    @Before
    public void setUp() throws Exception {
        testIJC = new IntroJavaCourse("Intro to Java", "152 134");
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetPrerequisites() {
        assertNull(testIJC.getPrerequisites());
        testIJC.setPrerequisites("152 107");
        assertEquals(testIJC.getPrerequisites(), "152 107");
        assertNotSame(testIJC.getPrerequisites(), "152 134");
    }

    @Test
    public void testGetCredits() {
        testIJC.setCredits(4.0);
        assertEquals(testIJC.getCredits(), 4.0);
        assertNotSame(testIJC.getCredits(), 2.0);
    }

    @Test
    public void testGetCourseNumber() {
        assertEquals(testIJC.getCourseNumber(), "152 134");
        assertNotSame(testIJC.getCourseNumber(), "152 135");
    }

    @Test
    public void testGetCourseName() {
        assertEquals(testIJC.getCourseName(), "Intro to Java");
        assertNotSame(testIJC.getCourseName(), "Introduction to Programming");
    }
}