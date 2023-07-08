import java.util.Scanner;

public class Aula_85_Ex_Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int[] vect = new int[sc.nextInt()];
		
		for (int i=0; i<vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);				
			}
		}
	}

}
