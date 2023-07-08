import java.util.Scanner;

public class Aula_85_Ex_NumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int[] vect = new int[sc.nextInt()];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		sc.close();
		
		int pares=0;
		System.out.println("NÚMEROS PARES:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i]%2 == 0) {
				System.out.print(vect[i]+"  ");
				pares++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pares);
	}

}
