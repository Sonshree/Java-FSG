package com.sonumonu;

public class OuterClass {
    // Outer class variable
    private String outerMessage = "This is the outer class.";

    // Inner class
    public class InnerClass {
        // Inner class variable
        private String innerMessage = "This is the inner class.";

        // Inner class method
        public void displayMessages() {
            System.out.println(outerMessage); // Accessing outer class variable
            System.out.println(innerMessage); // Accessing inner class variable
        }
    }

    // Main method to demonstrate inner class
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerInstance = new OuterClass();

        // Creating an instance of the inner class using the outer instance
        OuterClass.InnerClass innerInstance = outerInstance.new InnerClass();

        // Calling the method of the inner class to display messages
        innerInstance.displayMessages();
    }
}

