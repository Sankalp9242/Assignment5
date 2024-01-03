package java_Assignment;
import java.util.Arrays;
/*
 * Write a Java program that uses stream api to perform operations on a large data set,
such as sorting or filtering the data.
 */
import java.util.List;
import java.util.stream.Collectors;

public class pgm6
{
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(8, 2, 10, 5, 3, 12, 7, 6);

        // Using Stream API to perform operations
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 != 0)        // Filter out even numbers
                .map(n -> n * n)                // Square the remaining numbers
                .sorted()                       // Sort the squared numbers
                .collect(Collectors.toList());  // Collect the results into a list

        // Display the result
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Filtered, Squared, and Sorted Numbers: " + result);
	}
}
