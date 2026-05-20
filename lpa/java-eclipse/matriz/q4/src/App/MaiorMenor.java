package App;
import java.util.Scanner;

public class MaiorMenor {	
	public static void leitura(int m[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os valores para o conjunto Z\n");
		
		for (int n = 0; n < m.length; n++) {
			for (int x = 0; x < m[0].length; x++) {
				System.out.print("Elemento " + n + " e " + x + ": ");
				m[n][x] = sc.nextInt();
			}
		}
		
		sc.close();
	}
	
	public static void maior(int m[][]) {
		int maior = Integer.MIN_VALUE,
			maiorL = 0,
			maiorC = 0;
		
		for (int n = 0; n < m.length; n++) {
			for (int x = 0; x < m[0].length; x++) {
				if (maior < m[n][x]) {
					maior = m[n][x];
					maiorL = n;
					maiorC = x;
				}
			}					
		}
		
		System.out.printf("O maior número é %d e está na linha %d e coluna %d\n", maior, maiorL, maiorC);
	}
	
	public static void menor(int m[][]) {
		int menor = Integer.MAX_VALUE,
			menorL = 0,
			menorC = 0;
		
		for (int n = 0; n < m.length; n++) {
			for (int x = 0; x < m[0].length; x++) {
				if (menor < m[n][x]) {
					menor = m[n][x];
					menorL = n;
					menorC = x;
				}
			}
		}
		
		System.out.printf("O menor número é %d e está na linha %d e coluna %d", menor, menorL, menorC);				
	}
		
	public static void main(String[]args) {		
		int[][] matrizZ = new int[3][4];		
							
		leitura(matrizZ); // Passagem de parâmetro
		maior(matrizZ);
		menor(matrizZ);									
	}
}
