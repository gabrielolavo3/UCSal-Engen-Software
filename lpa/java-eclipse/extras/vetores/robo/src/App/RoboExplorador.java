package App;
import java.util.Scanner;

public class RoboExplorador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdRochasRaras = 0,						
			cont = 1;
		float peso,			  
			  pesoRochas = 0;
			
		
		while (cont <= 3) {
			System.out.print("Informe o peso da rocha encontrada: ");
			peso = scan.nextFloat();
			
			if (peso > 2.5f) {
				System.out.println("Rocha rara detectada e armazenada!\n");
				qtdRochasRaras++;
				pesoRochas += peso;
			}
			else {
				System.out.println("Rocha comum detectada. Objeto descartado para pesquisa\n");
			}
						
			cont++;
		}
		
		System.out.println("Total de rochas raras encontradas: " + qtdRochasRaras);
		System.out.printf("Peso total calculado: %.2f", pesoRochas);
		
		scan.close();
		
	}
}
