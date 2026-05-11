package App;
import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		int[] vetorC = new int[5];
		int contB = 0,
			contC = 0;
		
		for (int a = 0; a < vetorA.length; a++) {
			System.out.printf("Insira o número %d: ", a);
			vetorA[a] = scan.nextInt();
		}
		
		for (int j = 0; j < vetorB.length; j++) {						
			int a;
			boolean eImpar = false;
			
			for (a = 0; a < contB; a++) {
				if (j % 2 != 0) { // Procura pelas posições ímpares
					eImpar = true;
					break; // Interrompe a busca ao encontrar a posição
				}
			}
			
			// Se a posição for ímpar, adiciona o valor em B
			if (!eImpar) {
				int valor = vetorA[j];
				vetorB[a] = valor;
				contB++;
			}
		}
		
		for (int k = 0; k < vetorC.length; k++) {						
			int a;
			boolean ePar = false;
			
			for (a = 0; a < contC; a++) {
				if (k % 2 == 0) {
					ePar = true;
					break;
				}
			}
						
			if (!ePar) {
				int valor = vetorA[k];
				vetorC[a] = valor;
				contC++;
			}
		}
		
		System.out.println("\nVETOR B");
		for (int a = 0; a < contB; a++) {
			System.out.println("Elemento " + a + " do vetorB: " + vetorB[a]);			
		}
		
		System.out.println("\nVETOR C");
		for (int a = 0; a < contB; a++) {
			System.out.println("Elemento " + a + " do vetorC: " + vetorC[a]);			
		}

	}

}
