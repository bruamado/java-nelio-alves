package entities;
import java.util.Random;

public class BankAccount {
	private int accountNumber;
	private String holder;
	private double balance;
	
	public BankAccount(String name, double initialDeposit) {
		Random random = new Random();
		this.accountNumber = random.nextInt();
		this.holder = name;
		deposit(initialDeposit);
	}

	public BankAccount(String name) {
		Random random = new Random();
		this.accountNumber = random.nextInt(9999);
		this.holder = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return holder;
	}

	public void setName(String name) {
		this.holder = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		double tax = 5.00;
		this.balance -= (amount+tax);
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
	}
	
}
