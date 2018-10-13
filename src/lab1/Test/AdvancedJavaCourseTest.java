package lab1.Test;

import lab1.AdvancedJavaCourse;
import org.junit.*;

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
}
