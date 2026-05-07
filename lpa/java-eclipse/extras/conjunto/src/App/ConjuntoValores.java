package App;
import java.util.Scanner;

public class ConjuntoValores {
	
	public static void imprimirVetor(int[] vetor, String tipo) {
		for (int a = 0; a < vetor.length; a++) {
			System.out.printf("Elemento %s do vetor %d\n", tipo, vetor[a]);
		}					
	}	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[] pares = new int[5];
		int[] impares = new int[5];	
		int contPares = 0,
			contImpares = 0;
		
		System.out.println("Insira uma sequência de números inteiros");
		for (int a = 0; a < 30; a++) {
			System.out.printf("Informe o número do índice %d: ", a);
			int valor = scan.nextInt();
			
			if (valor % 2 == 0) {
				pares[contPares] = valor;
				contPares++; // atualiza o índice de pares
								
				if (contPares == 5) {
					imprimirVetor(pares, "PAR");
					contPares = 0; // Esvazia o vetor, fazendo-o retornar para ler a posição 0
				}
			}
			else {
				impares[contImpares] = valor;
				contImpares++;
				
				if (contImpares == 5) {
					imprimirVetor(impares, "ÍMPAR");
					contImpares = 0;
				}
			}
		}
				
		
		imprimirVetor(pares, "PAR (restante)");
		imprimirVetor(impares, "ÍMPAR (restante)");
                
		scan.close();
	}

}
