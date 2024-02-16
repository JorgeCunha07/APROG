
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
public class Exercicio_I {

    /**
     * MINIMO MULTIPLO COMUM
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int mmc;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }

        mmc = (a * b) / num1;
        System.out.println(mmc);
    }
}
