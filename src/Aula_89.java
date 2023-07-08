import java.util.Scanner;
import entities.Product;

public class Aula_89 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many entries? ");
		Product[] vect = new Product[sc.nextInt()];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Inser produt name: ");
			String name = sc.nextLine();
			System.out.print("Inser produt price: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double average = sum / vect.length;
		System.out.printf("AVERAGE: %.2f", average);
		sc.close();		
	}

}
