package App;
import java.util.Scanner;

public class Busca {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[2][2];
		
		matriz = entrada(matriz, scan);
		saida(matriz, scan);
	}
	
	public static int[][] entrada(int[][] mt, Scanner sc) {				
		for (int a = 0; a < mt.length; a++) {
			for (int b = 0; b < mt[0].length; b++) {
				System.out.printf("Elemento %d %d: ", a, b);
				mt[a][b] = sc.nextInt();
			}
		}
		
		return mt;
	}
	
	public static void saida(int[][] mt, Scanner sc) {		
		int numero,
			linha = 0,
			coluna = 0;
		boolean encontrado = false;
		
		System.out.print("Informe um número que deseja buscar: ");
		numero = sc.nextInt();
		
		for (int a = 0; a < mt.length; a++) {
			for (int b = 0; b < mt[0].length; b++) {
				if (mt[a][b] == numero) {
					linha = a;
					coluna = b;
					encontrado = true;
					break;
				}
			}
		}
		
		if (encontrado) {
			System.out.println("O número " + numero + " está na linha " + linha + " e na coluna " + coluna);
		}
		else {
			System.out.println("O número " + numero + " não foi encontrado na matriz");
		}
	}

}
