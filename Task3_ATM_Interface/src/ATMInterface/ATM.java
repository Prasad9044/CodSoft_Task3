package ATMInterface;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your initial account balance: ");
		double initialBalance = scanner.nextDouble();

		BankAccount bankAccount = new BankAccount(initialBalance);
		for (;;) {
			System.out.println("\nATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");
			switch (scanner.nextInt()) {
			case 1: {
				double balance = bankAccount.checkBalance();
				System.out.println("Your account balance is: " + balance+" Rs.");
				break;
			}
			case 2: {
				System.out.print("Enter the amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				bankAccount.deposit(depositAmount);
				break;
			}
			case 3: {
				System.out.print("Enter the amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				bankAccount.withdraw(withdrawAmount);
				break;
			}
			case 4: {
				System.out.println("\nExiting........ \nThank you!");
				scanner.close();
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid choice. Please select a valid option.");
			}
			}
		}
	}
}
