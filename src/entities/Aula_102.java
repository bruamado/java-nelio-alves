package entities;
import java.util.Scanner;


public class Aula_102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert the order: ");
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		System.out.println();
		
		for (int i=0; i<matrix.length; i++) {
			// linha
			System.out.printf("%nValues for line %d%n", (i+1));
			for (int j=0; j<matrix[i].length; j++) {
				// colunas
				System.out.printf("Enter a value for %dth position: ", (j+1));
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//Exibir a diagonal principal
		System.out.println("Main diagonal:");
		for (int i=0; i<matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		//Números negativos:
		int negatives = 0;
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					negatives++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers = " + negatives);		
		sc.close();
	}

}
