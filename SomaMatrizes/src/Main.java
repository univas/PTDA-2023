public class Main {
    public static void main(String[] args) {

        int count = 1;
        int count2 = 2;

        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matriz3 = new int[4][4];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = count++;
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length;j++){
                matriz2[i][j] = count2;
                count2 = count2 + 2;
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length;j++){
                matriz3[i][j] = matriz2[i][j] + matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j] + ". ");
            }
            System.out.println();
            }
        System.out.println();

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length;j++){
                System.out.print(matriz2[i][j] + ". ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length;j++){
                System.out.print(matriz3[i][j] + ". ");
            }
            System.out.println();
        }
        System.out.println();


    }
}