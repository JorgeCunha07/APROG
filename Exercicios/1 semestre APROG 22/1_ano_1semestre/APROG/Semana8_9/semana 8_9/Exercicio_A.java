
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
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int alunos = sc.nextInt();
        double[] notas = new double[alunos];
        lerNotas(notas, alunos);
    }

    public static void lerNotas(double[] notas, int alunos) {
        int cont = 0;
        double media;
        double total = 0;

        for (int i = 0; i < alunos; i++) {
            notas[i] = sc.nextDouble();
            total = total + notas[i];
            if (notas[i] < 10) {
                cont++;
            }
        }
        media = (double) total / alunos;

        System.out.printf("media=%.1f\n", media);
        System.out.printf("reprovacoes=%d\n", cont);

    }

}
