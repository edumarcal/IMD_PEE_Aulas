package Aula07;

import java.util.Scanner;

public class Exercicio01 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 23/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro nome: ");
		String nome1 = entrada.nextLine();
		System.out.println("Digite outro nome: ");
		String nome2 = entrada.nextLine();
		if (nome1.equalsIgnoreCase(nome2)) {
			System.out.println("Os nomes são iguais");
		} else {
			System.out.println("Os nomes são diferentes");
		}

	}

}
