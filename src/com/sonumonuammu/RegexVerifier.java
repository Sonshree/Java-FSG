package com.sonumonuammu;
import java.util.regex.*;
public class RegexVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Define a regular expression
        String regex = "^[a-zA-Z0-9]+$";

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Test strings
        String testString1 = "Valid123";
        String testString2 = "Invalid@#!";

        // Create matcher objects
        Matcher matcher1 = pattern.matcher(testString1);
        Matcher matcher2 = pattern.matcher(testString2);

        // Check if the strings match the pattern
        System.out.println(testString1 + " matches the pattern: " + matcher1.matches());
        System.out.println(testString2 + " matches the pattern: " + matcher2.matches());
    }
}


	


