package Aula12;

import java.util.Scanner;

public class Exercicio01 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 16/07/14

	public static void main() {
		Exercicio01_Pessoa pessoa = new Exercicio01_Pessoa();
		lerCaracteristicaPessoa(pessoa);
		imprimirCaracteristicaPessoa(pessoa);
	}

	@SuppressWarnings("resource")
	public static Exercicio01_Pessoa lerCaracteristicaPessoa(
			Exercicio01_Pessoa p) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome");
		p.nome = entrada.nextLine();
		System.out.println("Digite a cor do seu Cabelo");
		p.corCabelo = entrada.nextLine();
		System.out.println("Digite a cor dos seus olhos");
		p.corOlhos = entrada.nextLine();
		System.out.println("Digite a cor da sua Pele");
		p.corPele = entrada.nextLine();
		System.out.println("Digite seu estado civil");
		p.estadoCivil = entrada.nextLine();
		return p;

	}

	public static void imprimirCaracteristicaPessoa(Exercicio01_Pessoa p) {
		System.out.println("Seu nome é: " + p.nome);
		System.out.println("A cor do seu cabelo: " + p.corCabelo);
		System.out.println("A cor dos seus olhos é: " + p.corOlhos);
		System.out.println("A cor da sua pele é: " + p.corPele);
		System.out.println("Seu estado civil é: " + p.estadoCivil);
	}
}
