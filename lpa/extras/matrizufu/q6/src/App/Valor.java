package App;
import java.util.Scanner;

public class Valor {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matA = new int[2][2];
		int[][] matB = new int[2][2];
		int[][] matC;
		
		matA = lerMatriz(matA, scan);
		matB = lerMatriz(matB, scan);
		matC = novaMatriz(matA, matB);
		saida(matC);
	}
	
	public static int[][] lerMatriz(int[][] mt, Scanner sc) {
		for (int a = 0; a < mt.length; a++) {
			for (int b = 0; b < mt[0].length; b++) {
				System.out.print("Digite o valor " + a + " " + b + ": ");
				mt[a][b] = sc.nextInt();
			}
		}
		
		return mt;
	}
	
	public static int[][] novaMatriz(int[][] a, int[][] b) {
		int[][] matrizC = new int[2][2];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > b[i][j]) {
					matrizC[i][j] = a[i][j];
				}
				else {
					if (b[i][j] > a[i][j] ) {
						matrizC[i][j] = b[i][j];
					}
				}
			}
		}
		
		return matrizC;
	}
	
	public static void saida(int[][] mt) {
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				System.out.print(mt[i][j] +" ");
			}
			System.out.println();
		}
	}
}
