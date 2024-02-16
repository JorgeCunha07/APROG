
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
public class Exercicio_Z {

    /**
     * PERCENTAGEM DE ALGARISMOS PARES E MAIOR IMPAR
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int alg;
        int percentagem;

        do {
            num = sc.nextInt();

        } while (num < 0);

        while (num > 0) {
            alg = num % 10;
            num = num / 10;
            if (alg % 2 == 0) {
                
            }

        }
    }
}
