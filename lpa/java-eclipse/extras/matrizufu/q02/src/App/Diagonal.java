package App;

public class Diagonal {
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		matriz = entrada(matriz);
		saida(matriz);
	}
	
	public static int[][] entrada(int[][] mt) {
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				if (i == j) { // Se a linha e coluna forem iguais, recebe 1				
					mt[i][j] = 1;
				}
				else {					
					mt[i][j] = 0;
				}
			}
		}
		
		return mt;
	}
	
	public static void saida(int[][] mt) {
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[0].length; j++) {
				System.out.print(mt[i][j] + " ");
			}
			System.out.println();
		}
	}
}
