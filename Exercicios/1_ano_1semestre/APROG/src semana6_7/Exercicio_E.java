
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
     * @param args the command line arguments
     */
   public static int digitosComuns(int n1, int n2) {
        int dig1, dig2, cont = 0;

        while (n1 != 0 && n2 != 0) {
            dig1 = n1 % 10;
            dig2 = n2 % 10;
            if (dig1 == dig2) {
                cont++;
            }
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        return cont;
   }

    //qt = quantidade
    //cont= contador
    //contmax = contador maximo
    public static void main(String[] Args) {
        int cont = 0;
        int par1 = 0;
        int par2 = 0;
        int N;
        int contMax = 0;
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        do {
            
            N = sc.nextInt();

        } while (N <= 0);

        for (int i = 1; i <= N; i++) {

            do {
              
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            } while (num1 <= 0 || num2 <= 0);
            cont = digitosComuns(num1, num2);
            if (i == 1) {
                contMax = cont;
                par1 = num1;
                par2 = num2;
            } else if (cont >= contMax) {
                contMax = cont;
                par1 = num1;
                par2 = num2;
            }

        }
        if (contMax == 0) {
            System.out.println("sem resultados");
        } else {
            System.out.println(par1 + "/" + par2 + "");
        }

    }

}