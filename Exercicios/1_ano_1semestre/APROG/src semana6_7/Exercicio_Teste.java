
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
public class Exercicio_Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int ano;
        int maiorAno = 9999999;
        int cont = 0;

        num = sc.nextInt();

        while (num < 9999999 && num > 1000000) {

            ano = num / 1000;
           

            if (ano < maiorAno) {
                
                maiorAno = ano;
                cont = 0;

            }
            if (ano == maiorAno) {
                cont++;
            }
            num = sc.nextInt();

        }
        System.out.println(maiorAno);
        System.out.println(cont);

    }
}
