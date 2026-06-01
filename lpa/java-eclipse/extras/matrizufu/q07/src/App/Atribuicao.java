package App;

public class Atribuicao {
	public static int[][] entrada (int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (i < j) {
					m[i][j] = ((2*i) + (7*j) - 2);
				}
				else if (i == j) {
					m[i][j] = (3 * i) + (3 * i);
				}
				else {
					m[i][j] = ((4 * i) + (4 * i) + (4 * i)) - ((5 * j) + (5 * j)) + 1;
				}				
			}
		}
		
		return m;
	}
	
	public static void saida (int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.println(m[i][j]);			
			}
		}			
	}

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		matriz = entrada(matriz);
		
		saida(matriz);
	}
}
