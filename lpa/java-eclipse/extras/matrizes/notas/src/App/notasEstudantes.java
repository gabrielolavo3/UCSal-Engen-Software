package App;
import java.util.Scanner;

public class notasEstudantes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nomes = new String[2];
		float[][] notas = new float[2][3];
		
		for (int a = 0; a < nomes.length; a++) {			
			System.out.printf("Informe o nome do %dº estudante: ", (a+1));
			nomes[a] = scan.nextLine();
			
			for (int b = 0; b < 3; b++) {
				System.out.printf("Informe a %d nota: ", (b+1));
				notas[a][b] = scan.nextFloat();
				scan.nextLine();
			}
		}
		
		System.out.println("--PONTOS POR ESTUDANTE--");
		for (int a = 0; a < nomes.length; a++) {
			System.out.println("\nEstudante: " + nomes[a]);
			
			for (int b = 0; b < notas.length; b++) {
				System.out.println((b+1) + "º nota: " + notas[a][b]);
			}
		}
		
		scan.close();
	}
}
