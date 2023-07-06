package entities;
import java.lang.Double;

public class Triangle {
	public double a;
	public double b;
	public double c;
	private Double area; // Precisava disso, Java ?
	
	public double area() {
		System.out.println("Area: " + area);
		if (area != null) {
			System.out.println("Simplesmente retornei a area.");
			return area;
		} else {
			double p = (a + b + c) / 2;
			area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("Calculei e retornei a area.");
			return area;
		}
	}
}
