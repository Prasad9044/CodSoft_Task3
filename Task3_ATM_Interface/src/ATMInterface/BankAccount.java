package ATMInterface;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited successfully.");
		} else {
			System.out.println("Please enter valid amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Insufficient Balance.");
		}
	}

	public double checkBalance() {
		return balance;
	}

}
