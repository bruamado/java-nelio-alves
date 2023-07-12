import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula_98 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.println("Insira um nome ou pressione enter para sair:");
			input = sc.nextLine();
			if (input != "") {
				list.add(input);
			}
		} while (input != "");
		sc.close();
		
		for (String nome : list) {
			System.out.println(nome);
		}
	}
}
