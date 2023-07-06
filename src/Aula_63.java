import java.util.Scanner;
import entities.Triangle;

public class Aula_63 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble(); 
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle Y area: %.4f%n", y.area());
		
		System.out.println("Larger area: " + ((x.area() > y.area()) ? "X" : "Y"));

		sc.close();
	}

}

// Sem orientação a objetos:
/*
public class aula_63 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC, p;
		double t1Area, t2Area;
		
		System.out.println("Enter the measures of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		p = (xA + xB + xC) / 2;
		t1Area = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		
		p = (yA + yB + yC) / 2;
		t2Area = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf("Triangle X area: %.4f%n", t1Area);
		System.out.printf("Triangle Y area: %.4f%n", t2Area);
		
		System.out.println("Larger area: " + ((t1Area > t2Area) ? "X" : "Y"));

		sc.close();
	}

}
*/