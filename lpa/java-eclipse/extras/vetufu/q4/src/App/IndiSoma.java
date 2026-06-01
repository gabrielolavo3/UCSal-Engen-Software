package App;
import java.util.Scanner;

public class IndiSoma {
	public static int[] entrada(int[] v) {
		Scanner scan = new Scanner(System.in);
		
		for (int a = 0; a < v.length; a++) {
			System.out.print("Insira o elemento " + a + ": ");
			v[a] = scan.nextInt();			
		}
		
		return v;
	}
	
	public static int somarValor(int[] vetor) {
		Scanner scan = new Scanner(System.in);
		int somaVet = 0,
			posiX,
			posiY;
		
		System.out.print("Informe o índice X | 1 a 8: ");
		posiX = scan.nextInt();
		System.out.print("Informe o índice Y | 1 a 8: ");
		posiY = scan.nextInt();
		
		somaVet = vetor[posiX] + vetor[posiY];
		
		return somaVet;
	}

	public static void main(String[] args) {
		int[] vet = new int[8];
		int soma;
		
		entrada(vet);
		soma = somarValor(vet);
		System.out.println("A soma das posições é " + soma);
	}

}
