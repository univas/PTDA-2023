
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz1 = {{10}};
		int[][] matriz2 = {{2, 4},{6, 8}};
		
		System.out.println(determinante(matriz2));
	}
	
	public static int determinante(int[][] matriz) {
		if(matriz.length == matriz[0].length) {
			if(matriz.length == 1) {
				return matriz[0][0];
			}else if(matriz.length == 2){
				// i == j
				// i + j == length -1
				
				int diagPrin = 1;
				int diagSecu = 1;
				for(int i = 0; i < matriz.length; i ++) {
					for(int j = 0; j < matriz[i].length; j++) {
						if(i == j) {
							diagPrin *= matriz[i][j];
						}
						
						if(i+j == matriz.length - 1) {
							diagSecu *= matriz[i][j];
						}
					}
				}
				
				return diagPrin - diagSecu;
			}else{
				int[][] novaMatriz = new int[matriz.length][5];

				for(int i = 0; i < novaMatriz.length; i++) {
					for(int j = 0; j < novaMatriz[i].length; j++) {
						int coluna = j%matriz[i].length;

						novaMatriz[i][j] = matriz[i][coluna];
					}
				}

				int[] diagPrinc = {1, 1, 1};
				int[] diagSec = {1, 1, 1};


				for(int i = 0; i < novaMatriz.length; i++) {
					for(int j = 0; j < novaMatriz[i].length; j++) {
						if(i == j) {
							diagPrinc[0] *= novaMatriz[i][j];
							diagPrinc[1] *= novaMatriz[i][j+1];
							diagPrinc[2] *= novaMatriz[i][j+2];
						}

						if(i+j == novaMatriz.length - 1) {
							diagSec[0] *= novaMatriz[i][j];
							diagSec[1] *= novaMatriz[i][j+1];
							diagSec[2] *= novaMatriz[i][j+2];
						}
					}
				}

				int somaPrinc = 0;
				int somaSec = 0;

				for(int i = 0; i<diagPrinc.length; i++) {
					somaPrinc += diagPrinc[i];
					somaSec += diagSec[i];
				}
				return somaPrinc - somaSec;
			}
		}else {
			System.out.println("Não eh possivel calcular");
			return -1;
		}
	}

}
