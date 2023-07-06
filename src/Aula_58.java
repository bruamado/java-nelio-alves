import java.util.Scanner;

public class Aula_58 {
	public static void main (String args[]) {
		System.out.println("Insira uma linha, e eu irei separar as palavras:");
		Scanner sc = new Scanner (System.in);
		String[] vec = sc.nextLine().split(" ");
		System.out.printf("Total de palavras detectadas: %d%n", vec.length);
		
		for (int i=0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
		
		sc.close();
	}
}
