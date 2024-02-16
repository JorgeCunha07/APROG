
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
public class Exercicio_A {

    /**
     * PALINDROME
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, verf;
        verf = 0;
        String pal;
        String pal1;

        do {
            pal = sc.nextLine();
            cont++;
        } while (verificacaopalavra(pal) == false);
        System.out.println((cont - 1));
    }

    public static boolean verificacaopalavra(String palavra) {
        int i, j;
        palavra = palavra.toLowerCase();
        i = 0;
        j = palavra.length() - 1;
        while (i < j && palavra.charAt(i) == palavra.charAt(j)) {
            i++;
            j--;
        }
        return i >= j;
    }
}
