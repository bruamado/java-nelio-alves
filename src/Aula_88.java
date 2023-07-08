import java.util.Scanner;

public class Aula_88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		double[] height = new double[n];
		double sum = 0;
		for (int i=0; i<n; i++) {
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		sc.close();
		double average = sum / n;
		System.out.println("Essa é nossa média de altura: " + average);
	}

}
