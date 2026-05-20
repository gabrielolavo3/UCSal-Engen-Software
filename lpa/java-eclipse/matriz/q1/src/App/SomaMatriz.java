package App;
import java.util.Scanner;

public class SomaMatriz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizA = new int[3][2];
		int[][] matrizB = new int[3][2];
		int[][] matrizC = new int[3][2];
		int soma = 0;
		
		for (int n = 0; n < 3; n++) {
			for (int x = 0; x < 2; x++) {
				System.out.printf("Informe o elemento da linha %d e coluna %d: ", n, x);
				matrizA[n][x] = scan.nextInt();
			}
		}
		
		System.out.println("\nAgora, insira para a matriz b");
		for (int n = 0; n < 3; n++) {
			for (int x = 0; x < 2; x++) {
				System.out.printf("Informe o elemento da linha %d e coluna %d: ", n, x);
				matrizB[n][x] = scan.nextInt();
			}
		}
		
		// Somando as matrizes	
		System.out.println("\n--RESUMO--\n");
		for (int a = 0; a < 3; a++) {
			soma = 0; // É preciso reiniciar o valor da variável
			
			for (int b = 0; b < 2; b++) {
				soma = matrizA[a][b] + matrizB[a][b]; // Efetua a soma
				matrizC[a][b] += soma;// Atribui a soma a linha e coluna atual
				
				System.out.println("matrizC: " + matrizC[a][b]);
			}
		}
		
		scan.close();
	}
}