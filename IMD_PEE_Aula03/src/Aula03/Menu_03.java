package Aula03;

import java.util.Scanner;

//Agrade�o a Deus pelo dom do conhecimento
//Eduardo Mar�al
//C�digo fonte criado em: 16/06/14

public class Menu_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o n�mero do Exercicio da Aula 03");
		System.out.println("=======================================");
		int key = entrada.nextInt();
		switch (key) {
		case 3:
			new Exercicio03();
			Exercicio03.main();
			break;
		case 4:
			new Exercicio04();
			Exercicio04.main();
			break;
		default:
			System.out.println("Atividade n�o cadastrada");
			break;

		}
		entrada.close();
	}

}
