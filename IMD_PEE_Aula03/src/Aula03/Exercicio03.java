package Aula03;

import java.util.Scanner;

//Agradeço a Deus pelo dom do conhecimento
//Eduardo Marçal
//Código fonte criado em: 16/06/14

public class Exercicio03 {
	public static void main() {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, soma;
		System.out.print("==========================");
		System.out.print("       Exercicio 03       ");
		System.out.println("==========================");
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = entrada.nextInt();
		soma = num1 + num2;
		System.out.print("A soma dos dois números é: " + soma);
		// Estava reclamando do fechamento
		// "Resource leak: 'entrada' is never closed"
		entrada.close();
	}
}
