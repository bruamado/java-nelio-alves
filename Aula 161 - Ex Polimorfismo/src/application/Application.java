package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Application {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int employeeQty = sc.nextInt();
		
		for (int i=0; i<employeeQty; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced? (y/n): ");
			sc.nextLine();
			char outsourced = sc.nextLine().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("PAYMENTS:");
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
