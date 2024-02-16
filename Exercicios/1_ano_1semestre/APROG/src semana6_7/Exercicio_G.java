
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
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            if (checkArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkArmstrong(int num) {
        int temp = num;
        int dig = 0;
        int total = 0;
        int n = 0;
        // total de digitos
        n = (temp + "").length();

        // verificar numero Armstrong
        while (temp != 0) {
            dig = temp % 10;
            total = (int) (total + Math.pow(dig, n));
            temp = temp / 10;
        }

        if (num == total) {
            return true;
        } else {
            return false;
        }
    }
}
