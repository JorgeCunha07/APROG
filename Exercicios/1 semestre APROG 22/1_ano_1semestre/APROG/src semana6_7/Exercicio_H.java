
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
public class Exercicio_H {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (verificarCapicua(i)) {
                System.out.println("capicua");
            } else {
                System.out.println("tentativas excedidas");
            }
        }

    }

    public static boolean verificarCapicua(int num) {

        int alg;
        int copia;
        int capicua = 0;

        num = sc.nextInt();
        copia = num;

        if (num >= 10) {
            do {
                alg = num % 10;
                capicua = capicua * 10 + alg;
                num = num / 10;
            } while (num > 0);

        }
        if (copia == capicua) {
            return true;
        } else {
            return false;
        }
    }
}
