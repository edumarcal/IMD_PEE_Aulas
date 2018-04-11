package Aula04;

import java.util.Scanner;

public class Exercicio05 {

	// Agradeço a Deus pelo dom do conhecimento
	// Eduardo Marçal
	// Código fonte criado em: 16/06/14

	public static void main() {
		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		System.out.print("==========================");
		System.out.print("       Exercicio 05       ");
		System.out.println("==========================");
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = entrada.nextDouble();
		System.out.println("Digite o número corresponde a operação desejada");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		int key = entrada.nextInt();
		switch (key) {
		case 1:
			System.out.println("A soma é: " + num1 + num2);
			break;
		case 2:
			System.out.println("A subtração é: " + (num1 - num2));
			break;
		case 3:
			System.out.println("A multiplicação é: " + num1 * num2);
			break;
		case 4:
			System.out.println("A divisão é: " + num1 / num2);
			break;
		default:
			System.out.println("Operação não cadastrada!");
			break;
		}
		entrada.close();
	}

}
