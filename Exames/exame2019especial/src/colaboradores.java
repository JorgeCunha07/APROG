import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class colaboradores {
    public static Scanner sc = new Scanner(System.in);
    public static int MAX_COLABORADORES = 7;
    public static int MESES = 12;

    public static void main(String[] args) throws FileNotFoundException {
        String nomeFicheiro = sc.next();
        String[][] colaboradores = new String[7][3];
        int nColaboradores = carregarInfoColaboradores(nomeFicheiro, colaboradores);

        double[][] remuneracoes = new double[nColaboradores][MESES];
        criarRemuneracoes(remuneracoes, colaboradores);

        nomeFicheiro = sc.next();

        atualizarRemuneracoes(nColaboradores, nomeFicheiro, colaboradores, remuneracoes);
        ordenarInfoDecrescenteDoVencimentoAnual(remuneracoes, colaboradores);

        System.out.println(Arrays.deepToString(remuneracoes));
        System.out.println(Arrays.deepToString(colaboradores));
    }

    public static void ordenarInfoDecrescenteDoVencimentoAnual(double[][] remuneracoes, String[][] colaboradores) {
        for(int i = 1; i < remuneracoes.length; i++) {
            int posicao = i;

            while(posicao > 0) {
                double soma1 = 0;
                double soma2 = 0;

                for(int j = 0; j < remuneracoes.length; j++) {
                    soma1 += remuneracoes[posicao-1][j];
                    soma2 += remuneracoes[posicao][j];
                }

                if(soma2 > soma1) {
                    double[] auxRemuneracoes = remuneracoes[posicao-1];
                    String[] auxColaboradores = colaboradores[posicao-1];

                    remuneracoes[posicao-1] = remuneracoes[posicao];
                    remuneracoes[posicao] = auxRemuneracoes;
                    colaboradores[posicao-1] = colaboradores[posicao];
                    colaboradores[posicao] = auxColaboradores;
                }

                posicao--;
            }
        }
    }

    public static void criarRemuneracoes(double[][] remuneracoes, String[][] colaboradores) {
        for(int i = 0; i < remuneracoes.length; i++) {
            for(int j = 0; j < remuneracoes[0].length; j++) {
                remuneracoes[i][j] = Double.parseDouble(colaboradores[i][2]);
            }
        }
    }

    private static void atualizarRemuneracoes(int nColaboradores, String nomeFicheiro, String[][] colaboradores, double[][] remuneracoes) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File(nomeFicheiro));
        int mes = Integer.parseInt(nomeFicheiro.split("\\.")[0]);
        double vencimentoBase;
        int extraSemana;
        int extraFimDeSemana;

        while(ficheiro.hasNextLine()) {
            String[] linha = ficheiro.nextLine().split("\\*");

            int colaborador = procurarColaborador(linha[0], colaboradores, nColaboradores);

            if(colaborador != -1) {
                vencimentoBase = Double.parseDouble(colaboradores[colaborador][2]);

                for(int j = 0; j < remuneracoes[0].length; j++) {
                    if(mes == j + 1) {
                        extraSemana = Integer.parseInt(linha[1]);
                        extraFimDeSemana = Integer.parseInt(linha[2]);

                        remuneracoes[colaborador][j] += (extraSemana * (vencimentoBase * 0.10)) + (extraFimDeSemana * (vencimentoBase * 0.20));
                    }
                }
            }
        }
    }

    private static int carregarInfoColaboradores(String nomeFicheiro, String[][] colaboradores) throws FileNotFoundException {
            /* Lê a informação dos colaboradores existentes no ficheiro nomeFicheiro e
            carrega-a numa matriz de Strings. Retorna o número de colaboradores válidos
            introduzidos. */

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
        /* Retorna um inteiro que representa a posição do colaborador na matriz de
        colaboradores caso ele exista ou -1 caso não exista
        */

        for(int i = 0; i < colaboradores.length; i++) {
            if(colaboradores[i][0].equals(nif))
                return i;
        }

        return -1;
    }

    private static void listagem(Formatter out, String[][] colaboradores, int nColaboradores, double[][] remuneracores) {
        /* lista para o periférico associado ao objeto out toda a informação dos
        colaboradores e respetivas remunerações auferidas de forma discriminada
        */
    }


}
