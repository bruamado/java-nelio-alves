package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			System.out.print("Holder: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, name, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			
			System.out.printf("New balance: %.2f", account.getBalance());
			
			sc.close();
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
