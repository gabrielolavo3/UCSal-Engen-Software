package App;
import java.util.Scanner;

public class Pares {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[8];
		int qtdPares = 0;
		
		for (int a = 0; a < numeros.length; a++) {
			System.out.print("Informe o elemento da posição " + a + ": ");
			numeros[a] = scan.nextInt();
			
			if (numeros[a] % 2 == 0) {
				qtdPares++;
			}
		}
		
		System.out.printf("O vetor possui %d elementos pares", qtdPares);
		scan.close();
	}
}
