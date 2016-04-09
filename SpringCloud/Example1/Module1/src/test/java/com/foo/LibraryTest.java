package com.foo;

import org.junit.Test;
import static org.junit.Assert.*;


public class LibraryTest {

    @Test public void testLib1Dummy1() {
        Library lib = new Library();

        assertTrue("Ok", lib.method1());
    }

    @Test public void testLib2Dummy1() {
        Library2 lib2 = new Library2();

        assertTrue("Ok", lib2.method1());
    }

    @Test public void testLib3Dummy1() {
        Library3 lib3 = new Library3();

        assertTrue("Ok", lib3.method1());
    }

}
