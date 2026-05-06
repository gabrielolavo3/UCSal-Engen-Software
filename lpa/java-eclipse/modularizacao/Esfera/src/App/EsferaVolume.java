package App;
import java.util.Scanner;

public class EsferaVolume {
	
	public static String volume(int raio) {
		float volume = (float) (4 * 3.14 * Math.pow(raio, 3)) / 3;
		// Math.pow aplica potencia | raio é a base e 3 é o numero elevado
		
		return String.format("Volume da espera %.2f", volume);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int raio;
		
		System.out.print("Informe o raio da esfera: ");
		raio = scan.nextInt();
		
		System.out.println(volume(raio));
	}
}
