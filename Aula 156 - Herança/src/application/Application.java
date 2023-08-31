package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import teste.Abacaxi;
import teste.Banana;
import teste.Fruta;
import teste.Melancia;
import teste.Morango;

public class Application {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//	UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//	DOWNCASTING
		BusinessAccount acc5 = (BusinessAccount)acc2;
		acc5.loan(100.0);
		
		// BusinessAccount acc6 = (BusinessAccount)acc3;	// Dará erro em tempo de execução!
															// Pois acc3 é uma SavingsAccount, não pode ser convertida a uma BusinessAccount
		if(acc3 instanceof BusinessAccount) {	// Assegura que a conversão é possível
			BusinessAccount acc6 = (BusinessAccount)acc3;
			acc6.loan(400.0);
			System.out.println("BusinessAccount!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc6 = (SavingsAccount)acc3;
			acc6.updateBalance();
			System.out.println("SavingsAccount!");
		}
		
		// Teste da cesta de frutas
		List<Fruta> cestaFrutas = new ArrayList<>();
		cestaFrutas.add(new Fruta());	// Esse é um objeto da classe base
		cestaFrutas.add(new Banana());
		cestaFrutas.add(new Melancia());
		cestaFrutas.add(new Morango());
		cestaFrutas.add(new Abacaxi());
		
		for(Fruta f : cestaFrutas) {
			System.out.println("getClass(): " + f.getClass());
		}
	}

}
