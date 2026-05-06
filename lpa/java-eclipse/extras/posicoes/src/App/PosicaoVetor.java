package App;
import java.util.Scanner;

public class PosicaoVetor {
	public static void main(String[] args) {
		float[] vetor = new float[5];
		int posicaoX,
			posicaoY,
			cont = 0;
		float numX = 0,
			  numY = 0;
		Scanner scan = new Scanner(System.in);
		
		while (cont < vetor.length) {
			System.out.printf("Informe o elemento da posição %d do vetor: ", cont);
			vetor[cont] = scan.nextFloat();
			cont++;
		}
		
		System.out.print("Informe um índice X para buscar o valor: ");
		posicaoX = scan.nextInt();
		System.out.print("Informe um índice Y para buscar o valor: ");
		posicaoY = scan.nextInt();
		
		/*cont = 0;
		
		while (cont < vetor.length) {
			
			if (cont == posicaoX) {
				numX = vetor[cont];
			}
			else {
				if (cont == posicaoY) {
					numY = vetor[cont];
				}
			}
			
			cont++;
		}
		
		System.out.println("Elemento da posição X: " + numX);
		System.out.println("Elemento da posição Y: " + numY);
		*/
		
		if (posicaoX < 0 || posicaoX > vetor.length) {
			Syste
		}
	}
}
