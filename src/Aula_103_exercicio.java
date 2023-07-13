import java.util.Scanner;
public class Aula_103_exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Let's create a Matrix.");
		
		System.out.print("Enter the number of rows and columns: ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int[][] matrix = new int[rows][columns];
		
		for (int i=0; i<rows; i++) {
			//rows
			for (int j=0; j<columns; j++) {
				//columns
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Insert the number to find: ");
		int numberToFind = sc.nextInt();
		sc.close();
		
		for (int i=0; i<matrix.length; i++) {
			//rows
			for(int j=0; j<matrix[i].length; j++) {
				//columns
				if (matrix[i][j] == numberToFind) {
					System.out.printf("Position %d,%d:%n", i, j);
					
					if (j-1 >= 0) {
						System.out.println("Left: " + matrix[i][j-1]);						
					}
					
					if (i-1 >= 0) {
						System.out.println("Up: " + matrix[i-1][j]);						
					}
					
					if (j+1 < matrix[i].length) {
						System.out.println("Right: " + matrix[i][j+1]);						
					}
					if (i+1 < matrix.length) {
						System.out.println("Down: " + matrix[i+1][j]);						
					}
					System.out.println();
				}
			}
		}
	}
}
