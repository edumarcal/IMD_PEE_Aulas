package Aula08;

import java.util.Scanner;

public class Exercicio02 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 25/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma frase:");
		String caracteres = entrada.nextLine();
		System.out.println(letraMaiusculas(caracteres));
	}

	public static String letraMaiusculas(String texto) {
		return texto.toUpperCase();
	}

}
