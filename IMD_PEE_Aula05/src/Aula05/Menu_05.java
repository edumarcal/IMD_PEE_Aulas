package Aula05;

import java.util.Scanner;

public class Menu_05 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 23/06/14

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero do Exercicio da Aula 04");
		System.out.println("=======================================");
		int key = entrada.nextInt();
		//entrada.close();
		
		switch (key) {
		case 1:
			Exercicio01.main();
			break;
		case 2:
			Exercicio02.main();
			break;
		case 3:
			Exercicio03.main();
			break;
		case 4:
			Exercicio04.main();
			break;
		case 5:
			Exercicio05.main();
			break;
		default:
			System.out.println("Exercício não cadastrado!");
			break;

	}}

}
