package Aula06;

public class Exercicio05 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 23/06/14

	public static void main() {
		int[][] matriz = new int[10][5];
		int soma = 0;
		// Matriz 10x5 
		//Atribui a cada elemento da matriz o valor 1
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matriz[i][j] = 1);
			}
			System.out.println();
		}
		// Soma de todos os elemento da Matriz
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				soma = soma + matriz[i][j];
			}
		}
		System.out
				.println("A soma de todos elemento da Matriz 10x5 é: " + soma);
	}

}
