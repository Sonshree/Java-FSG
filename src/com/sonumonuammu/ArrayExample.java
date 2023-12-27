package com.sonumonuammu;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Declare and initialize an array of integers
        int[] numbers = {5, 8, 12, 3, 7};

        // Display the elements of the array
        System.out.println("Array Elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Calculate and display the sum of array elements
        int sum = calculateSum(numbers);
        System.out.println("\nSum of Array Elements: " + sum);

        // Update an element in the array and display the modified array
        numbers[2] = 20;
        System.out.println("Modified Array Elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Method to calculate the sum of array elements
    private static int calculateSum(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum;
    }
}
	


