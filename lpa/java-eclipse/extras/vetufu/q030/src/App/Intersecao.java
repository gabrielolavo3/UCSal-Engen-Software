package App;
import java.util.Scanner;

public class Intersecao {
	public static int[] entrada(int[] vetor, Scanner sc) {		
		
		for (int n = 0; n < vetor.length; n++) {
			System.out.print("Informe o elemento " + n + ": ");
			vetor[n] = sc.nextInt();
		}
		
		return vetor;
	}
	
	public static int[] intersecao(int[] vetorA, int[] vetorB) {		
		int contador = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {					
					contador++;					
					break;
				}
			}
		}
		
		int[] vetorC = new int[contador]; //Recebe o tamanho exato dos valores iguais
		int indice = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {					
					vetorC[indice] = vetorA[i];
					indice++; //Serve para mover o indice somente quando a condição for verdadeira. O contador do laço não serve
					break;
				}
			}
		}
		
		return vetorC;
	}
		
	public static void saida(int[] vetorC) {
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vet = new int[4];
		int[] vetB = new int[4];		
		
		System.out.println("Por favor, digite os números de A");
		vet = entrada(vet, scan);
		System.out.println("Agora, digite os números de B");
		vetB = entrada(vetB, scan); // É possível passar o Scanner por parâmetro
		
		int[] vetC = intersecao(vet, vetB); //Inicializa e recebe os valores do retorno do método
		saida(vetC);

	}	
}
