package App;
import java.util.Scanner;

public class Anagrama {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char vetor1[],
			 vetor2[];
		String palavraUm,
			   palavraDois;
		int tamanhoUm,
			tamanhoDois,
			letrasEncontradas = 0,
			n,
			x;
		
		System.out.print("Informe a primeira palavra: ");
		palavraUm = scan.nextLine();
		System.out.print("Informe a segunda palavra: ");
		palavraDois = scan.nextLine();
		
		vetor1 = palavraUm.toCharArray(); // Conversão de uma String para vetor de caracteres
		vetor2 = palavraDois.toCharArray();
		tamanhoUm = vetor1.length;
		tamanhoDois = vetor2.length;
		
		for (n = 0; n < tamanhoUm; n++) { // Percorre todas as letras do vetor
			for (x = 0; x < tamanhoDois; x++) {
				if (vetor1[n] == vetor2[x]) {
					vetor2[x] = ' '; // Retira a letra encontrada para que não seja usada duas vezes.
					letrasEncontradas++;
					break; // Para a busca ao encontrar uma letra correspondente
				}
			}
			
			if (x == tamanhoDois) {
				break;
			}
		}
		
		if (letrasEncontradas == tamanhoUm && letrasEncontradas == tamanhoDois) {
			System.out.println("As palavras são anagramas");			
		}
		else {
			System.out.println("As palavras NÃO são anagramas");
		}
		
		scan.close();
	}

}
