package App;
import java.util.Scanner;

public class Transposta {
	public static int[][] entrada(int mat[][]) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < mat.length; i++) {
			for (int j  = 0; j < mat[0].length; j++) {
				System.out.printf("Informe o elemento %d %d: ", i, j);
				mat[i][j] = scan.nextInt();
			}
		}
		
		return mat;
	}
	
	public static void impressao(int mat[][]) {						
		System.out.println("Original");
		for (int i = 0; i < mat.length; i++) {
			for (int j  = 0; j < mat[0].length; j++) {								
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}	
	
	public static void matrizTransposta(int mat[][], int at[][]) {								
		System.out.println("Transposta");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j  = 0; j < mat[0].length; j++) {				
				at[i][j] = mat[j][i];
				System.out.print(at[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	/* Caso a linha e coluna tenham tamanhos divergentes
	 * public static void matrizTransposta(int mat[][], int at[][]) {						
		
		System.out.println("Transposta");
		for (int i = 0; i < at.length; i++) {
			for (int j  = 0; j < at[0].length; j++) {				
				at[i][j] = mat[j][i];
				System.out.print(at[i][j] + " ");
			}
			System.out.println();
		}
		
	}*/
	
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int[][] transposta = new int[3][3];
		matriz = entrada(matriz);
		impressao(matriz);
		matrizTransposta(matriz, transposta);
	}
}
