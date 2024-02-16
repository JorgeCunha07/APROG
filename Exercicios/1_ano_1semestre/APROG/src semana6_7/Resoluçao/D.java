import java.util.Scanner;

public class D {
    public static Scanner ler = new Scanner(System.in);

    public static int fatorial(int numFatorial) {
        int x, fator = numFatorial;
        if (numFatorial >= 1) {
            for (x = 1; x < numFatorial; x++) {
                fator = fator * x;
            }
        }
        else{
            fator = 1;
        }
        return fator;
    }
    public static int combinacoes(int m, int n) {
        int combinacao ;
        if (fatorial(m-n) == 0){
            combinacao = 0;
        }
        else {
            combinacao = fatorial(m) / (fatorial(n) * fatorial(m-n));
        }

        return combinacao;
    }

    public static int permutacao(int m, int n) {
        int permutacao ;
            if(fatorial(m-n) == 0){
                permutacao = 0;
            }
            else {
                permutacao = fatorial(m) / fatorial(m - n);
            }
        return permutacao;
    }

    public static void main(String[] args) {
        int m, n, C, P;
        m = ler.nextInt();
        n = ler.nextInt();
        if (m >= n) {
            if (m > 0 && n > 0) {
                C = combinacoes(m, n);
                P = permutacao(m, n);
                System.out.printf("C(%d,%d)=%d%n", m, n, C);
                System.out.printf("P(%d,%d)=%d%n", m, n, P);
            }
        }
    }
}
