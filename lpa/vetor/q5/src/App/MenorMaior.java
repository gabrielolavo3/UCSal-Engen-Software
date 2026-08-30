package App;
import java.util.Scanner;

public class MenorMaior {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] numeros = new double [5];
		int indiceMenor = 0,
			indiceMaior = 0;
		double menor = Integer.MAX_VALUE,
			   maior = Integer.MIN_VALUE;
		
		for (int a = 0; a < numeros.length; a++) {
			System.out.print("Informe o elemento " + a + ": ");
			numeros[a] = scan.nextDouble();
			
			if (maior < numeros[a]) {
				maior = numeros[a];
				indiceMaior = a;
			}
			else {
				if (menor > numeros[a]) {
					menor = numeros[a];
					indiceMenor = a;
				}				
			}
		}
		
		System.out.printf("O maior valor é %.2f e está no índice %d\n", maior, indiceMaior);
		System.out.printf("O menor valor é %.2f e está no índice %d\n", menor, indiceMenor);
		
		scan.close();
	}
}
