package Aula09;

import java.util.Scanner;

public class Desafio09 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 02/07/14

	/*
	 * Faça um programa que defina um método recursivo "inverterVetor", que
	 * recebe um vetor "v" de inteiros e dois índices "i" e "j". Este método
	 * troca os elementos de "v", trocando as posições "v[i]" com "v[j]",
	 * "v[i+1]" com "v[j-1]" e assim por diante. Note que não é permitido o uso
	 * de repetições dentro desse método, apenas de chamadas recursivas a ele
	 * mesmo. Teste criando um vetor de 8 elementos e outro vetor de 15,
	 * invertendo-os completamente com o método implementado.
	 */

	public static Scanner leitor = new Scanner(System.in);
	static int quantElementos;
	static int v[];
	public static void main() {

		condicaoInicialVetor();
		lerVetor(v, 0);
		System.out.println("\nVetor lido: ");
		mostraVetor(v, 0);
		System.out.println("\nVetor invertido: ");
		inverterVetor(v, 0, quantElementos - 1);
		mostraVetor(v, 0);
	}
	
	public static void condicaoInicialVetor(){
		System.out.print("informe o numero de elementos do vetor: ");
		quantElementos = leitor.nextInt();
		if (quantElementos <= 0) {
			System.out.println("Verifique a quantidade de elementos do vetor\n");
			condicaoInicialVetor();
		}
		v = new int[quantElementos];
	}

	public static void lerVetor(int vetor[], int posicao) {
		leitor = new Scanner(System.in);
		if (posicao < quantElementos) {
			try {
				System.out.print("digite o valor " + (posicao + 1)
						+ " do vetor: ");
				vetor[posicao] = leitor.nextInt();
				posicao = posicao + 1;
				lerVetor(vetor, posicao);
			} catch (Exception e) {
				System.out.println("Informe apenas numeros");
				vetor[posicao] = leitor.nextInt();
				e.printStackTrace();
			}
		} else {
			posicao = 0;
		}
	}

	public static void mostraVetor(int vetor[], int posicao) {
		if (posicao < quantElementos) {
			System.out.print(vetor[posicao] + " ");
			posicao += 1;
			mostraVetor(vetor, posicao);
		} else {
			posicao = 0;
		}
	}

	public static void inverterVetor(int a[], int i, int j) {
		int aux;
		if (i < j) {
			aux = a[i];
			a[i] = a[j];
			a[j] = aux;
			inverterVetor(a, j + 1, i - 1);
		}
	}
}
