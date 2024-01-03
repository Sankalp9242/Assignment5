package java_Assignment;
/*
 * Write a Java program that creates two threads. The first thread should print even
numbers between 1 and 10, and the second thread should print odd numbers
between 1 and 10.
 */

class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

// Runnable class to print odd numbers
class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}
public class pgm8 
{
	public static void main(String[] args) 
	{
		 Thread evenThread = new Thread(new EvenPrinter());
	        Thread oddThread = new Thread(new OddPrinter());

	        // Starting the threads
	        evenThread.start();
	        oddThread.start();
	}
}
