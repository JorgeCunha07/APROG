import java.util.Scanner;

public class D {
    public static final int MAX = 21;
    static Scanner ler = new Scanner(System.in);

    public static void notasLidas(int[] notas) {

        for (int i = 0; i < notas.length; i++) {
            notas[i] = ler.nextInt();
        }
    }

    public static void notasGuardadas(int[] Resultado, int[] notas) {
        int valor;
        for (int i = 0; i < notas.length; i++) {
            Resultado[notas[i]] += 1;
        }
    }

    public static void mostrarVetorInteiros(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.println(i + " " + vec[i]);
        }
    }

    public static int lerInteiroPositivo() {
        int n;
        do {
            n = ler.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void main(String[] args) {
        int[] resultado = new int[MAX];
        int n = lerInteiroPositivo();
        int[] notas = new int[n];
        notasLidas(notas);
        notasGuardadas(resultado, notas);
        mostrarVetorInteiros(resultado);


    }
}

