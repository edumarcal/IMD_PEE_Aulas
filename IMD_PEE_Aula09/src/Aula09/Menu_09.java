package Aula09;

import java.util.Scanner;

public class Menu_09 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 25/06/14

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite o numero do Exercicio desejado");
		System.out.println("=====================================");
		byte key = entrada.nextByte();
		switch (key) {
		case 9:
			Desafio09.main();
			break;
		default:
			System.out.println("Exercicio nao cadastrado");
			break;
		}

	}

}
