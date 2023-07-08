import java.util.Scanner;

public class Aula_85_Ex_MediaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int qtd = sc.nextInt();
		String[] vectNome = new String[qtd];
		int[] vectIdade = new int[qtd];
		
		for (int i=0; i<vectNome.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			vectNome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
		}
		sc.close();
		
		int maiorIdade=0;
		int iMaiorIdade=0;
		for (int i=0; i<vectIdade.length; i++) {
			if (vectIdade[i] >= maiorIdade) {
				maiorIdade = vectIdade[i];
				iMaiorIdade=i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vectNome[iMaiorIdade]);
		System.out.println("Com " + vectIdade[iMaiorIdade] + " anos!");
	}
}
