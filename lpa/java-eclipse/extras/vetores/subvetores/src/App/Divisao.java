package App;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		int[] vetorC = new int[10];
		int qtd = 0;
		
		System.out.println("Insira os valores para o primeiro vetor");
		for (int a = 0; a < vetorA.length; a++ ) {
			vetorA[a] = scan.nextInt();
		}
		
		System.out.println("\nInsira os valores para o segundo vetor");
		for (int a = 0; a < vetorB.length; a++ ) {
			vetorB[a] = scan.nextInt();
		}
		
		for (int a = 0; a < vetorA.length; a++) {
			vetorC[a] = vetorA[a] - vetorB[a];;
			qtd++;
		}
		
		for (int a = 0; a < qtd; a++) {
			System.out.printf("Elemento %d do vetorC: %d\n", a, vetorC[a]);
		}
		
		scan.close();
	}

}
