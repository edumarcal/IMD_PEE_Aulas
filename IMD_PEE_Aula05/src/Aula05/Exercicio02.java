package Aula05;

import java.util.Scanner;

public class Exercicio02 {
	
				// Agradeco a Deus pelo dom do conhecimento
				// Eduardo Marcal
				// Codigo fonte criado em: 23/06/14

	public static void main() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o numero de execuções: ");
		String numero;
		numero = entrada.nextLine();
		long contagem = Long.parseLong(numero);
		entrada.close();
		
		for (int i = 1; i <=contagem; i++) {
			System.out.println("Execução: "+i);
		}
		
	}

}
