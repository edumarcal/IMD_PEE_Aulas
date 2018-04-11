package Aula04;

import java.util.Scanner;

public class Exercicio02 {
	
		// Agradeco a Deus pelo dom do conhecimento
		// Eduardo Marcal
		// Codigo fonte criado em: 22/06/14
	
	public static void main() {
		double num1=0, num2=0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo numero: ");
		num2 = entrada.nextDouble();
		entrada.close();
		if (num1==num2) {
			System.out.print("Os numeros digitados são iguais");
		}else if (num1<num2) {
			System.out.println("O primeiro numero ("+num1+") é menor");
		}else{
			System.out.println("O segundo numero ("+num2+") é menor");
		}

	}

}
