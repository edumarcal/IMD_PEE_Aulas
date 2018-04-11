package Aula07;

import java.util.Scanner;

public class Exercicio05 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 25/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o texto");
		String palavra = entrada.next();
		char[] caracter = palavra.toCharArray();
		for (int i = 0; i < caracter.length; i++) {
			if (i%2==1) {
				System.out.print(caracter[i]);	
			}
			
		}
	}

}
