import java.util.Scanner;

public class Aula_85_Ex_AbaixoDaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		double[] vect = new double[sc.nextInt()];
		
		double soma=0;
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		sc.close();
		
		double media = soma / vect.length;
		System.out.printf("MÉDIA DO VETOR = %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
	}

}
