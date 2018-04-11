package aula13;

import java.util.Scanner;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class JogoDaVelha {

	// armazena o jogador da vez
	private static int jog;

	// usado para criar a matriz do jogo
	private static int[][] casa = new int[3][3];

	private static int linha, coluna, vencedor;
	private static Scanner scanner = new Scanner(System.in);

	public static void desenha(int x, int y) {
		if (casa[x][y] == 1) {
			// campo marcado pelo jogador 1
			System.out.print("X");
		} else if (casa[x][y] == 2) {
			// campo marcado pelo jogador 2
			System.out.print("O");
		} else {
			System.out.print(" ");
		}
	}

	public static void jogo() {
		// aqui são mostrados os numeros das colunas do tabuleiro
		System.out.print("\n 1 2 3\n");

		// aqui mostra o numero da primeira linha
		System.out.print("1 ");

		// aqui é exibido o vamppo que cruza a linha 1 com a coluna 1
		desenha(0, 0);

		// caractere de divisão entre dois campos
		System.out.print(" |");

		desenha(0, 1);

		System.out.print(" |");

		desenha(0, 2);

		System.out.print("\n------------\n2");

		desenha(1, 0);
		System.out.print(" |");
		desenha(1, 1);
		System.out.print(" |");
		desenha(1, 2);
		System.out.print("\n------------\n3");
		desenha(2, 0);
		System.out.print(" |");
		desenha(2, 1);
		System.out.println(" |");
		desenha(2, 2);
	}

	public static void jogar(int jogador) {
		int i = 0;
		if (jogador == 1) {
			jog = 1;
		} else {
			jog = 2;
		}
		while (i == 0) {
			linha = 0;
			coluna = 0;
			while (linha < 1 || linha > 3) {
				System.out.print("Escolha a Linha (1,2,3):");
				linha = scanner.nextInt();
				if (linha < 1 || linha > 3) {
					System.out
							.println("Linha inválida! Escolha uma linha entre 1 e 3");
				}
			}
			while (coluna < 1 || coluna > 3) {
				System.out.print("Escolha a Coluna (1,2,3)");
				coluna = scanner.nextInt();
				if (coluna < 1 || coluna > 3) {
					System.out
							.println("Coluna inválida! Escolha uma linha entre 1 e 3");
				}
			}
			linha = linha - 1;
			coluna = coluna - 1;

			// verificar se o campo não ta vazio
			if (casa[linha][coluna] == 0) {
				casa[linha][coluna] = jog;
				i = 1;
			} else {
				System.out.println("Posição ocupada");
			}
		}
	}

	public static void check() {
		int i = 0;

		// verificar se ouve vencedor na horizontal
		for (i = 0; i < 3; i++) {
			if ((casa[i][0] == casa[i][1]) && (casa[i][0] == casa[i][2])) {
				if (casa[i][0] == 1) {
					vencedor = 1;
				}
				if (casa[i][0] == 2) {
					vencedor = 2;
				}
			}
		}

		// verificar se houve vencedor na Vertical
		for (i = 0; i < 3; i++) {
			if ((casa[0][i] == casa[1][i]) && (casa[0][i] == casa[2][i])) {
				if (casa[0][i] == 1) {
					vencedor = 1;
				}
				if (casa[0][i] == 2) {
					vencedor = 2;
				}
			}
		}

		// verificar se houve vencedor na diagonal de cima para baixo
		for (i = 0; i < casa.length; i++) {
			if ((casa[0][0] == casa[1][1]) && (casa[0][0] == casa[2][2])) {
				if (casa[0][0] == 1) {
					vencedor = 1;
				}
				if (casa[0][0] == 2) {
					vencedor = 2;
				}
			}

			// verificar se houve vencedor na Diagonal de baixo para cima

			if ((casa[0][2] == casa[1][1]) && (casa[0][2] == casa[2][0])) {
				if (casa[0][2] == 1) {
					vencedor = 1;
				}
				if (casa[0][2] == 2) {
					vencedor = 2;
				}
			}
		}

	}

	public static void main(String[] args) {
		int i = 0;
		// percorre todo o tabuleiro
		for (i = 0; i < 9; i++) {
			jogo();
			if (i % 2 == 0) {
				jogar(2);
			} else {
				jogar(1);
			}

			// chamar a rotina check
			check();
			if (vencedor == 1 || vencedor == 2) {
				// sai do laço
				i = 10;
			}
		}
		jogo(); // desenha novamento o jogo
		System.out.println();

		// informa o vencedor
		if (vencedor == 1 || vencedor == 2) {
			System.out.println("O jogador: " + vencedor + " é o ganhador");
		} else {
			System.out.println("Não houve vencedor! o jogo foi empate!");
		}
	}
}
