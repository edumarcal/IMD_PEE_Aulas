package Aula03;

import java.util.Scanner;

public class Exercicio04 {

	// Agradeço a Deus pelo dom do conhecimento
	// Eduardo Marçal
	// Código fonte criado em: 16/06/14

	public static void main() {
		Scanner entrada = new Scanner(System.in);
		double num1, num2, num3, soma;
		System.out.print("==========================");
		System.out.print("       Exercicio 04       ");
		System.out.println("==========================");
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = entrada.nextDouble();
		System.out.print("Digite o terceiro número: ");
		num3 = entrada.nextDouble();
		soma = num1 + num2 + num3;
		System.out.println("A soma dos três números é: " + soma);
		entrada.close();
	}

}
