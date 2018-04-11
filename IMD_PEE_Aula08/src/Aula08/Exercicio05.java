package Aula08;

import java.util.Scanner;

public class Exercicio05 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 25/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o numeros de linha da matriz");
		int i = entrada.nextInt();
		System.out.println("Informe o numero de colunas da matriz");
		int j = entrada.nextInt();
		matriz(i, j);
	}

	// Procedimento para criar uma matriz identidade
	public static void matriz(int linha, int coluna) {
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (i == j) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
