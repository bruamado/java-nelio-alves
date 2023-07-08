import java.util.Scanner;
import entities.Aluno;

public class Aula_85_Ex_Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados? ");
		Aluno[] alunos = new Aluno[sc.nextInt()];
		
		for (int i=0; i<alunos.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i);
			sc.nextLine();
			String nome = sc.nextLine();
			double semestre1 = sc.nextDouble();
			double semestre2 = sc.nextDouble();
			alunos[i] = new Aluno(nome, semestre1, semestre2);
		}
		sc.close();
		
		System.out.println("Alunos aprovados:");
		for (int i=0; i<alunos.length; i++) {
			double[] notas = alunos[i].getNotas();
			double media = (notas[0] + notas[1]) / notas.length;
			if (media >= 6) {
				System.out.printf("%s - Média final: %.1f%n", alunos[i].getNome(), media);
			}
		}
	}
}
