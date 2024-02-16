
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
public class Exercicio_L {

    /**
     * NUMERO PERFEITO
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int num = 1;
        int soma;
        int n = sc.nextInt();

        while (cont < n) {
            soma = 0; 

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    soma = soma + i;
                }
            }

            if (num == soma) {
                System.out.println(num);
                cont++;
            }

            num++;

        }
    }
}
