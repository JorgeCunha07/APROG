
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
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = Integer.parseInt(sc.nextLine()), i;
        int sequencia[] = new int[N];
        for (i = 0; i < N; i++) {
            arraySequencia(i, sequencia);
        }
        direitaOuEsquerda(sequencia, N);
    }

    static public int arraySequencia(int i, int sequencia[]) {
        sequencia[i] = Integer.parseInt(sc.nextLine());
        return sequencia[i];
    }

    static public void arrayDireita(int N, int sequencia[]) {
        int aux = sequencia[N - 1];
        for (int i = N - 1; i > 0; i--) {
            sequencia[i] = sequencia[i - 1];
        }
        sequencia[0] = aux;
        resultado(sequencia, N);
    }

    static public void arrayEsquerda(int N, int sequencia[]) {
        int aux = sequencia[0];
        for (int i = 0; i < N - 1; i++) {
            sequencia[i] = sequencia[i + 1];
        }
        sequencia[N - 1] = aux;
        resultado(sequencia, N);
    }

    static public void resultado(int sequencia[], int N) {
        for (int i = 0; i < N; i++) {
            System.out.printf("[%d]", sequencia[i]);
        }
        System.out.printf("\n");
    }

    static public void direitaOuEsquerda(int sequencia[], int N) {
        String x = "";
        do {
            x = sc.nextLine();
            if ("direita".equals(x)) {
                arrayDireita(N, sequencia);
            }
            if ("esquerda".equals(x)) {
                arrayEsquerda(N, sequencia);
            }
        } while (!"sair".equals(x));
    }
}
