import java.util.Scanner;
import entities.Pessoa;

public class Aula_93_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int roomsRented = sc.nextInt();
		Pessoa[] rooms = new Pessoa[10];
		
		for (int i=0; i<roomsRented; i++) {
			System.out.println("Rent #"+(i+1));
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rooms[room] = new Pessoa(nome, 0, 0, email);
		}
		sc.close();
		
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.printf("%d: %s, %s%n", i, rooms[i].getNome(), rooms[i].getEmail());
			}
		}
	}

}
