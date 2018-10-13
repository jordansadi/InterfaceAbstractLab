package lab2.Test;

import org.junit.*;
import lab2.AdvancedJavaCourse;

public class AdvancedJavaCourseTest extends junit.framework.TestCase {
    public AdvancedJavaCourseTest() {}

    AdvancedJavaCourse testAJC;

    @Before
    public void setUp() throws Exception {
        testAJC = new AdvancedJavaCourse("Advanced Java", "152 135");
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testGetPrerequisites() {
        assertNull(testAJC.getPrerequisites());
        testAJC.setPrerequisites("152 134");
        assertEquals(testAJC.getPrerequisites(), "152 134");
        assertNotSame(testAJC.getPrerequisites(), "152 135");
    }

    @Test
    public void testGetCredits() {
        testAJC.setCredits(4.0);
        assertEquals(testAJC.getCredits(), 4.0);
        assertNotSame(testAJC.getCredits(), 2.0);
    }

    @Test
    public void testGetCourseNumber() {
        assertEquals(testAJC.getCourseNumber(), "152 135");
        assertNotSame(testAJC.getCourseNumber(), "152 134");
    }

    @Test
    public void testGetCourseName() {
        assertEquals(testAJC.getCourseName(), "Advanced Java");
        assertNotSame(testAJC.getCourseName(), "Introduction to Programming");
    }
}