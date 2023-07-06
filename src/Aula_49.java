import java.util.Scanner;

public class Aula_49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input=sc.nextInt(), soma=0;
		for (int i=0; i < input; i++) {
			int entrada = sc.nextInt();
			soma += entrada;
			System.out.printf("Número %d: / input: %d%nSoma total: %d%n%n", i, entrada, soma);
		}
		sc.close();
	}
}
