
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
public class Exercicio_K {

    /**
     * NUMERO PRIMOS ATE UM LIMITE
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n;
        n = ler.nextInt();

        for (int i = 2; i <= n; i++) {
            int cont = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cont++;
                }

            }
            if (cont == 0) {
                System.out.println(i);
            }

        }

    }
}
