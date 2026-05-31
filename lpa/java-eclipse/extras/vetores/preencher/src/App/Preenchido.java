/*Faça um vetor de tamanho 50 preenchido com o seguinte valor: (i+ 5 ∗ i)%(i+ 1), sendo
i a posicão do elemento no vetor. Em seguida imprima o vetor na tela.*/
package App;

public class Preenchido {
	public static int[] valores(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] += (i+5*i) % (i+1);
		}
		
		return vet;
	}
	
	public static void saida(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] vetor = new int[50];
		vetor = valores(vetor);
		saida(vetor);
	}

}
