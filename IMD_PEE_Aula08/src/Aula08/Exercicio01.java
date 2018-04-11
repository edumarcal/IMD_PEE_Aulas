package Aula08;

import java.util.Scanner;

// Agradeco a Deus pelo dom do conhecimento
// Eduardo Marcal
// Codigo fonte criado em: 25/06/14

public class Exercicio01 {
	static Scanner entrada = new Scanner(System.in);

	public static void main() {
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		nota1 = verificarNota(nota1);
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		nota2 = verificarNota(nota2);
		System.out.println("A média Aritimética é: "
				+ mediaAritmetica(nota1, nota2));

	}

	// Validação da Nota digitada
	public static double verificarNota(double nota) {
		boolean teste = true;
		while (teste) {
			if (nota >= 0 && nota <= 10) {
				teste = false;
				return nota;
			} else {
				System.out
						.println("Por favor informe a notas entre os valores (0 a 10)");
				nota = entrada.nextDouble();
			}
		}
		return nota;
	}
	
	//Calcular a media aritimética
	public static double mediaAritmetica(double n1, double n2) {
		return (n1 + n2) / 2;

	}

}
