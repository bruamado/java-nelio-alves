package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3;
	
	public void calculateGrades() {
		//double grade = ((grade1*0.3) + (grade2*0.35) + (grade3*0.35));
		double grade = grade1 + grade2 + grade3;
		System.out.printf("FINAL GRADE %.2f%n", grade);
		if (grade >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60-grade);
		}
	}
}
