package java_Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * Write a Java program that implements a producer-consumer model using
multithreading. The program should have a producer thread that generates random
numbers and adds them to a queue, and a consumer thread that reads numbers
from the queue and calculates their sum. The program should use synchronization to
ensure that the queue is accessed by only one thread at a time
 */
class Producer implements Runnable {
    private Queue<Integer> sharedQueue;
    private Random random = new Random();

    public Producer(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Generating a random number
            int randomNumber = random.nextInt(100);
            
            // Synchronizing access to the sharedQueue
            synchronized (sharedQueue) {
                // Adding the random number to the queue
                sharedQueue.add(randomNumber);
                System.out.println(Thread.currentThread().getName() + " produced: " + randomNumber);
                
                // Notify the consumer that a new item is available
                sharedQueue.notify();
            }

            try {
                // Simulating some delay between producing numbers
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private Queue<Integer> sharedQueue;

    public Consumer(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Synchronizing access to the sharedQueue
            synchronized (sharedQueue) {
                // Waiting for the producer to notify that an item is available
                while (sharedQueue.isEmpty()) {
                    try {
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Consuming the item (removing from the queue) and calculating sum
                int consumedNumber = sharedQueue.poll();
                System.out.println(Thread.currentThread().getName() + " consumed: " + consumedNumber);

                // Notify the producer that the queue has space available
                sharedQueue.notify();
            }

            try {
                // Simulating some delay between consuming numbers
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class pgm9 
{
	public static void main(String[] args) 
	{
		  Queue<Integer> sharedQueue = new LinkedList<>();

	        // Creating instances of producer and consumer threads
	        Thread producerThread = new Thread(new Producer(sharedQueue), "ProducerThread");
	        Thread consumerThread = new Thread(new Consumer(sharedQueue), "ConsumerThread");

	        // Starting the threads
	        producerThread.start();
	        consumerThread.start();
	}
}
