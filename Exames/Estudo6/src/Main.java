import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    private static final int MAX_APOSTAS = 5;
    private static final int N_NUMEROS = 5;
    private static final int N_ESTRELAS = 2;
    static Scanner ler = new Scanner(System.in);

    private static void mostrarApostas(int[][] apostas, int nApostas) {

    }

    public static void ordenarAposta(int[] aposta) {
        int first = aposta[N_NUMEROS];
        int secondEstrelas = aposta[N_NUMEROS + 1];

        for (int i = 0; i < N_NUMEROS; i++) {
            // k must bigger than i, if i bigger than k , sorting order is Chaos...
            for (int k = i+1; k < N_NUMEROS; k++) {
                if (aposta[k] < aposta[i]) {
                    int temp =aposta[k];
                    int temp2 = aposta[i];
                    aposta[k] = temp2;
                    aposta[i] = temp;
                }
            }
        }

        if (first > secondEstrelas) {
            aposta[N_NUMEROS] = secondEstrelas;
            aposta[N_NUMEROS + 1] = first;
        }
    }

    public static void main(String[] args)throws FileNotFoundException {
        int[][] apostas = new int[MAX_APOSTAS][N_ESTRELAS + N_NUMEROS];
        String ficheiro = ler.next();
        int nApostas = lerApostas(ficheiro, apostas);
        System.out.println(nApostas);
    }

    public static boolean apostaValida(int[] aposta){
        boolean validade = true ;
        if (aposta.length == N_ESTRELAS+ N_NUMEROS){
            // validate numeros
            for (int i = 0; i < N_NUMEROS; i++) {
                if(aposta[i]> 50 || aposta[i] < 1){
                    validade = false;
                }
            }

            //validate ESTRELAS
            for (int j = N_NUMEROS; j <N_NUMEROS + N_ESTRELAS ; j++) {
                if(aposta[j]> 12 || aposta[j] < 1){
                    validade = false;
                }
            }
            int prev = -1;
            // validate repeating
            for (int t = 0; t < N_NUMEROS + N_ESTRELAS; t++) {
                if (prev == aposta[t]) {
                    return false;
                }
                prev = aposta[t];
            }
        }
        else
            validade = false;

        return validade;
    }
    public static int lerApostas(String ficheiro,int[][] apostas)throws FileNotFoundException {
        Scanner lerFicheiro = new Scanner(new File(ficheiro));
        int apostasValidas = 0;
        lerFicheiro.nextLine(); // the first line we dont use because its the date

        for (int i = 0; i < MAX_APOSTAS; i++) {
            if(!lerFicheiro.hasNext()){
                break;
            }
            String line = lerFicheiro.nextLine();
            line = line.replace("+ ", "");
            String[] aux = line.split(" ");
            if (aux.length  == N_NUMEROS + N_ESTRELAS) {
                for (int j = 0; j < aux.length; j++) {
                    apostas[i][j] = Integer.parseInt(aux[j]);
                }
            }

        }
        for (int i = 0; i <apostas.length; i++) {
            ordenarAposta(apostas[i]);
        }

//        int[] aposta = new int[N_ESTRELAS+N_NUMEROS];
        for (int j = 0; j < apostas.length; j++) {
            if(apostaValida(apostas[j])){
                for (int s = 0; s < apostas[j].length; s++) {
                    System.out.print(apostas[j][s] + " ");
                }
                System.out.println("");
                apostasValidas += 1;
            }
        }
        return apostasValidas;
    }
}
