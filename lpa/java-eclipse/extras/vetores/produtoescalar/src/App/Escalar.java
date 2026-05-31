package App;
import java.util.Scanner;

public class Escalar {
	public static int[] entrada(int[] vet) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Insira o %d: ", i);
			vet[i] = scan.nextInt();
		}
		
		return vet;
	}
	
	public static void saida(int[] vet) {			
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");			
		}				
	}
	
	public static int produtoEscalar(int[] a, int[] b) {
		int produto = 0,
			tam = a.length - 1;
		
		for (int i = 0; i < tam; i++) {
			produto += a[i] * b[i];
		}
		
		return produto;
	}

	public static void main(String[] args) {
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int produto;
		
		vetA = entrada(vetA);
		vetB = entrada(vetB);
		produto = produtoEscalar(vetA, vetB);
		
		System.out.println("Vetor A");
		saida(vetA);
		System.out.println("\nVetor B");
		saida(vetB);
		System.out.println("\nProduto escalar: " + produto);
	}
}
