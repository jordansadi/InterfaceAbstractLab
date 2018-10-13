package lab1.Test;

import lab2.IntroToProgrammingCourse;
import org.junit.*;

public class CourseTest extends junit.framework.TestCase {
    public CourseTest() {}

    private IntroToProgrammingCourse testITPC;

    @Before
    public void setUp() throws Exception {
        testITPC = new IntroToProgrammingCourse("Introduction to Programming", "152 107");
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetCredits() {
        testITPC.setCredits(2.0);
        assertEquals(testITPC.getCredits(), 2.0);
        assertNotSame(testITPC.getCredits(), 4.0);
    }

    @Test
    public void testGetCourseNumber() {
        assertEquals(testITPC.getCourseNumber(), "152 107");
        assertNotSame(testITPC.getCourseNumber(), "152 135");
    }

    @Test
    public void testGetCourseName() {
        assertEquals(testITPC.getCourseName(), "Introduction to Programming");
        assertNotSame(testITPC.getCourseName(), "Advanced Java");
    }
}
