
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
public class Exercicio_G {

    /**
     * DIVISORES DE UM NUMERO
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        int cont = 0;
        int divisor = 0;

        num = ler.nextInt();
        while (cont < num) {
            cont++;
            if (num % cont == 0) {
                divisor++;
                System.out.println(cont);
            }

        }
        System.out.println("(" + divisor + ")");

    }

}
