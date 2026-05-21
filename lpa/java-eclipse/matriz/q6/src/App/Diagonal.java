package App;
import java.util.Scanner;

public class Diagonal {	
	public static void entrada(float m[][]) {
		Scanner scan = new Scanner(System.in);
		
		for (int a = 0; a < m.length; a++) {
			for (int b = 0; b < m[0].length; b++) {
				System.out.printf("Insira o elemento %d e %d: ", a, b);
				m[a][b] = scan.nextInt();
			}
		}
	}
	
	public static float soma(float vet[][]) {
		float soma = 0;		
		return soma = vet[0][3] 
					+ vet[1][2] 
					+ vet[2][1] 
					+ vet[3][0];			
	}
	
	public static void main(String[] args) {
		float[][] matriz = new float[4][4];	
		entrada(matriz);
		System.out.println("A soma da diagonal é " + soma(matriz));
	}
}
