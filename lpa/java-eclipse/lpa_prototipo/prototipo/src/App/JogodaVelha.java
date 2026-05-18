package App;

import java.util.Scanner;

public class JogodaVelha {

	public static void imprimirArea(char matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int r = 0; r < matriz[0].length; r++) {
				System.out.print("| ");
			}

			System.out.println();
		}
	}
	
	public static boolean validarVitoria(char jogador, char matriz[][]) {
		
		//Verificando a vitória por linha
		for (int i = 0; i < 3; i++) {
			if (matriz[i][0] == jogador && matriz[i][1] == jogador && matriz[i][2] == jogador) {
				System.out.println("O jogador " + jogador + "venceu a partida!");
				return true;
			}
		}
		
		//Verificando a vitória nas colunas
		for (int i = 0; i < 3; i++) {
			if (matriz[0][i] == jogador && matriz[1][i] == jogador && matriz[2][i] == jogador) {
				System.out.println("O jogador " + jogador + "venceu a partida!");
				return true;
			}
		}
		
		//Verificando a vitória na diagonal principal
		if (matriz[0][0] == jogador && matriz[1][1] == jogador && matriz[2][2] == jogador) {
			System.out.println("O jogador " + jogador + "venceu a partida!");
			return true;
		}
		
		//Verificando a vitória na diagonal secundária
		if (matriz[0][2] == jogador && matriz[1][1] == jogador && matriz[2][0] == jogador) {
			System.out.println("O jogador " + jogador + "venceu a partida!");
			return true;
		}
	
		
		return false;
	}
	
	public static char alternarJogador(char jogador) {
		if (jogador == 'X') {
			jogador = 'O';
		}
		else {
			jogador = 'X';
		}
		
		return jogador;
	}	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[][] areaJogo = { 
				{ ' ', ' ', ' ' }, 
				{ ' ', ' ', ' ' }, 
				{ ' ', ' ', ' ' }
		};
		int linha, coluna, jogadas = 0;
		char jogadorAtual = 'X';
		boolean ativarJogo = true;
		
		while (ativarJogo) {
			imprimirArea(areaJogo);
			System.out.print("\nÉ a vez do " + jogadorAtual + ". Escolha uma linha (0 a 2): ");
			linha = scan.nextInt();
			
			if (linha < 0 || linha > 2) {
				System.out.println("Você inseriu uma posição de linha errada. Informe novamante!\n");
				continue;
			}
			
			System.out.print("Agora, escolha uma coluna (0 a 2): ");
			coluna = scan.nextInt();
			
			if (coluna < 0 || coluna > 2) {
				System.out.println("Você inseriu uma posição de coluna errada. Informe novamante!\n");
				continue;
			}
			
			if (areaJogo[linha][coluna] != ' ') {
				System.out.println("Essa posição já está ocupada. Esolha outra\n");
				continue;
			}
			
			areaJogo[linha][coluna] = jogadorAtual;
			jogadas++; //Acumulador para definir o empate, se houver
			
			if (validarVitoria(jogadorAtual, areaJogo)) {
				System.out.println("O jogador " + jogadorAtual + " venceu!");
				imprimirArea(areaJogo);
				ativarJogo = false;
			}
		}
	}
}
