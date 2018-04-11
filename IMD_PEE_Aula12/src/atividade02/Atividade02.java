package atividade02;

import java.util.Scanner;

public class Atividade02 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 16/07/14

	public static void main() {
		//Leitura dos tres filmes
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dados do primeiro filme ");
		System.out.println("==========================");
		Filme filme1 = lerFilme(entrada);
		System.out.println("\nDados do segundo filme ");
		System.out.println("==========================");
		Filme filme2 = lerFilme(entrada);
		System.out.println("\nDados do terceiro filme ");
		System.out.println("==========================");
		Filme filme3 = lerFilme(entrada);
		
		//Impressão do três filmes
		System.out.println("\n\nOs dados do primeiro filme foi:");
		imprimirFilme(filme1);
		System.out.println("\nOs dados do segundo filme foi:");
		imprimirFilme(filme2);
		System.out.println("\nOs dados do terceiro filme foi:");
		imprimirFilme(filme3);
	}

	public static void imprimirFilme(Filme filme) {
		System.out.println("Nome do filme: " + filme.nome);
		System.out.println("Autor do filme: " + filme.autor);
		System.out.println("Ano do filme: " + filme.ano);
		System.out.println("Preco do filme: " + filme.preco);
	}

	public static Filme lerFilme(Scanner entrada) {
		Filme filme = new Filme();
		System.out.println("Digite o nome do filme:");
		filme.nome = entrada.nextLine();
		System.out.println("Digite o autor do filme:");
		filme.autor = entrada.nextLine();
		System.out.println("Digite o ano do filme");
		filme.ano = entrada.nextInt();
		System.out.println("Digite o preço do filme: ");
		filme.preco = entrada.nextInt();
		return filme;
	}

}
