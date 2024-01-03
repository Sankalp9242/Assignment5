package java_Assignment;

import java.util.Scanner;

/*
 * Write a Java programme that takes an integer from the user and throws an exception
if it is negative.Demonstrate Exception handling of same program as solution.

 */
class NegativeValueException extends Exception
{
	 public NegativeValueException(String s) 
	{
		super(s);
	} 
}
public class pgm2 
{
	public static void main(String[] args)
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Addition of two numbers:");
		System.out.println("Enter first number:");
		int firstNum=sc.nextInt();
		System.out.println("Enter second number:");
        int secondNum=sc.nextInt();
        if(firstNum<0 || secondNum<0)
        {
        	throw new NegativeValueException("Negative value exception");
        }
	}
		catch (NegativeValueException e)
		{
			e.printStackTrace();
		}
		
	}
}
