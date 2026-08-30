package App;
import java.util.Scanner;

public class Sequencia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[5];
		int valor,
			contador = 0;
		
		while (contador < vetor.length) {
			System.out.print("Informe o elemento " + contador + " | use 0 para encerrar o programa: ");
			valor = scan.nextInt();
			
			if (valor == 0) {
				break;
			}
			else {
				if (valor > 0) {
					vetor[contador] = valor;
					contador++;
				}				
			}					
		}
		
		int[] vetorB = new int[contador];
		int limiteB = 0;
//		boolean jaExiste = false;
		
		for (int a = 0; a < contador; a++) {   
			boolean jaExiste = false;
			
            // Verifica se o elemento atual de 'vetor' já foi adicionado ao 'vetorB'
            for (int b = 0; b < limiteB; b++) {
                if (vetor[a] == vetorB[b]) {
                    jaExiste = true;
                    break;
                }
            }

            // Se não for duplicado, adiciona ao vetorB
            if (!jaExiste) {
                vetorB[limiteB] = vetor[a];
                limiteB++;
            }
        }
		
		System.out.println("--Elementos do VetorB--");
		for (int a = 0; a < limiteB; a++) {
			System.out.println(vetorB[a]);
		}
		
		scan.close();
		
	}
}
