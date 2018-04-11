package Aula06;

import java.util.Scanner;

public class Exercicio04 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 23/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros que deseja digitar: ");
		int num[] = new int[entrada.nextInt()];
		int soma=0;
		System.out.println("Informe os "+num.length+" desejados");
		for (int i = 0; i < num.length; i++) {
			num[i] = entrada.nextInt();
			soma = soma+num[i];
		}
		System.out.println("A soma dos numeros digitados é: "+soma);
	
}
}
