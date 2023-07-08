import java.util.Scanner;
import entities.Pessoa;


public class Aula_85_Ex_Alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		Pessoa[] pessoaVect = new Pessoa[sc.nextInt()];
		
		for (int i=0; i<pessoaVect.length; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoaVect[i] = new Pessoa(nome, idade, altura);
		}
		sc.close();
		
		System.out.println();
		
		double somaAltura=0;
		int menor16=0;
		for (int i=0; i<pessoaVect.length; i++) {
			somaAltura += pessoaVect[i].getAltura();
			if (pessoaVect[i].getIdade() < 16) {
				menor16 += 1;
			}
		}
		System.out.printf("Altura média: %.2f%n", somaAltura/pessoaVect.length);
		double menor16Porcento = 100*menor16 / pessoaVect.length;  // Descobre a porcentagem de menores de 16 anos
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menor16Porcento);
		
		for (int i=0; i<pessoaVect.length; i++) {
			if (pessoaVect[i].getIdade() < 16) {
				System.out.println(pessoaVect[i].getNome());
			}
		}		
	}

}
