import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    //vencimento normal;vencimento horas extras Semanais * 1,1; vencimento horas extras FimDeSemana *1,2
    /*
    Ficheiro que guarda em cada mes 1.txt;
     145678987*12*5 */

    private static final int MAX_COLABORADORES = 7;
    private static final int MESES = 12;
    private static final int OPCAO= 3;
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        String nomeFicheiro = ler.next();
        String[][] colaboradores = new String[MAX_COLABORADORES][OPCAO];

        int nColaboradores = carregarInfoColaboradores(nomeFicheiro, colaboradores);

        Double[][] remuneracoes = new Double[nColaboradores][MESES];
        criarRemuneracoes(remuneracoes, colaboradores);

        nomeFicheiro = ler.next();

        atualizarRemuneracoes(nColaboradores, nomeFicheiro, colaboradores, remuneracoes);
        ordenarInfoDecrescenteDoVencimentoAnual(remuneracoes, colaboradores,nColaboradores);

        System.out.println(Arrays.deepToString(remuneracoes));
        System.out.println(Arrays.deepToString(colaboradores));
    }
    public static void atualizarRemuneracoes(int numeroColaboradores,String Ficheiro,String[][] colaboradores,Double[][] renumeracoes) throws FileNotFoundException {
        Scanner lerFicheiro = new Scanner(new File(Ficheiro));
        int mes = Integer.parseInt(Ficheiro.split("\\.")[0]);
        double vencimentoBase , extraSemana , extraFimDeSemana;

        while (lerFicheiro.hasNextLine()){

            String[] linha = lerFicheiro.nextLine().split("\\*");
            int colaborador = procurarColaborador(linha[0], colaboradores, numeroColaboradores);
            if(colaborador != -1) {

                vencimentoBase = Double.parseDouble(colaboradores[colaborador][2]);

                for(int j = 0; j < renumeracoes[0].length; j++) {
                    if(mes == j + 1) {
                        extraSemana = Double.parseDouble(linha[1]);
                        extraFimDeSemana = Double.parseDouble(linha[2]);
                        renumeracoes[colaborador][j] += (extraSemana * (vencimentoBase * 0.10)) + (extraFimDeSemana * (vencimentoBase * 0.20));
                    }
            }
        }
    }
        }

    public static void ordenarInfoDecrescenteDoVencimentoAnual(Double[][] remuneracoes, String[][] colaboradores,int nColoboradores) {

        for (int i = 0; i < nColoboradores - 1; i++) {
            for (int j = i + 1; j < nColoboradores; j++) {
                double soma1 = 0,soma2 = 0;
                for (int k = 0; k < remuneracoes[0].length; k++) {
                    soma1 += remuneracoes[i][k];
                    soma2 += remuneracoes[j][k];
                }
                if(soma2 > soma1) {
                    Double[] auxRemuneracoes = remuneracoes[i];
                    String[] auxColaboradores = colaboradores[i];
                    remuneracoes[i] = remuneracoes[j];
                    colaboradores[i] = colaboradores[j];
                    remuneracoes[j] = auxRemuneracoes;
                    colaboradores[j] = auxColaboradores;
                }
            }
        }
    }


    private static int carregarInfoColaboradores (String nomeFicheiro,String[][] colaboradores) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(nomeFicheiro));
        int linha = 0;

        while(ficheiro.hasNextLine()) {
            String[] linhaFicheiro = ficheiro.nextLine().split(";");

            for(int i = 0; i < colaboradores[0].length; i++) {
                colaboradores[linha][i] = linhaFicheiro[i];
            }

            linha++;
        }

        return linha;
    }

    private static int procurarColaborador(String nif, String[][] colaboradores, int nColaboradores ) {
        int posicao = -1;
        for(int i = 0; i < nColaboradores; i++) {
            if(colaboradores[i][0].equals(nif))
                posicao = i;
        }
        return posicao;
    }

    public static void criarRemuneracoes(Double[][] remuneracoes, String[][] colaboradores) {
        for(int i = 0; i < remuneracoes.length; i++) {
            for(int j = 0; j < remuneracoes[0].length; j++) {
                remuneracoes[i][j] = Double.parseDouble(colaboradores[i][2]);
            }
        }
    }


    private static void listagem(Formatter out, String[][] colaboradores, int nColaboradores , double[][] remuneracores) {
        /*lista para o periférico associado ao objeto out toda a informação dos colaboradores e respetivas remunerações auferidas de forma discriminada
         */
    }


}



