
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
public class Exercicio_B1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int i = 0;
        int cont = 0;

        int[] elementos = new int[2000000];
        elementos[i] = sc.nextInt();
        int menor = elementos[0];
        while (elementos[i] >= 0) {
            if (elementos[i] < menor) {
                menor = elementos[i];
                cont = 0;

            }
            if (elementos[i] == menor) {
                cont++;
            }
            i++;
            elementos[i] = sc.nextInt();
        }
        if (elementos[0] >= 0) {
            System.out.println("menor=" + menor);
        }
        System.out.println("ocorrencias=" + cont);

    }

}
