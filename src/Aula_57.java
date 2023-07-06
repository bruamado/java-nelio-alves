import java.util.Scanner;

public class Aula_57 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int mask = 0b000000;
		//int n = sc.nextInt();
		int n = 0b100000;
		if ((mask & n) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		System.out.println("resultado: " + Integer.toBinaryString(mask&n));
		sc.close();
	}
}
