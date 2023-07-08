import java.util.Scanner;

public class Aula_85_Ex_MaiorPosicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		double[] vect = new double[sc.nextInt()];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		sc.close();
		
		int iMaiorValor=0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] > vect[iMaiorValor]) {
				iMaiorValor = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n", vect[iMaiorValor]);
		System.out.println("POSICAO DO MAIOR VALOR = " + iMaiorValor);
	}

}
