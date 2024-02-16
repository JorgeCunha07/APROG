import java.util.Scanner;
import java.io.*;


public class Main {
    static Scanner ler = new Scanner(System.in);
    final static int MULTIPLO = 3;
    public static void main(String[] args) {
	int i = ler.nextInt();
    int j = ler.nextInt();
    int [][] matrizfeita = lerMatriz(i,j);
    int [][] matrizarranjada = new int[i][j];
    extrairLinhasMesmaSoma(matrizfeita, ler.nextInt(), matrizarranjada);
    escreverMatriz(matrizarranjada,i,j);
    ordenarMatriz(matrizarranjada,MULTIPLO);
    escreverMatriz(matrizarranjada,i,j);


    }
    public static int[][] lerMatriz (int i, int j) {
        int [][] matrizfeita = new int[i][j];
        /* Cria, preenche e retorna uma matriz de números inteiros com i linhas e j colunas */
    return matrizfeita;
    }
    public static void escreverMatriz (int [][]mat, int n, int m) {
        /* Escreve para o ecrã os n * m elementos de mat*/
    }

    public static int quantidadeDeMultiplos(int[] arrInteiros,int multiploPoss){
        int multiplosContagem = 0;

        for (int i = 0; i < arrInteiros.length; i++) {
            if(arrInteiros[i] % multiploPoss == 0){
                multiplosContagem++;
            }
        }
        return multiplosContagem;
    }
    public static int extrairLinhasMesmaSoma(int[][] matrizInteiroPrimeiro ,int valorInteiro ,int[][] matrizInteiroSegunda ){
        int linhapar = 0,linhaNovaMatriz = 0;
        for (int i = 0; i <matrizInteiroPrimeiro.length ; i++) {
            for (int j = 0; j < matrizInteiroPrimeiro[0].length; j++) {
                if(matrizInteiroPrimeiro[i][j] == valorInteiro){
                    linhapar++;
                }
                if (linhapar > 0 && linhapar % 2 == 0){
                    for (int k = 0; k < matrizInteiroSegunda[0].length; k++) {
                        matrizInteiroSegunda[linhaNovaMatriz][k] = matrizInteiroPrimeiro[i][k];
                        linhaNovaMatriz++;
                    }
                }
            }
        }
        return linhaNovaMatriz + 1;
    }

    public static int [][] ordenarMatriz(int[][] matrizInteiro,int n){
        int [][] matrizOrganizada = new int[matrizInteiro.length][matrizInteiro[0].length];
        for (int i = 0; i < matrizInteiro.length -1; i++) {
            for (int j = 1; j < matrizInteiro.length ; j++) {
                if (quantidadeDeMultiplos(matrizInteiro[i],n) >= quantidadeDeMultiplos(matrizInteiro[j],n)){
                    for (int k = 0; k < matrizInteiro[0].length ; k++) {
                        matrizOrganizada[i][k] = matrizInteiro[j][k];
                        matrizOrganizada[j][k] = matrizInteiro[i][k];
                    }
                }
            }
        }
        return matrizOrganizada;
    }
}
