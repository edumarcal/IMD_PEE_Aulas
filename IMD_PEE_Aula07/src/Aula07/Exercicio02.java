package Aula07;

import java.util.Scanner;

public class Exercicio02 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 25/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome:");
		String nome = entrada.nextLine();
		if ((nome.length() == -1) || (nome.length()<=3)) {
			System.out.println("O nome digitado contém "+nome.length()+" caracteres e não foi aprovado");
		}else{
			System.out.println("O nome digitado contém "+nome.length()+" carateres e foi aprovado nos requesitos.");
		}
	}

}
