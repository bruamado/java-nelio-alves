//import java.util.Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		System.out.println("Quantos números irá inserir?");
		int[] intVetor = new int[sc.nextInt()];
		
		for (int i=0; i<intVetor.length; i++) {
			System.out.print("Numero " + (i+1) + ": ");
			intVetor[i] = sc.nextInt();
		}
		sc.close();
		
		for (int num : intVetor) {
			System.out.printf("%d, ", num);
		}
	}
}
