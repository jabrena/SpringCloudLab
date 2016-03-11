package demo.testing.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test 
    public void testMethod1() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.method1());
    }

}
