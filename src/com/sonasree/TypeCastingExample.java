package com.sonasree;

public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Implicit Type Casting (Widening)
        int intValue = 10;
        double doubleValue = intValue; // Automatically converts int to double
        System.out.println("Implicit Casting (Widening): int to double - Result: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double anotherDoubleValue = 15.75;
        int anotherIntValue = (int) anotherDoubleValue; // Requires explicit casting
        System.out.println("Explicit Casting (Narrowing): double to int - Result: " + anotherIntValue);
    }
}
	


