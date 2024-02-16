
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tiago Alves
 */
public class Exercicio_J {

    /**
     * PERCENTAGEM DE DIGITOS DIVISORES DO PROPRIO NUMERO
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N;
        int num;
        int num1;
        int num2;
        int contador = 0;
        double contador1 = 0;
        double contador2 = 0;
        double percentagem;
        double percentagemf = 0;

        N = ler.nextInt();

        if (N > 0) {
            while (N > contador) {
                contador = contador + 1;
                num = ler.nextInt();
                num2 = num;
                while (num2 > 0) {
                    contador2 = contador2 + 1;
                    num1 = num2 % 10;
                    if (num1 > 0) {
                        if (num % num1 == 0) {
                            contador1 = contador1 + 1;
                        }
                    }
                    num2 = num2 / 10;
                }
                percentagem = (contador1 / contador2) * 100;
                System.out.printf("%.2f%%%n", percentagem);
                contador1 = 0;
                contador2 = 0;
                if (percentagem > percentagemf) {
                    percentagemf = percentagem;
                }

            }
            System.out.printf("(%.2f%%)%n", percentagemf);

        }

    }
}
