import java.util.Scanner;

public class L {
    static Scanner ler = new Scanner(System.in);

    public static int lerNumerosArray(int[] numeros) {
        int i = 0;
        numeros[i] = ler.nextInt();
        while (numeros[i] >= 0 && i < 30) {
            i++;
            numeros[i] = ler.nextInt();
        }
        return i;
    }

    public static void vizinhoSuperior(int[] numeros, int y) {
        for (int i = 1; i < y - 1; i++) {
            if (numeros[i - 1] < numeros[i] && numeros[i] > numeros[i + 1]) {
                System.out.println(numeros[i]);
            }
        }
    }

    public static void main(String[] args) {
        final int MAX = 30;
        int[] numeros = new int[MAX];
        int i = lerNumerosArray(numeros);
        vizinhoSuperior(numeros, i);
    }
}
