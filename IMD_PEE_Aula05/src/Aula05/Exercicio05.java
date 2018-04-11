package Aula05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 23/06/14

	public static void main() {
		double numero, soma = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Caso queira terminar a execução digite: \"sair\"");
		System.out.println("Digite o numero:");
		try {
			while (true) {
				numero = entrada.nextDouble();
				soma = soma + numero;
				System.out.println("A soma dos numeros digitados é: " + soma);
			}
		} catch (InputMismatchException e) {
			System.out.println("Obrigado por ter testado, a soma final foi: " + soma);
		}
		
	}

}
