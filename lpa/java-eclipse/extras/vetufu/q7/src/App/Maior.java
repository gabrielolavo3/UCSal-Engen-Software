package App;
import java.util.Scanner;

public class Maior {
	public static void main(String[] args) {
		int[] vetor = new int[10];
		int maior,
			indice;
		
		vetor = entrada(vetor);
		maior = maiorNum(vetor);
		indice = indexMaior(vetor, maior);		
		saida(vetor, maior, indice);
	}
	
	public static int[] entrada(int[] vet) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Elemento " + i + ": ");
			vet[i] = scan.nextInt();
		}
		
		return vet;
	}
	
	public static int maiorNum(int[] vet) {	
		int maior = vet[0];
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			}
		}
		
		return maior;
	}
	
	public static int indexMaior(int[] vet, int maior) {					
		int indice = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == maior) {
				indice = i;
			}
		}
		
		return indice;
	}
	
	public static void saida(int[] vet, int maior, int indice) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Número " + i + ": " + vet[i]);			
		}
		
		System.out.println("O maior valor é " + maior + " e está no index " + indice);
	}	
}
