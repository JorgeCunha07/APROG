
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
public class Exercicio_F {

    /**
     * CAPICUA
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        int alg;
        int copia;
        int capicua = 0;

        num = ler.nextInt();
        copia = num;

        if (num >= 10) {
            do {
                alg = num % 10;
                capicua = capicua * 10 + alg;
                num = num / 10;
            } while (num > 0);

        }
        if (copia == capicua) {
            System.out.println("capicua");

        } else {
            System.out.println("nao capicua");
        }
    }

}
