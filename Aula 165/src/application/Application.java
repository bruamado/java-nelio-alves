package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Taxpayer;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter the number of tax payers: ");
		int qtdTaxPayers = sc.nextInt();			
		
		List<Taxpayer> taxPayerList = new ArrayList<>();
		for(int i=1; i<=qtdTaxPayers; i++) {
			System.out.printf("Tax payer #%d data: %n", i);
			
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
					
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				taxPayerList.add(new NaturalPerson(name, annualIncome, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				taxPayerList.add(new LegalPerson(name, annualIncome, employees));
			}
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes=0;
		for (Taxpayer taxPayer : taxPayerList) {
			System.out.println(taxPayer);
			totalTaxes += taxPayer.paidTaxes();
		}
		
		System.out.printf("%nTOTAL TAXES: $ %.2f", totalTaxes);
	}

}
