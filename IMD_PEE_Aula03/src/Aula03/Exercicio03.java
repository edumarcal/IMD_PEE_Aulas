package Aula03;

import java.util.Scanner;

//Agrade�o a Deus pelo dom do conhecimento
//Eduardo Mar�al
//C�digo fonte criado em: 16/06/14

public class Exercicio03 {
	public static void main() {
		Scanner entrada = new Scanner(System.in);
		int num1, num2, soma;
		System.out.print("==========================");
		System.out.print("       Exercicio 03       ");
		System.out.println("==========================");
		System.out.print("Digite o primeiro n�mero: ");
		num1 = entrada.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = entrada.nextInt();
		soma = num1 + num2;
		System.out.print("A soma dos dois n�meros �: " + soma);
		// Estava reclamando do fechamento
		// "Resource leak: 'entrada' is never closed"
		entrada.close();
	}
}
