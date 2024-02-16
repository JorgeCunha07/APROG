import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int numero, a, soma;
        Scanner ler = new Scanner(System.in);
        numero = ler.nextInt();
        do {
            soma = 0;
            while (numero > 0) {
                a = numero % 10;
                numero = numero / 10;
                if ( a % 2 == 0) {
                    soma = soma + a;
                }
            }
            System.out.println(soma);
            numero = ler.nextInt();
        } while (numero > 0);
    }
}