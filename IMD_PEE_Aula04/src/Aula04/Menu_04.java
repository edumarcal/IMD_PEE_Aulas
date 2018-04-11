package Aula04;

import java.util.Scanner;

import Aula04.Exercicio03;
import Aula04.Exercicio05;

public class Menu_04 {

	// Agrade�o a Deus pelo dom do conhecimento
	// Eduardo Mar�al
	// C�digo fonte criado em: 16/06/14

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero do Exercicio da Aula 04");
		System.out.println("=======================================");
		int key = entrada.nextInt();
		switch (key) {
		case 1:
			new Exercicio01();
			Exercicio01.main();
			break;
		case 2:
			new Exercicio02();
			Exercicio02.main();
			break;
		case 3:
			new Exercicio03();
			Exercicio03.main();
			break;
		case 4:
			new Exercicio04();
			Exercicio04.main();
			break;
		case 5:
			new Exercicio05();
			Exercicio05.main();
			break;
		default:
			System.out.println("Atividade n�o cadastrada");
			break;

		}
		entrada.close();
	}

}
