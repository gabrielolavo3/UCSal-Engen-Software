package App;
import java.util.Scanner;

public class Opcoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float[] reais = new float[5];
		char codigo;
		int cont = 0,
			metadeVet = reais.length / 2,
			fimVet = reais.length - 1;
		
		while (cont < reais.length) {
			System.out.print("Digite o elemento " + cont + ": ");
			reais[cont] = scan.nextFloat();
			
			cont++;
		}
		
		System.out.println("\n---MENU DE SELEÇÃO---\n");
		System.out.println("1 - Imprimir o vetor");
		System.out.println("2 - Inverter vetor");
		System.out.println("0 - Sair e encerrar\n");
		System.out.print("Selecione uma das opções acima: ");
		codigo = scan.next().charAt(0);
		
		switch(codigo) {
			case '1':
				for (int a = 0; a < reais.length; a++) {
					System.out.printf("%.2f\n", reais[a]);
				}
				break;
			case '2':
				for (int inicioVet = 0; inicioVet < metadeVet; inicioVet++) {
					float vet = reais[inicioVet];
					reais[inicioVet] = reais[fimVet];
					reais[fimVet] = vet;
					fimVet--;
				}
				
				for (int a = 0; a < reais.length; a++) {
					System.out.printf("%.2f\n", reais[a]);
				}
				break;
			case '0':
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Código inválido!");
				break;
		}
		
		scan.close();

	}

}
