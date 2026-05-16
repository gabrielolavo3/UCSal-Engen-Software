package App;
import java.util.Scanner;

public class DadosMatematicos {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[5];
		int qtdPares = 0,
			qtdImpares = 0,
			somaPar = 0,
			qtdPositivos = 0,
			qtdNegativos = 0,
			maior = Integer.MIN_VALUE,
			menor = Integer.MAX_VALUE;
		float mediaPares;
		
		for (int a = 0; a < numeros.length; a++) {
			System.out.print("Informe o elemento " + a + ": ");
			numeros[a] = scan.nextInt();
			
			if (numeros[a] % 2 == 0) {
				qtdPares++;
				somaPar+=numeros[a];
			}
			else {
				qtdImpares++;
			}
			
			if (numeros[a] > 0) {
				qtdPositivos++;
			}
			else {
				qtdNegativos++;
			}
			
			if (numeros[a] > maior) {
				maior = numeros[a];
			}
			
			if (menor > numeros[a]) {
				menor = numeros[a];
			}
		}
		
		mediaPares = somaPar / qtdPares;
		
		System.out.println("Quantidade de pares: " + qtdPares);
		System.out.println("Quantidade de ímpares: " + qtdImpares);
		System.out.println("Quantidade de positivos: " + qtdPositivos);
		System.out.println("Quantidade de negativos: " + qtdNegativos);
		System.out.println("Quantidade de números: " + numeros.length);
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		System.out.printf("Média dos números pares: %.2f", mediaPares);
		
		scan.close();
	}

}
