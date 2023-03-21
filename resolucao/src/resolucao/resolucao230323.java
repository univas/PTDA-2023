package resolucao;

import java.util.Random;

public class resolucao230323 {
// Exercício resolvido por Jeremias.Nunes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] notas = new double[30][4];
		double[] media = new double[30];
		
		Random generator = new Random();
		for(int i=0;i<30;i++) {
			double soma=0;
			for(int j = 0;j<4;j++) {
				notas[i][j]= generator.nextDouble()*25;
				soma+=notas[i][j];
			}
			media[i]=soma/4;
			System.out.printf("Aluno %2d: media = %.2f\n ", i+1, media[i]);
		}
	}

}
