import java.util.Scanner;

public class Aula_44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int soma=0, input=sc.nextInt();
		
		while (input != 0) {
			soma += input;
			input = sc.nextInt();
		}
		System.out.println("A soma é: "+soma);
		
		// Atingindo a mesma proposta com do-while
		/*
		int soma=0, input;
		do {
			input = sc.nextInt();
			soma += input;
		} while (input != 0);		
		System.out.println("A soma é: "+soma);
		*/
		sc.close();
	}
}
