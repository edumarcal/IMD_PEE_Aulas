package Aula07;

import java.util.Scanner;

public class Exercicio04 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 25/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String palavra = entrada.nextLine();
		char[] nome = palavra.toCharArray();
		char letra = 'a';
		int contagemA = 0;
		System.out.print("O nome inverso é: ");
		for (int i = nome.length -1; i >= 0; i--) {
			System.out.print(nome[i]);
			if (letra == nome[i]) {
				contagemA = contagemA + 1;
			}
		}
		//System.out.println();
		System.out.println("\nA quantidade de caracter \"a\" é: " + contagemA);
	}

}
