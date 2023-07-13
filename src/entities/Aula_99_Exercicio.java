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
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idToIncrease = sc.nextInt();
		
		Integer index = position(employees, idToIncrease);
		if (index != null) {
			System.out.print("Enter the percentage: ");
			employees.get(index).increaseSalary(sc.nextDouble());			
		}else {
			System.out.println("This id does not exist!");			
		}
		
		sc.close();
		/*
		 * Uma outra forma alternativa de encontrar o id na lista de funcionarios, seria essa:
		 *	Employee_Aula99 emp = list.strem().filter(x -> x.getId() == id).findFirst().orElse(null);
		 */
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee_Aula99 employee : employees) {
			System.out.println(employee);
		}
		
	}
	
	public static Integer position(List<Employee_Aula99> list, int id) {
		//Finds if the id existis in elements, and return it's index.
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
