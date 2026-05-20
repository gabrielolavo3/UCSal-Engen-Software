package App;
import java.util.Scanner;

public class Produto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrizM = new int[5][2];
		int multi = 1;
		
		System.out.println("Insira os elementos da matriz");
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 2; b++) {
				matrizM[a][b] = scan.nextInt();
			}
		}
		
		//Multiplicando os elementos
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 2; b++) {
				multi *= matrizM[a][b];				
			}
		}
		
		System.out.println("O produto da matriz é " + multi);
		
		scan.close();
	}
}