import java.util.Scanner;
import java.io.*;


public class Main {
    final static int MAX_PONTES = 10;
    final static int DIAS_MES = 30;
    static String FICHEIRO ="passagens.txt";

    // estou a considerar que estao por ordem os dias para cada ponte.
    public static void main(String[] args) throws FileNotFoundException {

        int[][] passagens = new int[MAX_PONTES][DIAS_MES];
        int pontesEstudo = lerPassagens(passagens);
        diaComMaisPassagens(passagens,pontesEstudo);
        diasIguais(passagens,pontesEstudo);

    }
    // nome_da_ponte;dia_do_mês;no_de_passagens

    public static int lerPassagens(int[][] passagens)throws FileNotFoundException{
        int pontesEstudo = 0,auxPonte = 0;
        boolean ponteExiste = false;
        Scanner lerFicheiro = new Scanner(new File(FICHEIRO));
        String [] nomePontes=new String [MAX_PONTES];
        String[] aux ;

        while(lerFicheiro.hasNextLine()){
            aux = lerFicheiro.nextLine().split(";");
            for (int i = 0; i <MAX_PONTES; i++) {
                if (nomePontes[i].equals(aux[0])) {
                auxPonte = i;
                ponteExiste = true;
                }
            }
            if (!ponteExiste){
                nomePontes[pontesEstudo] =aux[0];
                auxPonte = pontesEstudo;
                pontesEstudo++;
            }
            passagens[auxPonte][Integer.parseInt(aux[1])] = Integer.parseInt(aux[2]);

        }
        return pontesEstudo;
    }
    public static void diaComMaisPassagens(int[][] passagens,int pontesEstudo){
        int diaMPassagens = - 1;

        for (int i = 0; i <pontesEstudo ; i++) {
            for (int j = 0; j < DIAS_MES; j++) {
                if (passagens[i][j] > diaMPassagens){
                    diaMPassagens = passagens[i][j];
                }
            }
        }
        System.out.println("Dias com mais Passagens");
        for (int i = 0; i <pontesEstudo ; i++) {
            for (int j = 0; j < DIAS_MES; j++) {
                if (passagens[i][j] == diaMPassagens){
                    System.out.println("Na Ponte :" + (i+1) +"no dia:" + j +"passagens" + diaMPassagens);
                }
            }
        }
    }
    public static void diasIguais(int[][] passagens,int pontesEstudo){
        int diasIguais = 0;
        String diasRepetidos = "";

        for (int ponte = 0; ponte < pontesEstudo; ponte++) {
            for (int x = 0; x < DIAS_MES - 1; x++) {
                for (int i = x; i < DIAS_MES; i++) {
                    if (passagens[ponte][x] == passagens[ponte][i]){
                        diasIguais++;
                        diasRepetidos = String.valueOf(x);
                        diasRepetidos += " ";
                    }
                }
            }
            if (diasIguais > 0){
                System.out.println("Ponte"+ ponte + "contem " + diasIguais + "dias iguais nos dias" + diasRepetidos);
            }
        }

    }
}
