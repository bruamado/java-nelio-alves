import java.util.Scanner;

import entities.Student;

public class Aula_69_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter student information:");
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("1th grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("2th grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("3th grade: ");
		student.grade3 = sc.nextDouble();
		
		student.calculateGrades();
		sc.close();
	}

}
