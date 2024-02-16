
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
public class Exercicio_Y {

    /**
     * DIVISORES MULTIPLOS DE 3
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {

            num = sc.nextInt();

        } while (num < 0);

        if (num % 3 == 0) {
            for (int i = 1; i < num; i++) {

                if (num % i == 0) {
                    if (i % 3 == 0) {
                        System.out.println(i);

                    }
                }
            }
        } else {

            System.out.println("sem divisores multiplos de 3");
        }
    }
}
