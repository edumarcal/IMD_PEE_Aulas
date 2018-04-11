package Aula03;

import java.util.Scanner;

public class Desafio_03 {

	// Agrade�o a Deus pelo dom do conhecimento
	// Eduardo Mar�al
	// C�digo fonte criado em: 16/06/14

	/**
	 * Elabore um programa que solicite ao usu�rio o dia, m�s e ano atuais,
	 * depois o dia, m�s e ano em que ele nasceu, e a seguir calcula a idade em
	 * segundos do usu�rio
	 */

	public static void main(String[] args) {
		int dia_atual, mes_atual, ano_atual, dia_nasc, mes_nasc, ano_nasc;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia de nascimento: ");
		dia_nasc = entrada.nextInt();
		System.out.print("Digite o m�s de nascimento: ");
		mes_nasc = entrada.nextInt();
		System.out.print("Digite o ano de nascimento: ");
		ano_nasc = entrada.nextInt();
		System.out.println("==========================");
		System.out.print("Digite o dia atual: ");
		dia_atual = entrada.nextInt();
		System.out.print("Digite o m�s atual: ");
		mes_atual = entrada.nextInt();
		System.out.print("Digite o ano atual: ");
		ano_atual = entrada.nextInt();
		entrada.close();

		// Opera��o com a idade
		long idade_ano = ano_atual - ano_nasc;
		long idade = 0;
		if (ano_atual > ano_nasc) {
			System.out.println("Voc� tem : " + idade_ano + " anos");
			idade = idade_ano;
			idade_ano = (idade_ano * 8640) * 3600;
			System.out.println("Sua idade em segundo �: " + idade_ano);
		}

		// Opera��o com a m�s
		long idade_mes = mes_atual - mes_nasc;
		if (mes_atual > mes_nasc) {
			System.out.println("Voc� tem : " + idade + " anos e " + idade_mes
					+ " meses");
			idade_ano = idade_ano + ((idade_mes * 720) * 3600);
			System.out.println("Sua idade+meses em segundo �: " + idade_ano);
		}

		// Opera��o com dia
		long idade_dia = dia_atual - dia_nasc;
		if (dia_atual > dia_nasc) {
			System.out.println("Voc� tem : " + idade + " anos e " + idade_mes
					+ " meses e " + idade_dia + " dias");
			idade_ano = idade_ano + ((idade_dia * 24) * 3600);
			System.out
					.println("Sua idade+meses+dia em segundo �: " + idade_ano);
		}
	}

}
