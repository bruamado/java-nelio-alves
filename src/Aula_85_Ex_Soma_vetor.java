import java.util.Scanner;

public class Aula_85_Ex_Soma_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		double[] vect = new double[sc.nextInt()];
		double soma=0;
		
		for (int i=0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		sc.close();
		
		System.out.print("VALORES = ");
		for (int i=0; i<vect.length; i++) {
			soma += vect[i];
			System.out.printf("%.2f  ", vect[i]);				
		}
		System.out.println();
		System.out.printf("SOMA: %.2f%n", soma);
		System.out.printf("MEDIA: %.2f%n", soma/vect.length);		
	}

}
