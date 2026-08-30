package App;
import java.util.Scanner;

public class SomaAcima {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int soma = 0;
		
		matriz = entrada(matriz);
		soma = somaMatriz(matriz, soma);
		saida(matriz, soma);
	}
	
	public static int[][] entrada(int[][] mt) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				System.out.printf("Elemento %d %d: ", i, j);
				mt[i][j] = scan.nextInt();
			}
		}
		
		return mt;
	}
	
	public static int somaMatriz(int[][] mt,int soma) {						
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				if (j > i) {
					soma += mt[i][j];
				}
			}
		}
		
		return soma;
	}
	
	public static void saida(int[][] mt, int soma) {
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				System.out.print(mt[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("A soma dos números é " + soma);
	}

}
