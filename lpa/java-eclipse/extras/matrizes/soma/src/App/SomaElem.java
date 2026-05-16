package App;
import java.util.Scanner;

public class SomaElem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int soma = 0;
		
		for (int a = 0; a < 3; a++) { // Percorre a quantidade de linhas
			for (int b = 0;b < 3; b++) { // Percorre a quantidade de colunas
				System.out.printf("Informe o valor da linha %d e coluna %d: ", a, b);
				matriz[a][b] = scan.nextInt(); //Ler a matriz através da linha e da coluna
				soma += matriz[a][b];
			}
		}
		
		System.out.println("\n--IMPRESSÃO--\n");
		for (int a = 0; a < 3; a++) {
			for (int b = 0;b < 3; b++) {
				System.out.printf("Elemento da linha %d e coluna %d: %d\n", a, b, matriz[a][b]);
			}
		}
		
		System.out.println("O resultado da soma da matriz é " + soma);
		
		scan.close();
	}
}
