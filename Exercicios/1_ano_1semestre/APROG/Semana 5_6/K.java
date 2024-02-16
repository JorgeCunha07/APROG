import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int divisores, nrDivisores, n;
        n = ler.nextInt();
        for (int x = 1; x <= n; x++) {

            nrDivisores = 0;
            divisores = x;

            for (int i = 1; i <= divisores; i++) {
                if (divisores % i == 0) {
                    nrDivisores = nrDivisores + 1;
                }
            }
            if (nrDivisores == 2) {
                System.out.println(divisores);
            }
        }
    }
}
