package java_Assignment;

import java.util.Scanner;

/*
 *  Create a Java program that implements a binary search algorithm. The program
should accept user input for the target value and search for it in a sorted array. The
program should return the index of the target value if found or a message if not
found.

 */
public class pgm7 
{
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);

	        // Sorted array
	        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

	        System.out.print("Enter the target value to search: ");
	        int targetValue = scanner.nextInt();

	        // Perform binary search
	        int index = binarySearch(sortedArray, targetValue);

	        // Display the result
	        if (index != -1) {
	            System.out.println("Target value found at index: " + index);
	        } else {
	            System.out.println("Target value not found in the array.");
	        }

	        scanner.close();
	}
	 private static int binarySearch(int[] array, int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid; // Target found
	            } else if (array[mid] < target) {
	                left = mid + 1; // Discard the left half
	            } else {
	                right = mid - 1; // Discard the right half
	            }
	        }

	        return -1; // Target not found
	    }
}
