
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
public class Exercicio_D {

    /**
     * PRODUTO DOS ALGARISMOS IMPARES(V2)
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        int alg;
        num = ler.nextInt();
        
        do {
            int multiplicacao = 1;

            while (num > 0) {
                alg = num % 10;
                num = num / 10;
                if (alg % 2 != 0) {
                    multiplicacao = multiplicacao * alg;
                }

            }
            if (multiplicacao == 1) {
                System.out.println("nao ha algarismos impares");
            } else {
                System.out.println(multiplicacao);
            }
            num = ler.nextInt();

        } while (num > 0);

    }

}
