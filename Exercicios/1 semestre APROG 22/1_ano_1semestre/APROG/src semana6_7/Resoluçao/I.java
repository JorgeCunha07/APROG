import java.util.Scanner;

public class I {
    public static Scanner ler = new Scanner(System.in);

    public static boolean sequenciaFibonnaci(int n) {
        int aux1 = 0, aux2 = 1, aux3 = aux1 + aux2;
        if (n < 0) {
            return false;
        }
        if (n == 0 || n == 1) {
            return true;
        }

        while (aux3 < n) {

            aux3 = aux1 + aux2;
            aux1 = aux2;
            aux2 = aux3;
        }
        return aux3 == n;

    }

    public static void main(String[] args) {
        int n;
        n = ler.nextInt();
        if (sequenciaFibonnaci(n)) {
            System.out.println("e de Fibonacci");
        } else {
            System.out.println("nao e de Fibonacci");
        }
    }
}
