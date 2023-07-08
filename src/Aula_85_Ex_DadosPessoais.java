import java.util.Scanner;
import entities.Pessoa2;

public class Aula_85_Ex_DadosPessoais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		Pessoa2[] pessoas = new Pessoa2[sc.nextInt()];
		
		for (int i=0; i<pessoas.length; i++) {
			System.out.printf("Altura da %da pessoa:%n", i+1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa:%n", i+1);
			char genero = sc.next().charAt(0);
			pessoas[i] = new Pessoa2(altura, genero);
		}
		sc.close();
		
		double maiorAltura=0;
		double menorAltura=0;
		int homens=0;
		int mulheres=0;
		double alturaTotalMulheres=0;
		
		for (int i=0; i<pessoas.length; i++) {
			double altura = pessoas[i].getAltura();
			if (altura > maiorAltura) {
				maiorAltura = altura;
			} else if (altura < menorAltura || menorAltura == 0.0) {
				menorAltura = altura;
			}
			
			if (pessoas[i].getGenero() == 'F') {
				alturaTotalMulheres += pessoas[i].getAltura();
				mulheres++;
			}else {
				homens++;
			}
		}
		double mediaAlturaMulheres = alturaTotalMulheres/mulheres;
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.printf("Número de homens = %d%n", homens);
	}

}
