package atividade03;

import java.util.Scanner;

public class Atividade03 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 16/07/14

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero do mes");
		System.out.println("O mes escolhido foi: "
				+ lerMeses(entrada.nextByte()));
	}

	public static String lerMeses(byte key) {
		String mes = "Favor informe corretamente o numero corresponte ao mes";
		switch (key) {
		case 1:
			/*
			 * Neste caso tanto faz usar o name() ou toString(). Estes dois
			 * metodos retornaram uma String.
			 * mes = Meses.Janeiro.name();
			 */
			mes = Meses.Janeiro.toString();
			break;
		case 2:
			mes = Meses.Fevereiro.toString();
			break;
		case 3:
			mes = Meses.Marco.toString();
			break;
		case 4:
			mes = Meses.Abril.toString();
			break;
		case 5:
			mes = Meses.Maio.toString();
			break;
		case 6:
			mes = Meses.Junho.toString();
			break;
		case 7:
			mes = Meses.Julho.toString();
			break;
		case 8:
			mes = Meses.Agosto.toString();
			break;
		case 9:
			mes = Meses.Setembro.toString();
			break;
		case 10:
			mes = Meses.Outubro.toString();
			break;
		case 11:
			mes = Meses.Novembro.toString();
			break;
		case 12:
			mes = Meses.Dezembro.toString();
			break;
		}
		return mes;
	}
}
