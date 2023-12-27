package com.sonasree;

public class ConstructorVerification {
	// Default constructor
    public ConstructorVerification() {
        System.out.println("Default constructor");
    }

    // Parameterized constructor
    public ConstructorVerification(String parameter) {
        System.out.println("Parameterized constructor with: " + parameter);
    }

    // Constructor with multiple parameters
    public ConstructorVerification(int num, String text) {
        System.out.println("Constructor with parameters: " + num + ", " + text);
    }

    public static void main(String[] args) {
        // Test the constructors
        ConstructorVerification defaultConstructor = new ConstructorVerification();
        ConstructorVerification parameterizedConstructor = new ConstructorVerification("Hello");
        ConstructorVerification multiParameterConstructor = new ConstructorVerification(42, "Java");

        // Add more tests as needed
    }
}



