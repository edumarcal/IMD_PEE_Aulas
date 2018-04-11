package Aula12;

import java.util.Scanner;

import atividade02.Atividade02;

public class Menu_12 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 16/07/14

	@SuppressWarnings({ "static-access", "resource" })
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o numero corresponde ao exercicio desejado: ");
		byte key = entrada.nextByte();
		switch (key) {
		case 1:
			new Exercicio01().main();
			break;
		case 2:
			new Exercicio02().main();
			break;
		case 6:
			new Atividade02().main();
			break;
		default:
			System.out.println("Exercicio não cadastrado!");
			break;
		}

	}

}
