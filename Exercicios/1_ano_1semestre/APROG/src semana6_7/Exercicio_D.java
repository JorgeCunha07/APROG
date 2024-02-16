
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
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m >= n) {
            if (m > 0 && n > 0) {
                System.out.println("C(" + m + "," + n + ")=" + combinacoes(m, n));
                System.out.println("P(" + m + "," + n + ")=" + permutacoes(m, n));

            }

        }
    }
    

    public static int fatorial(int num) {

        if (num <= 1) {
            return 1;
        }
        return (num * fatorial(num - 1));
    }

    public static int combinacoes(int m, int n) {

        int comb;

        comb = ((fatorial(m)) / (fatorial(n) * (fatorial(m - n))));

        return comb;

    }

    public static int permutacoes(int num1, int num2) {

        int per;

        per = (fatorial(num1) / (fatorial(num1 - num2)));

        return per;

    }

}
