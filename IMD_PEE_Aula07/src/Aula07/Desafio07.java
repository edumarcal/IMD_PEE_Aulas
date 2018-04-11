package Aula07;

import java.util.Scanner;

public class Desafio07 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 27/06/14

	// Desenvolva um programa em Java que aceita e valida o Cadastro de Pessoa
	// Física (CPF)

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Digite o numero do seu CPF:");
			String cpf = entrada.nextLine();
			char[] valido_cpf = new char[11];

			// Verificar o CPF
			while (cpf.toCharArray().length != 11) {
				System.out.println("Verfique o seu CPF!\nDigite novamente:");
				//Se não iniciar o novo Scanner ele retornará toda linha
				entrada = new Scanner(System.in);
				cpf = entrada.nextLine();

			}

			System.out.print("Seu CPF é: ");
			valido_cpf = cpf.toCharArray();
			// Imprime o CPF com os caracteres especiais
			for (int i = 0; i < valido_cpf.length; i++) {
				if (i == 3 || i == 6) {
					System.out.print(".");
				}
				if (i == 9) {
					System.out.print("-");
				}
				System.out.print(valido_cpf[i]);
			}
		} catch (Exception e) {
			System.out.println("Informe apenas numeros");
		}

	}

}
