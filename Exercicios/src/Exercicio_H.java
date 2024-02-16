
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
public class Exercicio_H {

    /**
     * NUMERO PRIMO
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisores = 1;
        int nmrdivisores = 1;
        int numero;
        divisores = 1;
        nmrdivisores = 1;
        numero = sc.nextInt();

        while (divisores < numero) {
            divisores = divisores + 1;
            if (numero % divisores == 0) {
                nmrdivisores = nmrdivisores + 1;
            }

        }
        if (nmrdivisores <= 2) {
            System.out.println("primo");
        } else {
            System.out.println("nao e primo");
        }
    }
}

