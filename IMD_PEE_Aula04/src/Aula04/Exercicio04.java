package Aula04;

import java.util.Scanner;

public class Exercicio04 {

			// Agradeco a Deus pelo dom do conhecimento
			// Eduardo Marcal
			// Codigo fonte criado em: 22/06/14
	
	public static void main() {
		String letra;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma letra do alfabeto: ");
		letra = entrada.nextLine();
		letra.toUpperCase();
		entrada.close();
		switch (letra) {
		case "A":
			System.out.println("B");
			break;
		case "B":
			System.out.println("C");
			break;
		case "C":
			System.out.println("D");
			break;
		case "D":
			System.out.println("E");
			break;
		case "E":
			System.out.println("F");
			break;
		default:
			System.out.println("Letra não cadastrada");
			break;
		}
	}

}
