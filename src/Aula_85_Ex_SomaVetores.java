import java.util.Scanner;

public class Aula_85_Ex_SomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int qtd = sc.nextInt();
		int[] vectA = new int[qtd];
		int[] vectB = new int[qtd];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i=0; i<vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i=0; i<vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("VETOR RESULTANTE:");
		for (int i=0; i<vectA.length; i++) {
			System.out.println(vectA[i] + vectB[i]);
		}
	}

}
