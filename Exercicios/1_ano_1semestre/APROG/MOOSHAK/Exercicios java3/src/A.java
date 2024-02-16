import java.util.Locale;
import java.util.Scanner;
public class A {
    static Scanner read = new Scanner(System.in);


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n;

        do {
            n = read.nextInt();
        } while (n < 0);

        int[] arr1 = notasPreencher(n);
        int soma = somaNotas(arr1);
        float media = (float) soma / n;

        System.out.printf("media=" + "%.1f\n", media);
        System.out.println("reprovacoes=" + notasNegativas(arr1));

    }


    public static int[] notasPreencher(int n) {
        int[] notas = new int[n];
        for (int i = 0; i < n; i++) {
            notas[i] = read.nextInt();
        }
        return notas;
    }


    public static int somaNotas(int[] arr1) {
        int soma = 0;
        for (int j : arr1) {
            soma += j;
        }
        return soma;
    }


    public static int notasNegativas(int[] arr1) {
        int contador = 0;
        for (int j : arr1) {
            if (j < 10) {
                contador++;
            }
        }
        return contador;
    }
}