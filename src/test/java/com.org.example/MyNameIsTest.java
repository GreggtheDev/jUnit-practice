package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the MyNameIs class.
 */
public class MyNameIsTest {

    /**
     * Tests the getNameString method with a sample name.
     */
    @Test
    public void testGetNameString() {
        String name = "Gregg Page";
        String expected = "My name is Gregg Page.";

        assertEquals(expected, MyNameIs.getNameString(name));
    }

    /**
     * Tests the getNameString method with an empty name.
     */
    @Test
    public void testGetNameStringWithEmptyName() {
        String name = "";
        String expected = "My name is .";

        assertEquals(expected, MyNameIs.getNameString(name));
    }

    /**
     * Tests the getNameString method with a single word name.
     */
    @Test
    public void testGetNameStringWithSingleWordName() {
        String name = "Gregg";
        String expected = "My name is Gregg.";

        assertEquals(expected, MyNameIs.getNameString(name));
    }

    /**
     * Tests the getNameString method with a name that contains special characters.
     */
    @Test
    public void testGetNameStringWithSpecialCharacters() {
        String name = "Gregg@123!";
        String expected = "My name is Gregg@123!.";

        assertEquals(expected, MyNameIs.getNameString(name));
    }
}

