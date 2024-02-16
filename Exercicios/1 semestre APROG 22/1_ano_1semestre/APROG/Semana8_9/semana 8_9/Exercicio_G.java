
import java.util.Arrays;
import java.util.Scanner;
import java.util.Formatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tiago Alves
 */
public class Exercicio_G {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static Formatter output = new Formatter(System.out);

    public static void main(String[] args) {
        //Input do numElem
        int num = sc.nextInt();

        //Input do Vetor Inicial
        int[] seqInicial = seqInicial(num);

        //Inversão do Vetor Inicial
        int[] seqInvertido = inverterSeq(seqInicial, num);

        seqFinal(seqInvertido, num);

    }

    public static int[] seqInicial(int num) {
        int[] sequencia = new int[num];

        //Introdução dos valores no array
        for (int i = 0; i < num; i++) {

            sequencia[i] = sc.nextInt();
        }

        return sequencia;
    }

    public static int[] inverterSeq(int[] seqInicial, int num) {
        int[] seqInvertido = new int[num];

        //Copia "inversamente" os valores da primeira matriz para a segunda
        for (int i = 0; i < num; i++) {
            seqInvertido[num - i - 1] = seqInicial[i];
        }

        return seqInvertido;
    }

    public static void seqFinal(int[] vetor, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(vetor[i]);
        }

    }
}
