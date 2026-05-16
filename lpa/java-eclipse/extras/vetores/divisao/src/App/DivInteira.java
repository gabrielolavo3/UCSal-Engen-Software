package App;
import java.util.Scanner;

public class DivInteira {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int[] valores = new int[7];
		int menor = Integer.MAX_VALUE;
		
		System.out.println("Por favor, insira os números do vetor");
		for (int x = 0; x < valores.length; x++) {
			valores[x] = scan.nextInt();
			
			if (menor > valores[x]) {
				menor = valores[x];
			}
		}
		
		for (int j = 0; j < valores.length; j++) {
			int novoValor = valores[j] / menor;
			valores[j] = novoValor;
		}
		
		System.out.println("O menor valor do vetor é " + menor);
		System.out.println("Esse é o vetor dividido por " + menor);
		
		for (int x = 0; x < valores.length; x++) {
			System.out.print(valores[x] + " ");
		}
		
		scan.close();
	}

}
