
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
public class Exercicio_M {

    /**
     * SEQUENCIA DE FIBONACCI
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int ter1 = 0;
        int ter2 = 1;

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            ter1 = ter1 + ter2;
            ter2 = ter1 - ter2;

            System.out.println(ter2);
        }

    }
}
