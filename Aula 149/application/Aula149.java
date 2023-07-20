package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entitites.Department;
import entitites.HourContract;
import entitites.Worker;
import entitites.enums.WorkerLevel;

public class Aula149 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		Department department = new Department(sc.nextLine());
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		System.out.print("How many contracts to this worker? ");
		int qtdContracts = sc.nextInt();
		
		Worker worker = new Worker(name, level, baseSalary, department);
		for (int i=1; i<=qtdContracts; i++) {
			System.out.println("Enter contract #"+i+" data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			String dateString = sc.next();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = dateFormat.parse(dateString);
			
			HourContract contract = new HourContract(date, valuePerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String incomeDate = sc.next();
		int month = Integer.parseInt((incomeDate).substring(0, 2));
		int year = Integer.parseInt((incomeDate).substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + incomeDate + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
