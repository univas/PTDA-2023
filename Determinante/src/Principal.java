
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
				return 0;
			}
		}else {
			System.out.println("Não eh possivel calcular");
			return -1;
		}
	}

}
