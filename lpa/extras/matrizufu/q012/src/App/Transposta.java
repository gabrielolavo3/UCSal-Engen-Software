package App;
import java.util.Scanner;

public class Transposta {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int[][] transposta;
		
		matriz = lerMatriz(matriz);
		transposta = mtTrans(matriz);
		System.out.println("Matriz Original");
		saida(matriz);
		System.out.println("Matriz Transposta");
		saida(transposta);
	}
	
	public static int[][] lerMatriz(int[][] mt) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				System.out.print("Digite o valor " + i + " " + j + ": ");
				mt[i][j] = scan.nextInt();
			}
		}
		
		return mt;
	}
	
	public static int[][] mtTrans(int[][] mt) {
		int[][] novaMatriz = new int[3][3];
		
		// Linha I recebe coluna J; coluna J recebe linha I
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				novaMatriz[i][j] = mt[j][i];
			}
		}
		
		return novaMatriz;
	}
	
	public static void saida(int[][] mt) {
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				System.out.print(mt[i][j] + " ");
			}
			System.out.println();
		}			
	}

}
