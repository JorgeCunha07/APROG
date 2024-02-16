import java.util.Scanner;

public class A {
    static final int MAX=5;
    public static int ContarNumeros(int c) {
        int contador = 0;
        while (c > 0) {
            c = c / 10;
            contador += 1;
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c, nCaracteres, digitos, contador = 0, soma = 0;
        float media;
        nCaracteres = ler.nextInt();
        do {
            c = ler.nextInt();
            digitos = ContarNumeros(c);
            if (digitos < nCaracteres) {
                contador += 1;
                soma += c;
            }


        } while (digitos < nCaracteres && contador < MAX );
        media = (float) soma / contador;

        System.out.printf( "%.2f%n",media);
    }

}





