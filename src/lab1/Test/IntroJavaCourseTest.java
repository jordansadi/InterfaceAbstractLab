package lab1.Test;

import lab1.IntroJavaCourse;
import org.junit.*;

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
    public void testSetPrerequisites() {
        testIJC.setPrerequisites("152 107");
        assertEquals(testIJC.getPrerequisites(), "152 107");
    }
}
