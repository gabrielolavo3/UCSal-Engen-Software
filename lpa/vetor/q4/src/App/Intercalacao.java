package App;
import java.util.Scanner;

public class Intercalacao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vet1 = new int[3];
		int[] vet2 = new int[3];
		int[] vet3 = new int[3];			
		int cont = 0;
		
		System.out.println("--Elementos do VET1--");
		for (int a = 0; a < vet1.length; a++) {
			System.out.print("Insira o elemento da posição " + a + ": ");
			int valor = scan.nextInt();
			
			if ((a > 0) && (valor <= vet1[a - 1])) { //se contador > 0 E o valor inserido for <=  do que o valor da posição atual do vetor
				while (valor < vet1[a - 1]) {
					System.out.println("Elemento decrescente. Informe novamente");
					System.out.print("Insira o elemento da posição " + a + ": ");
					valor = scan.nextInt();
				}
			}
			else {
				vet1[a] = valor;
			}
			
			/*if ((a > 0) && (valor < vet1[a - 1])) {
				menor[a] = valor;
				System.out.println("menor: " + menor[a]);
			}
			else {
				vet1[a] = valor;
				System.out.printf("vet pos %d: %d\n", a, vet1[a]);
			}*/
		}
		
		System.out.println("\n--Elementos do VET2--");
		for (int a = 0; a < vet2.length; a++) {
			System.out.print("Insira o elemento da posição " + a + ": ");
			int valor = scan.nextInt();
			
			if ((a > 0) && (valor <= vet2[a - 1])) {
				while (valor < vet2[a - 1]) {
					System.out.println("Elemento decrescente. Informe novamente");
					System.out.print("Insira o elemento da posição " + a + ": ");
					valor = scan.nextInt();
				}
			}
			else {
				vet2[a] = valor;
			}
						
		}
		
		for (int a = 0; a < vet3.length; a++) {
			if (vet1[a] > vet2[cont]) {
				vet3[a] = vet1[a];
			}
			else {
				vet3[a] = vet2[cont];
			}
			
			//vet3[a] = vet1[a] > vet2[cont] ? vet1[a] : vet2[cont];
			
			cont++;
			
			System.out.printf("\nElemento %d do vet3: %d\n", a, vet3[a]);
		}
	}
}
