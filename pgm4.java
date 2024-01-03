package java_Assignment;
import java.util.Scanner;
/*
 * Create a Java program that simulates a bank account. The program should allow
users to deposit and withdraw money, check their balance.
 */
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
public class pgm4 
{
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter initial balance: ");
	        double initialBalance = scanner.nextDouble();

	        BankAccount account = new BankAccount(initialBalance);

	        while (true) 
	        {
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");

	            int choice = scanner.nextInt();

	            switch (choice) 
	            {
	                case 1:
	                    System.out.print("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;

	                case 2:
	                    System.out.print("Enter withdrawal amount: ");
	                    double withdrawalAmount = scanner.nextDouble();
	                    account.withdraw(withdrawalAmount);
	                    break;

	                case 3:
	                    System.out.println("Current balance: " + account.getBalance());
	                    break;

	                case 4:
	                    System.out.println("Exiting program. Thank you!");
	                    scanner.close();
	                    System.exit(0);

	                default:
	            
	                   System.out.println("Invalid choice. Please choose a valid option.");
	            }
	        }
	    }
}
