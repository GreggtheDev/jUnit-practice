package org.example;

/**
 * A simple class that provides a method to generate a formatted string with the name.
 */
public class MyNameIs {

    /**
     * Returns a string that states the name.
     *
     * @param name the name to be included in the string
     * @return a formatted string stating the name
     */
    public static String getNameString(String name) {
        return "My name is " + name + ".";
    }

    /**
     * Main method for testing the MyNameIs class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String name = "Gregg Page";
        System.out.println(getNameString(name));
        System.out.println(getNameString(name));
        System.out.println(getNameString(name));
    }
}
