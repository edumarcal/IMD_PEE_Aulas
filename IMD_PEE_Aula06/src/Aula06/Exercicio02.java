package Aula06;

import java.util.Scanner;

public class Exercicio02 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 23/06/14

	public static void main() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		double[] num = new double[2];
		num[0] = entrada.nextDouble();
		num[1] = entrada.nextDouble();
		System.out.println("o Produto deste dois numeros é:\n"+num[0]*num[1]);
	}

}
