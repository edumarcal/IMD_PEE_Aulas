package Aula03;

import java.util.Scanner;

public class Exercicio04 {

	// Agrade�o a Deus pelo dom do conhecimento
	// Eduardo Mar�al
	// C�digo fonte criado em: 16/06/14

	public static void main() {
		Scanner entrada = new Scanner(System.in);
		double num1, num2, num3, soma;
		System.out.print("==========================");
		System.out.print("       Exercicio 04       ");
		System.out.println("==========================");
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = entrada.nextDouble();
		soma = num1 + num2 + num3;
		System.out.println("A soma dos tr�s n�meros �: " + soma);
		entrada.close();
	}

}
