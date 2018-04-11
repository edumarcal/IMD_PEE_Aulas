package Aula04;

import java.util.Scanner;

public class Exercicio01 {
	
		// Agradeco a Deus pelo dom do conhecimento
		// Eduardo Marcal
		// Codigo fonte criado em: 22/06/14
	
	public static void main() {
		int num1=0, num2=0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		entrada.close();
		if (num1>num2) {
			System.out.print("O primeiro numero: "+ num1+ " é maior");
		}else{
			System.out.println("O segundo numero: "+num2+" é maior");
		}

	}

}
