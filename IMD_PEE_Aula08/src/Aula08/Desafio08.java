package Aula08;

import java.util.Scanner;

public class Desafio08 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 27/06/14

	/*
	 * Escreva um programa em Java que utilize uma estrutura modular com um
	 * procedimento que recebe um parâmetro inteiro ‘n’ e que ao ser chamado
	 * imprime uma sequência de linhas como mostram as figuras a seguir, para n
	 * = 6:
	 * 
	 * =============*=============* 
	 * 1 * 6 5 4 3 2 1 *
	 * 1 2 * 5 4 3 2 1 *
	 * 1 2 3 * 4 3 2 1 *
	 * 1 2 3 4 * 3 2 1 *
	 * 1 2 3 4 5 * 2 1 *
	 * 1 2 3 4 5 6 * 1 *
	 * =============*=============*
	 */

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		
		int n = entrada.nextInt();
		
		caractres();
		estruturaModular(n);
		caractres();
		
	}

	public static void estruturaModular(int num) {
		
		
		String[][] matrizDados = new String[num][num];
		
		// Linha
		for (int i = 1; i <= num; i++) {
			// Coluna
			for (int j = 1; j <=num; j++) {
				matrizDados[i][j]= String.valueOf(i+1);
				if (i*2==i+1) {
					matrizDados[i][j] = "*";
				}
			}
		}
	}
	

	public static void caractres() {
		System.out.println("\n*=============*=============*");
	}
}
