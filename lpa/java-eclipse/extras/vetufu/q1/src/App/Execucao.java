package App;

public class Execucao {
	public static int somaNum(int[] v) {
		int soma = v[0] + v[1] + v[5];
		return soma;
	}
	
	public static void saida(int[] v) {
		for (int a = 0; a < v.length; a++) {
			System.out.println(v[a]);
		}
	}
	
	public static void main(String[] args) {
		int[] vet = { 1, 5, 0, -2, 5, 7 };
		int soma;
		
		soma = somaNum(vet);
		vet[4] = 100;		
		saida(vet);
		System.out.println("A soma das posições indicadas é " + soma);
	}
}
