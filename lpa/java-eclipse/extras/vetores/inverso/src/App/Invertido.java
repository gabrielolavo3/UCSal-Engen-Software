package App;
import java.util.Scanner;

public class Invertido {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[6];
		int fim = numeros.length - 1;
		int metadeTam = numeros.length / 2;
		
		for (int a = 0; a < numeros.length; a++) {
			System.out.print("Insira o elemento " + a + ": ");
			numeros[a] = scan.nextInt();
		}
		
		for (int a = 0; a < metadeTam; a++) {
			int vetor = numeros[a]; // Guarda os primeiros valores
			numeros[a] = numeros[fim]; // Troca o valor de inicio com o valor do final
			numeros[fim] = vetor; // Troca os valores final com os valores o inicio			
			fim--;
		}
		
		for (int a = 0; a < numeros.length; a++) {
			System.out.println(numeros[a]);
		}
		
		scan.close();
	}

}
