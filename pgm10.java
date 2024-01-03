package java_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Write a Java program that reads a set of integers from the user and stores them in a
List. The program should then find the second largest and second smallest elements
in the List.
 */
public class pgm10
{
	public static void main(String[] args) 
	{
		  Scanner scanner = new Scanner(System.in);

	        // Read integers from the user and store them in a List
	        List<Integer> numbers = new ArrayList<>();

	        System.out.println("Enter integers (type a non-integer to finish):");

	        while (scanner.hasNextInt()) {
	            int num = scanner.nextInt();
	            numbers.add(num);
	        }

	        // Find and display the second largest and second smallest elements
	        findAndDisplaySecondLargestAndSmallest(numbers);

	        scanner.close();
	    }

	    private static void findAndDisplaySecondLargestAndSmallest(List<Integer> numbers) {
	        if (numbers.size() < 2) {
	            System.out.println("Insufficient elements in the list to find second largest and second smallest.");
	            return;
	        }

	        // Sort the list in ascending order
	        Collections.sort(numbers);

	        // Display the results
	        System.out.println("Second Smallest Element: " + numbers.get(1));
	        System.out.println("Second Largest Element: " + numbers.get(numbers.size() - 2));
	}
}
