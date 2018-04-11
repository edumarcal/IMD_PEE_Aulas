package Aula12;

import java.util.Scanner;

public class Exercicio02 {

	// Agradeco a Deus pelo dom do conhecimento
	// Eduardo Marcal
	// Codigo fonte criado em: 16/07/14

	public static void main() {
		Exercicio02_Usuario usuario = new Exercicio02_Usuario();
		lerDadosUsuario(usuario);
		imprimirDadosUsuario(usuario);
	}

	@SuppressWarnings("resource")
	public static Exercicio02_Usuario lerDadosUsuario(
			Exercicio02_Usuario usuario) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do Usuario");
		usuario.nomeUsuario = entrada.nextLine();
		System.out.println("Digite a matricula do Usuario");
		usuario.matriculaUsuario = entrada.nextInt();
		System.out.println("Digite a senha de cadastro do Usuario");
		//Erro corrigir
		usuario.senhaUsuario = String.valueOf(entrada.hasNextLine());
		entrada = new Scanner(System.in);
		System.out.println("Informe os dados de Endereco do Usuario");
		System.out.println("Digite o a rua do Usuario");
		usuario.endereco.rua = entrada.nextLine();
		System.out.println("Digite o numero da casa do Usuario");
		usuario.endereco.numCasa = entrada.nextInt();
		System.out.println("Digite o CEP do Usuario");
		usuario.endereco.CEP = entrada.nextInt();
		return usuario;
	}

	public static void imprimirDadosUsuario(Exercicio02_Usuario usuario) {
		System.out.println("Nome do usuario: " + usuario.nomeUsuario);
		System.out.println("Matricula do usuario: " + usuario.matriculaUsuario);
		System.out.println("Senha do usuario: " + usuario.senhaUsuario);
		System.out.println("Rua do usuario: " + usuario.endereco.rua);
		System.out.println("Numero da casa do usuario: "
				+ usuario.endereco.numCasa);
		System.out.println("CEP do usuario: " + usuario.endereco.CEP);
	}
}
