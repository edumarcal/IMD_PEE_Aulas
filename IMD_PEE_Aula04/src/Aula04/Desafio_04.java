package Aula04;

import java.util.Scanner;

public class Desafio_04 {

	// Agradeço a Deus pelo dom do conhecimento
	// Eduardo Marçal
	// Código fonte criado em: 18/06/14

	/**
	 * Escreva um programa que determine se um determinado ano introduzido pelo
	 * usuário é bissexto.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ano;
		String numero;
		System.out.print("Digite o ano: ");
		ano = entrada.nextInt();
		
		if (ano!=0) {
			if (ano%400==0) {
				System.out.println("O ano "+ ano+" é bissexto");
			}
			
			numero = String.valueOf(ano);
			numero.substring(2,4);
			ano = Integer.parseInt(numero);
			
			if(ano%4==00){
				System.out.println("O ano "+ ano+" é bissexto");}
			else{
				System.out.println("O ano "+ ano+" não é bissexto");
			}
			entrada.close();
		}

	}
}
