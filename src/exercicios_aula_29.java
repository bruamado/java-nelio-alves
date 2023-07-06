import java.util.Scanner;

public class Exercicios_aula_29 {

	public static void main(String[] args) {
		
		String test = "youtube";
		
		//Exercício Youtube
		if (test == "youtube") {
			Scanner sc = new Scanner(System.in);
			double largura, comprimento, precoM2, area, valor;
			
			System.out.print("Insira a largura do terreno: ");
			largura = sc.nextDouble();
			
			System.out.print("Insira o comprimento do terreno: ");
			comprimento = sc.nextDouble();
			
			System.out.print("Insira o preço do M²: ");
			precoM2 = sc.nextDouble();
			
			System.out.printf("%n%n");
			
			area = largura*comprimento;
			valor = area*precoM2;
			System.out.printf("AREA = %.1f m²%n", area);
			System.out.printf("PREÇO = %.2f", valor);
			sc.close();
			
		//Exercício 1
		}else if (test == "ex1") {
			Scanner sc = new Scanner(System.in);
			int a, b;
			
			System.out.print("Insira um valor: ");
			a = sc.nextInt();
			
			System.out.print("Insira outro valor: ");
			b = sc.nextInt();
			
			System.out.println("SOMA = " + (a+b));
			sc.close();
		//Exercício 2
		}else if (test == "ex2") {
			Scanner sc = new Scanner(System.in);
			double raio, area;
			
			System.out.print("Insira o raio do circulo: ");
			raio = sc.nextDouble();
			
			area = Math.PI * Math.pow(raio, 2);
			
			System.out.printf("A area do círculo é %.4f", area);	
			sc.close();
			
		//Exercício 3
		}else if (test == "ex3") {
			Scanner sc = new Scanner(System.in);
			int a, b, c, d, resultado;
			
			System.out.print("Insira o valor de A: ");
			a = sc.nextInt();
			
			System.out.print("Insira o valor de B: ");
			b = sc.nextInt();
			
			System.out.print("Insira o valor de C: ");
			c = sc.nextInt();
			
			System.out.print("Insira o valor de D: ");
			d = sc.nextInt();
			
			resultado = a * b - c * d;
			System.out.println("Resultado: " + resultado);
			
			sc.close();
			
		//Exercício 4
		}else if (test == "ex4") {
			Scanner sc = new Scanner(System.in);
			int numero, horas;
			double valor, salario;
			
			System.out.print("Insira o número do funcionário: ");
			numero = sc.nextInt();
			
			System.out.print("Insira o número de horas trabalhadas: ");
			horas = sc.nextInt();
			
			System.out.print("Insira o valor por hora: ");
			valor = sc.nextDouble();
			
			salario = horas*valor;
			
			System.out.println("NUMBER = " + numero);
			System.out.printf("SALARY = U$ %.2f", salario);
			
			sc.close();
			
		//Exercício 5
		}else if (test == "ex5") {
			Scanner sc = new Scanner(System.in);
			int qtd1, qtd2;
			double valor1, valor2, valorTotal;
			/*
			 * int peca1, peca2;
			System.out.print("Insira o código da peça 1: ");
			peca1 = sc.nextInt();			
			*/
			System.out.print("Insira a quantidade de peças 1: ");
			qtd1 = sc.nextInt();
			
			System.out.print("Insira o valor de cada peça 1: ");
			valor1 = sc.nextDouble();
			/*
			System.out.print("Insira o código da peça 2: ");
			peca2 = sc.nextInt();			
			*/
			System.out.print("Insira a quantidade de peças 2: ");
			qtd2 = sc.nextInt();
			
			System.out.print("Insira o valor de cada peça 2: ");
			valor2 = sc.nextDouble();
			
			valorTotal = valor1*qtd1 + valor2*qtd2;
			System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
			
			sc.close();
		//Exercício 6
		}else if (test == "ex6") {
			Scanner sc = new Scanner(System.in);
			double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
			
			System.out.print("Insira o valor A: ");
			a = sc.nextDouble();
			
			System.out.print("Insira o valor B: ");
			b = sc.nextDouble();
			
			System.out.print("Insira o valor C: ");
			c = sc.nextDouble();
			
			areaTriangulo = a*c / 2;
			areaCirculo = Math.PI * Math.pow(c, 2);
			areaTrapezio = ((a+b) * c) / 2;
			areaQuadrado = Math.pow(b, 2);
			areaRetangulo = a * b;
			
			System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
			System.out.printf("CIRCULO: %.3f%n", areaCirculo);
			System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
			System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
			System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
			sc.close();
		}
	}

}
