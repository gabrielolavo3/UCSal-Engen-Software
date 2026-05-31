package App;
import java.util.Scanner;

public class Iguais {
	public static int[] leitura(int[] vet) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Elemento " + i + ": ");
			vet[i] = scan.nextInt();
		}

		return vet;
	}

	public static void igualdade(int[] vet) {
		boolean localizado = false;
		
		for (int i = 0; i < vet.length; i++) {
			for (int j = i + 1; j < vet.length - 1; j++) {
				if (vet[i] == vet[j]) {
					System.out.print(vet[j] + " ");
					localizado = true;				
				}				
			}
		}
		
		if (!localizado) {
			System.out.println("Não há números iguais");
		}
	}

	public static void main(String[] args) {
		int[] vetor = new int[5];

		vetor = leitura(vetor);
		igualdade(vetor);
	}
}
