package Aula04;

import java.util.Scanner;

public class Exercicio05 {

	// Agrade�o a Deus pelo dom do conhecimento
	// Eduardo Mar�al
	// C�digo fonte criado em: 16/06/14

	public static void main() {
		Scanner entrada = new Scanner(System.in);
		double num1, num2;
		System.out.print("==========================");
		System.out.print("       Exercicio 05       ");
		System.out.println("==========================");
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
		System.out.println("Digite o n�mero corresponde a opera��o desejada");
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		int key = entrada.nextInt();
		switch (key) {
		case 1:
			System.out.println("A soma �: " + num1 + num2);
			break;
		case 2:
			System.out.println("A subtra��o �: " + (num1 - num2));
			break;
		case 3:
			System.out.println("A multiplica��o �: " + num1 * num2);
			break;
		case 4:
			System.out.println("A divis�o �: " + num1 / num2);
			break;
		default:
			System.out.println("Opera��o n�o cadastrada!");
			break;
		}
		entrada.close();
	}

}
