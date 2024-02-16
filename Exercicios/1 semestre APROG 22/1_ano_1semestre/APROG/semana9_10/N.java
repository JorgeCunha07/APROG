import java.util.Scanner;

public class N {
    static Scanner ler = new Scanner(System.in);

    public static void preencherMatriz(int[][] arrayMatriz){
        for (int i = 0; i < arrayMatriz.length; i++) {
            for (int j = 0; j < arrayMatriz[0].length; j++) {
                 arrayMatriz[i][j] = ler.nextInt();
            }
        }
    }
// linha sao o y e as colunas sao o x
// Neste caso o i corresponde as linhas y e o j as colunas o x
    public static void printDiagonais(int[][] arrayMatriz) {
        for(int i = 0; i < arrayMatriz.length; i++) {
            for(int j = arrayMatriz.length - 1; j >= 0; j--) {
                int auxI = i;
                int auxJ = j;

                if(auxI > 0) {
                    auxJ = 0;
                    j = 0;
                }

                while((auxI) < arrayMatriz.length && (auxJ ) <= arrayMatriz.length - 1) {
                    System.out.printf("[%d]", arrayMatriz[auxI][auxJ]);
                    auxI++;
                    auxJ++;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int lado;
        do {
            lado = ler.nextInt();
        }while(lado < 1 || lado > 20);

        int[][] arrayMatriz = new int[lado][lado];
        preencherMatriz(arrayMatriz);
        printDiagonais(arrayMatriz);

    }
}
