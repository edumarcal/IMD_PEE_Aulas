package Aula04;

import java.util.Scanner;

public class Exercicio03 {

	// Agrade�o a Deus pelo dom do conhecimento
	// Eduardo Mar�al
	// C�digo fonte criado em: 16/06/14

	public static void main() {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.print("==========================");
		System.out.print("       Exercicio 03       ");
		System.out.println("==========================");
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		media = (nota1 + nota2) / 2;
		if (media >= 7) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}
		entrada.close();
	}

}
