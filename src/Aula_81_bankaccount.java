import java.util.Scanner;
import entities.BankAccount;


public class Aula_81_bankaccount {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		double initialDeposit;
		
		System.out.println("Welcome to JurosBank!");
		System.out.println("Enter your data to open a new account:");
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.println("Start deposit: ");
		initialDeposit = sc.nextDouble();
		BankAccount account = new BankAccount(name);			
		
		if (initialDeposit != 0.00) {
			account.deposit(initialDeposit);
		}
		
		System.out.println("Your account was created!");
		
		int operation;
		
		do {
			double amount;
			String newName;
			System.out.println();
			System.out.println();
			System.out.println("-- Bank operations --");
			System.out.println("0 - Exit");
			System.out.println("1 - Deposit");
			System.out.println("2 - Withdraw");
			System.out.println("3 - Balance");
			System.out.println("4 - Account information");
			System.out.println("5 - Change owner's name");
			System.out.print("Enter the operation number: ");
			operation = sc.nextInt();
			System.out.println();
			
			switch(operation) {
			case 0:
				System.out.println("Exiting... Goodbye!");
				break;
			case 1:
				System.out.print("Enter the amount to deposit: ");
				amount = sc.nextDouble();
				account.deposit(amount);
				System.out.printf("You deposited $%.2f%n", amount);
				break;
			case 2:
				System.out.print("Enter the amount to withdraw: ");
				amount = sc.nextDouble();
				account.withdraw(amount);
				System.out.printf("You withdrew $%.2f%n", amount);
				break;
			case 3:
				System.out.printf("Your account balance is: $%.2f%n", account.getBalance());
				break;
			case 4:
				System.out.printf("Your bank account's information:%n%s%n", account);
				break;
			case 5:
				System.out.println("Enter your new bank account's name: ");
				sc.nextLine();
				newName = sc.nextLine();
				account.setName(newName);
				System.out.println("Your bank account's name has been changed.");
				break;
			}
		} while (operation != 0);
		sc.close();
	}
}
