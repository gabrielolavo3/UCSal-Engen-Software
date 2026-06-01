package App;

import java.util.Scanner;

public class Codigo {
	public static float[] entrada(float[] vet) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Número " + i + ": ");
			vet[i] = scan.nextFloat();
		}

		return vet;
	}

	public static void saida(float[] vet) {
		Scanner scan = new Scanner(System.in);
		int codigo = -1;
		
		while (codigo < 0 || codigo > 2) {
			System.out.println("\nMENU DE OPÇÕES\n");
			System.out.println("1 - Impresao");
			System.out.println("2 - Impresao inversa");
			System.out.println("0 - Encerrar");
			System.out.print("Escolha um dos códigos acima: ");
			codigo = scan.nextInt();

			switch (codigo) {
				case 1:
					for (int i = 0; i < vet.length; i++) {
						System.out.print(vet[i] + " ");					 
					}
					break;
				case 2:
					for (int i = vet.length -1; i >= 0; i--) {
						System.out.print(vet[i] + " ");					 
					}
					break;
				case 3:
					System.out.println("\nO programa foi encerrado com sucesso!");
					break;
				default:
					System.out.println("Código inválido");
					break;
			}
		}		
	}

	public static void main(String[] args) {
		float[] reais = new float[5];

		reais = entrada(reais);
		saida(reais);
	}
}
