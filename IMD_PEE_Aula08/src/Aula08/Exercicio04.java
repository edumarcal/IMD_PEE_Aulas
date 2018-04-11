package Aula08;

public class Exercicio04 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 25/06/14

	public static void main() {
		System.out.println("Numeros de 1 a 10");
		imprimeUmADez();
		System.out.println("\nNúmeros Pares deste intervalo");
		imprimePares();
		System.out.println("\nNúmeros Ímpares deste intervalo");
		imprimeImpares();

	}

	public static void imprimeUmADez() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");
		}
	}

	// Imprime os números pares
	public static void imprimePares() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

	// Imprime os números impares
	public static void imprimeImpares() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + ", ");
			}
		}
	}

}
