package App;
import java.util.Scanner;

public class Multiplicacao {
	public static void leitura(int m[][]) {
		Scanner scan = new Scanner(System.in);
		
		for (int a = 0; a < m.length; a++) {
			for (int b = 0; b < m[0].length; b++) {
				System.out.print("Elemento " + a + " e " + b + ": ");
				m[a][b] = scan.nextInt();
			}
		}
		
		//scan.close();
	}
	
	public static int[][] multiplicacao(int a[][], int b[][]) {
		int multi = 1;
		int[][]c = new int[2][2];
		
		for (int x = 0; x < a.length; x++) {
			multi = 1;
			
			for (int n = 0; n < a[0].length; n++) {
				multi = a[x][n] * b[x][n];
				c[x][n] = multi;							
			}
		}
		
		return c;
	}
	
	public static void impressao (int vet[][]) {
		for (int a = 0; a < vet.length; a++) {
			for (int b = 0; b < vet[0].length; b++) {
				System.out.println(vet[a][b]);
			}
		}
	}
	
	public static void main(String[] args) {		
		int[][] matrizA = new int[2][2];
		int[][] matrizB = new int[2][2];
		int[][] matrizC = new int[2][2];
		
		System.out.println("Insira os valores de A");
		leitura(matrizA);
		System.out.println("Insira os valores de B");
		leitura(matrizB);
		System.out.println("\n--VETOR C--\n");
		matrizC = multiplicacao(matrizA, matrizB);
		impressao(matrizC);		
	}
}
