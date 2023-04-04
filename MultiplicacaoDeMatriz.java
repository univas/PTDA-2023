public class Principal {

	public static void main(String[] args) {
		int[][] matrizA = {{1,2,3}, {5,6,7}}, matrizB = {{2, 4}, {10, 12}, {18, 20}}, matrizC;
		
		// verifica se pode calcular
		if(matrizA.length == matrizB[0].length) {
			// cria a matriz para armazenar o resultado
			matrizC = new int[matrizA.length][matrizB[0].length];
			
			// primeiro for para passar pelas linhas de A
			for(int i = 0; i<matrizA.length; i++) {
				// segundo  for para passar pelas colunas de B
				for(int j =0; j<matrizB[i].length; j++) {
					// totalizador
					int total = 0;
					
					// terceiro for para passar pelas colunas de A
					for(int m =0; m<matrizA[0].length; m++) {
						// Somatório da multiplicação de cada elemento
						 total += matrizA[i][m] * matrizB[m][j];
					}
					
					matrizC[i][j] = total;
					System.out.print(matrizC[i][j] + " ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Não é possível calcular.");
		}
	}
	

}
