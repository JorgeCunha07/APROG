
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
public class Exercicio_E {

    /**
     * COVERTER DE BASE 8 PARA DECIMAL
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num;
        int alg;

        num = ler.nextInt();

        while (num > 0) {
            int ordem = 0;
            int soma = 0;
            
            while (num > 0) {

                alg = num % 10;
                num = num / 10;
                soma = soma + alg * (int) Math.pow(8, ordem);
                ordem++;             
            }
            System.out.println(soma);
            num = ler.nextInt();
        }

    }
}
