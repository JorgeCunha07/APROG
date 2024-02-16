import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 1, soma, contador = 0, nr;

        nr = ler.nextInt();
        do {
            soma = 0;
            for (int i = 1; i < n; i++) {

                if (n % i == 0) {
                    soma = soma + i;
                }
            }
            if (soma == n) {
                System.out.println(n);
                contador = contador + 1;
            }
            n = n + 1;

        } while (nr != contador);
    }
}
