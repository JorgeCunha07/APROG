
import java.lang.reflect.Array;
import java.util.Arrays;
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
public class Exercicio_C {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num = sc.nextInt();
//        System.out.print(Arrays.toString(lerNum(num)));

        System.out.println("sempre crescente = " + isSorted(lerNum(num)));

    }

    public static double[] lerNum(int num) {

        double[] N = new double[num];

        for (int i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        return N;

    }

    public static boolean isSorted(double[] num) {

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {

                return false;
            }
        }
   
        return true;
    }

}
