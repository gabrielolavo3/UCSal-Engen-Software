package App;
import java.util.Scanner;

public class Busca {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] m = new int[3][5];
		int x,
			linha = 0,
			coluna = 0;
		boolean achado = false;
		
		for (int n = 0; n < 3; n++) {
			for (int v = 0; v < 5; v++) {
				System.out.printf("Elemento %d e %d: ", n, v);
				m[n][v] = scan.nextInt();
			}
		}
		
		System.out.print("Digite um número para procurar na matriz: ");
		x = scan.nextInt();
		
		for (int n = 0; n < 3; n++) {
			achado = false;
			for (int v = 0; v < 5; v++) {
				if (m[n][v] == x) {			
					linha = n;
					coluna = v;
					achado = true;	
					break; // Interrompe o loop interno quando localiza o número
				}				
			}
			
			//É preciso interomper o loop externo quando achar o valor
			if (achado) {
				break;
			}
		}
		
		if (!achado) {
			System.out.println("O valor não foi encontrado");										
		}
		else {
			System.out.println("O número " + x + " está na linha " + linha + " e coluna " + coluna);
		}
		
		scan.close();
	}
}
