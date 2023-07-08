import java.util.Scanner;

public class Aula_85_Ex_MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int[] vect = new int[sc.nextInt()];
		
		int soma=0;
		int qtdPar=0;
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				qtdPar++;
			}
		}
		sc.close();
		
		// Para este exercicio, vamos assumir que o 0 não é par.
		if (soma > 0) { 
			// Algum número par foi encontrado
			double media = soma / qtdPar;
			System.out.printf("MÉDIA DOS PARES = %.1f", media);			
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}
	}
}
