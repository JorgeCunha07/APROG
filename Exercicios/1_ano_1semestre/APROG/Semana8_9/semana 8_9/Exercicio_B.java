
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
public class Exercicio_B {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        

        int n = 0;
        int soma = 0;
        int[] elementos = new int[20000000];
        elementos[n]=sc.nextInt();
        int menor = elementos[0];

        do {
            if (elementos[n] < menor) {
                menor = elementos[n];
                soma = 0;

            }
            if (elementos[n] == menor) {
                soma++;
            }
            n++;
            elementos[n] = sc.nextInt();
        } while (elementos[n] >= 0);
        System.out.println("menor=" + menor);
        System.out.println("ocorrencias=" + soma);
    }
}
