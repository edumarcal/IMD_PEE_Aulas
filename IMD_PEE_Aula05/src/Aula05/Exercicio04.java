package Aula05;

import java.util.Scanner;

public class Exercicio04 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 23/06/14

	public static void main() {
		Scanner entrada = new Scanner(System.in);
		long numero, maiorNum = 0;
		System.out.println("Digite dez numeros e veja qual é o maior: ");
		for (int i = 1; i <= 10; i++) {
			numero = entrada.nextLong();
			// verificar se o numero digitado é positivo
			if (numero >= 0) {
				// Se for verdadeiro vai compara se ele é maior,caso seja,
				// sera armazenado numa variavel para posteriormente ser comparada
				// e ao final da execução do loop será o valor maior informado pelo usuario
				if (numero > maiorNum) {
					maiorNum = numero;
				}
			} else {
				// Caso contrario solicita que o usuario digite novamente
				System.out.println("Informe apenas numeros positivos: ");
				numero = entrada.nextLong();
			}
		}
		System.out.println("O maior numero digitado foi:" + maiorNum);
		entrada.close();
	}

}
