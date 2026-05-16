package App;
import java.util.Scanner;

public class MultiplicaIndice {
	
	public static final int MAX = 10; // constate

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[MAX];
		int[] vetorB = new int[MAX];
		int[] vetorC = new int[MAX];
		
		for (int a = 0; a < MAX; a++) {
			System.out.print("Insira o valor para o vetorA: ");
			vetorA[a] = scan.nextInt();
		}
		
		for (int a = 0; a < MAX; a++) {
			System.out.print("Insira o valor para o vetorB: ");
			vetorB[a] = scan.nextInt();
		}
		
		System.out.println("--VETORC--");
		for (int a = 0; a < MAX; a++) {
			for (int b = 0; b < MAX; b++) {
				int resultado;
				if (a == b) {
					resultado = vetorA[a] * vetorB[b];
					vetorC[a] = resultado;
				}
			}
			
			System.out.println("Elemento do vetorC: " + vetorC[a]);
		}
	}

}
