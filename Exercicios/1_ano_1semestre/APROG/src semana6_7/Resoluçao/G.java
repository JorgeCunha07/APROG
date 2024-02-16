/* G - Números de Armstrong
Faça um programa que imprima todos os números de Armstrong até um valor N inserido pelo utilizador.
Construa um módulo para verificar se um número inteiro é um número de Armstrong.
Um número de Armstrong possui a seguinte característica: a soma dos algarismos elevados à quantidade de algarismos é igual ao próprio número.
Por exemplo:
2 = 2^1    (1 algarismo => somar todos os algarismos elevados a 1)
407 =4^3 + 0^3 + 7^3    (3 algarismos => somar todos os algarismos elevados a 3)
1634 = 1^4 + 6^4 + 3^4 + 4^4    (4 algarismos => somar todos os algarismos elevados a 4)
*/

import java.util.Scanner;

public class G {
    public static Scanner ler = new Scanner(System.in);

    public static int ContarNumeros(int num) {
        int contador = 0;
        while (num > 0) {
            num /= 10;
            contador += 1;
        }
        return contador;
    }

    public static boolean VerificarArmstrong(int num, int contador) {
        int copia = num, algarismo;
        double Total = 0;

        while (copia > 0) {
            algarismo = copia % 10;
            copia /= 10;
            Total = Total + Math.pow(algarismo, contador);
        }
        return Total == num;
    }

    public static void main(String[] args) {
        int n, x, contador;
        boolean resultado;
        n = ler.nextInt();

        if (n < 1) {
            do {
                n = ler.nextInt();
            } while (n < 1);
        }
        for (x = 0; x < n; x++) {
            contador = ContarNumeros(x);
            resultado = VerificarArmstrong(x, contador);
            if (resultado == Boolean.TRUE) {
                System.out.println(x);
            }
        }
    }
}

