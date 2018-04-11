package Aula08;

import java.util.Scanner;

public class Exercicio03 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 25/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe uma palavra");
		String palavra = entrada.nextLine();
		System.out.println(subTexto(palavra));
	}

	public static String subTexto(String texto) {
		return texto.substring(0, 3);
	}

}
