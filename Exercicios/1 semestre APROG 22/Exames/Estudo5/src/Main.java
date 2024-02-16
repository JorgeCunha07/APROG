import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    final static String FICHEIRO = "resultados.txt";
    private static final int N_EQUIPAS = 4;
    static Scanner ler = new Scanner(System.in);

    private static String[] iniciarEquipas(String nomeFicheiro) throws FileNotFoundException {
            Scanner lerficheiro = new Scanner(new File(nomeFicheiro));
            String[] iniciarEquipas = new String[N_EQUIPAS];
            int i = 0;
            while(lerficheiro.hasNext()){
                iniciarEquipas[i]= lerficheiro.next();
                i++;
            }
            lerficheiro.close();
            return iniciarEquipas;
    }
    private static int[][] iniciarPontuacoes(){

        return new int[N_EQUIPAS][3];
    }

    private static int procurarEquipa(String nomeEquipa, String[] equipas ) {
        int posicao = 0;
        for (int i = 0; i < equipas.length; i++) {
            if(nomeEquipa.equals(equipas[i]))
                posicao = i;
        }
        return posicao;
    }

    private static void guardarInfoEmFicheiro (String nomeFich, String[] equipas, int[][] pontuacao ) throws FileNotFoundException {
    PrintWriter escreverFicheiro = new PrintWriter(nomeFich);

        for (int i = 0; i < equipas.length; i++) {
            escreverFicheiro.printf("%s ",equipas[i]);
            for (int j = 0; j < pontuacao[0].length; j++) {
                escreverFicheiro.printf("%d ",pontuacao[i][j]);
            }
            escreverFicheiro.println();
        }
    }


    public static void atualizarPontuacoes(String nomeFich,String[] equipas,int[][] pontuacao) throws FileNotFoundException{

        Scanner lerFicheiro = new Scanner(new File(nomeFich));
        while(lerFicheiro.hasNextLine()){
            String[] aux = lerFicheiro.nextLine().split(" - ");
            if(aux.length == 4  &&  -1 != procurarEquipa(aux[0],equipas) &&  -1 != procurarEquipa(aux[1],equipas)){
                int i = procurarEquipa(aux[0],equipas);
                int b = procurarEquipa(aux[1],equipas);
            if(Integer.parseInt(aux[2]) > Integer.parseInt(aux[3])){
                pontuacao[i][0]+=3;
                pontuacao[i][1] = Integer.parseInt(aux[2]);
                pontuacao[i][2] = Integer.parseInt(aux[3]);

                pontuacao[b][0]+=0;
                pontuacao[b][1] = Integer.parseInt(aux[3]);
                pontuacao[b][2] = Integer.parseInt(aux[2]);

            }else if(Integer.parseInt(aux[2]) == Integer.parseInt(aux[3])){

                pontuacao[i][0]+=1;
                pontuacao[i][1] = Integer.parseInt(aux[2]);
                pontuacao[i][2] = Integer.parseInt(aux[3]);

                pontuacao[b][0]+=1;
                pontuacao[b][1] = Integer.parseInt(aux[3]);
                pontuacao[b][2] = Integer.parseInt(aux[2]);
            }else {
                pontuacao[i][0]+=0;
                pontuacao[i][1] = Integer.parseInt(aux[2]);
                pontuacao[i][2] = Integer.parseInt(aux[3]);

                pontuacao[b][0]+=3;
                pontuacao[b][1] = Integer.parseInt(aux[3]);
                pontuacao[b][2] = Integer.parseInt(aux[2]);
                }
            }
        }

        }
        public static double ordenarInfoOrdemDescrescente (String[] equipas, int[][] pontuacao){
        double pontuacaomedia = 0;

            for (int x = 0; x < pontuacao.length ; x++) {
                pontuacaomedia += pontuacao [x][0];
            }
            pontuacaomedia = pontuacaomedia / pontuacao.length;

            for (int i = 0; i < pontuacao.length; i++) {
                    for (int k = i + 1; k < pontuacao.length; k++) {
                        if (pontuacao[i][0] < pontuacao[k][0]) {
                            trocaArraysMenorMaior(pontuacao,i,k,equipas);
                        } else if (pontuacao[i][0] == pontuacao[k][0]) {
                            if (pontuacao[i][1] > pontuacao[k][1]) {
                                trocaArraysMenorMaior(pontuacao,k,i,equipas);
                            }else {
                                trocaArraysMenorMaior(pontuacao,i,k,equipas);
                            }
                        }
                    }
                }
        return pontuacaomedia;
    }
    public static void trocaArraysMenorMaior(int[][] pontuacao,int i,int k,String[] equipas ){
        int[] aux = new int[3];
        aux[0] = pontuacao[i][0];
        aux[1] = pontuacao[i][1];
        aux[2] = pontuacao[i][2];
        pontuacao[i][0] = pontuacao[k][0];
        pontuacao[i][1] = pontuacao[k][0];
        pontuacao[i][2] = pontuacao[k][0];
        pontuacao[k][0] = aux[0];
        pontuacao[k][1] = aux[1];
        pontuacao[k][2] = aux[2];
        String auxnome = equipas[i];
        equipas[i] = equipas[k];
        equipas[k] = auxnome;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String ficheiro = ler.next();
        String[] equipas = iniciarEquipas(ficheiro);
        int [][] pontuacao = iniciarPontuacoes();
        atualizarPontuacoes(FICHEIRO,equipas,pontuacao);
        double mediaDasEquipas = ordenarInfoOrdemDescrescente(equipas,pontuacao);
        String nomeFich = ler.next();
        guardarInfoEmFicheiro (nomeFich,equipas,pontuacao);
        System.out.println("A pontuação média das equipas é :" + mediaDasEquipas);

    }
}
