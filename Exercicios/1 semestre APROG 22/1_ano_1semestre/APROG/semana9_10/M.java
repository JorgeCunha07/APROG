import java.util.Scanner;

public class M {
    static Scanner ler = new Scanner(System.in);
    public static final int MAX = 150;
    public static final int ALG = 11;
    public static int lerNumero(int[][] NumeroArray) {
        int size = 0;
        do {
            NumeroArray[size][10] = ler.nextInt();
            size++;
        } while (NumeroArray[size - 1][10] >= 0);
        return size - 1;
    }

    public static void calculateDigits(int[][] arr1, int size) {

        for (int i = 0; i < size; i++) {
            int number = arr1[i][10];
            do {
                int digit = number % 10;
                arr1[i][digit] = 1;
                number /= 10;
            } while (number != 0);
        }
    }

    public static void printF(int[][] arr1, int size) {

        for (int i = 0; i < size; i++) {
            int soma = 0;
            for (int j = 0; j < arr1[i].length - 1; j++) {
                soma += arr1[i][j];
            }
            System.out.println(arr1[i][10] + ":" + soma);
        }
    }

    public static void main(String[] args) {
        int[][] NumeroArray = new int[MAX][ALG];
        int size = lerNumero(NumeroArray);
        calculateDigits(NumeroArray, size);
        printF(NumeroArray, size);
    }
}