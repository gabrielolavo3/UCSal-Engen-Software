package App;
import java.util.Scanner;

public class ParesInverso {
	public static int[] entrada(int[] vetor) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o valor " + i + ": ");
			int valor = scan.nextInt();

			if (valor % 2 == 0) {
				vetor[i] = valor;
			} else {
				System.out.println("\nDigite um número par");
				i--;
			}
		}

		return vetor;
	}

	public static void saida(int[] vet) {
		System.out.println("Ordem inversa do vetor");

		for (int i = vet.length - 1; i >= 0; i--) {
			System.out.print(vet[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] vet = new int[6];
		vet = entrada(vet);
		saida(vet);
	}
}
