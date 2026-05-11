package App;
import java.util.Scanner;

public class Complemento {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		int[] vetorC = new int[10];
		int[] vetorD = new int[10];
		int valor,
			cont = 0,
			qtdA = 0,
			qtdB = 0,
			qtdC = 0,
			novoIndice = 0;
		
		System.out.println("Informe os valores para o VetorA");
		while (cont < vetorA.length) {			
			valor = scan.nextInt();
			
			if (valor == 999) {				
				break;				
			} 
			else {
				if (valor > 0) {
					vetorA[cont] = valor;
					cont++;
					qtdA++;
				}
				else {
					System.out.println("Informe um número maior");
				}	
			}					
		}				
		
		// Adicionando o vetorA no vetorC
		for (int a = 0; a < qtdA; a++) {
			int b;
			for (b = 0; b < qtdC; b++) {
				if (vetorA[a] == vetorC[b]) {
					break;
				}
			}
			
			if (b == qtdC) {
				vetorC[qtdC] = vetorA[a];
				qtdC++;
			}
		}
		
		cont = 0;
		
		System.out.println("\nInforme os valores para o VetorB");
		while (cont < vetorB.length) {			
			valor = scan.nextInt();
			
			if (valor == 999) {				
				break;
			} 
			else {
				if (valor > 0) {
					vetorB[cont] = valor;
					cont++;
					qtdB++;
				}
				else {
					System.out.println("Informe um número maior");
				}	
			}					
		}
			
		// Adicionando o vetorB no vetorC
		for (int a = 0; a < qtdB; a++) {
			int b;
			
			for (b = 0; b < qtdC; b++) {
				if (vetorB[a] == vetorC[b]) {
					break;
				}
			}
			
			if (b == qtdC) {
				vetorC[qtdC] = vetorB[a];
				qtdC++;
			}
		}
		
		for (int a = 0; a < qtdA; a++) {
			int b;	
			boolean encontrado = false;
			
			// Procura o elemento de A dentro de B
			for (b = 0; b < qtdB; b++) {
				if (vetorA[a] == vetorB[b]) {
					encontrado = true;
					break;
				}
			}
			
			// Se não achar o elemento em B, adiciona em D
			if (encontrado == false) {
				 vetorD[novoIndice] = vetorA[a];
			     novoIndice++;
			}
		}
		
		System.out.println("--ELEMENTOS DO VTC--");
		for (int a = 0; a < qtdC; a++) {
			System.out.println(vetorC[a]);
		}
		
		System.out.println("--ELEMENTOS DO VTD--");
		for (int a = 0; a < novoIndice; a++) {
			System.out.println(vetorD[a]);
		}
	}
}
