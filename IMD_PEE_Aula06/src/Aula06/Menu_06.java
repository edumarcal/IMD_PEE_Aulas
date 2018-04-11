package Aula06;

import java.util.Scanner;

public class Menu_06 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 23/06/14

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero do exercicio desejado");
		System.out.println("=====================================");
		byte key = entrada.nextByte();
		switch (key) {
		case 1:
			Exercicio01.main();
			break;
		case 2:
			Exercicio02.main();
			break;
		case 3:
			Exercicio03.main();
			break;
		case 4:
			Exercicio04.main();
			break;
		case 5:
			Exercicio05.main();
			break;
		default:
			System.out.println("Exercício não cadastrado!");
			break;
		}

	}

}
