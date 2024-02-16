
import java.util.Arrays;
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
public class Exercicio_D {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int alunos[] = new int[200];
        notasAlunos(alunos, n);
        for (int i = 0; i <= 20; i++) {
            frequencias(alunos, n, i);
        }

    }

    private static int notasAlunos(int[] alunos, int n) {

        int i;
        for (i = 0; i < n; i++) {
            alunos[i] = sc.nextInt();
        }
        return alunos[i];

    }

    private static void frequencias(int[] alunos, int n, int i) {

        int x;
        int soma = 0;

        for (x = 0; x < n; x++) {
            if (alunos[x] == i) {
                soma++;
            }
        }
        System.out.println(i + " " + soma);

    }
}
