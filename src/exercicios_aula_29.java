import java.util.Scanner;

public class exercicios_aula_29 {

	public static void main(String[] args) {
		double largura, comprimento, precoM2, area, valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.print("Insira o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.print("Insira o preço do M²: ");
		precoM2 = sc.nextDouble();
		
		System.out.printf("%n%n");
		
		area = largura*comprimento;
		valor = area*precoM2;
		System.out.printf("AREA = %.1f M²%n", area);
		System.out.printf("PREÇO = %.2f", valor);
		
	}

}
