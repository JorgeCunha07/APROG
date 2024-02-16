import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n, num, algarismo, copia, div, contador;
        float percet, bestPercent = 0;
        n = ler.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {

                num = ler.nextInt();
                copia = num;
                div = 0;
                percet = 0;
                contador = 0;
                while (num > 0) {
                    algarismo = num % 10;
                    num = num / 10;
                    contador = contador + 1;
                    if (algarismo != 0) {
                        if (copia % algarismo == 0) {
                            div = div + 1;
                        }
                    }
                    percet = (float) div / contador * 100;
                }

                System.out.printf("%.2f%%%n",percet);
                if (percet > bestPercent) {
                    bestPercent = percet;

                }

            }
            System.out.printf("(%.2f%%)%n" , bestPercent);
        }
    }
}
