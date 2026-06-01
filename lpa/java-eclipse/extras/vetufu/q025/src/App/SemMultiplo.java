package App;

public class SemMultiplo {
	public static void main(String[] args) {
		int[] vetor = new int[100];
		int posicao;
		
		posicao = numeros(vetor);
		saida(vetor, posicao);
	}
	
	public static int numeros(int[] vet) {
		int pos = 0;
		
		for (int i = 0; i < vet.length; i++) {
			if (i % 7 != 0) {
				if (i % 10!= 7) {
					vet[pos] = i;
					pos++;	//Atualiza o indice do vetor				
				}				
			}
		}
		
		return pos;
	}
	
	public static void saida(int[] vet, int pos) {
		for (int i = 0; i < pos; i++) { //Pos percorre ao vetor até a posição que foi preeenchida
			System.out.print(vet[i] + " ");
		}
	}

}
