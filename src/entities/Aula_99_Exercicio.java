package entities;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Aula_99_Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee_Aula99> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int howMany = sc.nextInt();
		
		for (int i=0; i<howMany; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee_Aula99(id, name, salary));
		}
		sc.close();
		
		System.out.println();
		for (Employee_Aula99 employee : employees) {
			System.out.println(employee.getName());
		}
		
	}

}
