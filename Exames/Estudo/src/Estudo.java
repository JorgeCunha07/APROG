import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Estudo {
    static Scanner ler = new Scanner(System.in);
    static final int FILAS = 24;
    static final int LUGARES = 30;

    public static String nomeFicheiro() {

        return ler.next();
    }

    public static int[][] lerOcupacaoDaSala(String FICHEIRO) throws FileNotFoundException {
        int[][] ocupacaoEspetaculo = new int[FILAS][LUGARES];
        Scanner lerFicheiro = new Scanner(new File(FICHEIRO));

        while (lerFicheiro.hasNext()) {
            String linha = lerFicheiro.nextLine();
            String[] itensDaLinha = linha.split(";");
            int x = parseInt(itensDaLinha[0]);
            for (int i = 1; i < itensDaLinha.length; i++) {
                ocupacaoEspetaculo[x - 1][i - 1] = parseInt(itensDaLinha[i]);

            }
        }
        lerFicheiro.close();
        return ocupacaoEspetaculo;
    }

    public static int calcularBilheteira(int[][] ocupacaoEspetaculo) {
        int soma = 0;

        for (int filas = 0; filas < ocupacaoEspetaculo.length; filas++) {
            for (int lugares = 0; lugares < ocupacaoEspetaculo[0].length; lugares++) {
                if (filas < 8 & ocupacaoEspetaculo[filas][lugares] == 1) {
                    soma += 20;
                }
                if (filas < 16 & ocupacaoEspetaculo[filas][lugares] == 1) {
                    soma += 15;
                }
                if (filas > 15 & ocupacaoEspetaculo[filas][lugares] == 1) {
                    soma += 10;
                }
            }

        }
        return soma;
    }
// || (fila != 0 && lugar != ocupacaoEspetaculo[0].length - 1)
    public static int informarLugares(int[][] ocupacaoEspetaculo, int lugares) {
        int filaDeLugares = 0;
        int fila = ocupacaoEspetaculo.length - 1, lugar = 0;

        while (filaDeLugares != lugares &&  fila != -1 ) {
            if (lugar == ocupacaoEspetaculo[0].length - 1) {
                fila--;
                lugar = 0;
                filaDeLugares = 0;
            }
            if (ocupacaoEspetaculo[fila][lugar] == 0) {
                filaDeLugares += 1;
            } else {
                filaDeLugares = 0;
            }
            lugar++;
        }
        if (filaDeLugares != 0) {
            return fila + 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        String FICHEIRO = nomeFicheiro();
        int[][] ocupacaoEspetaculo = lerOcupacaoDaSala(FICHEIRO);
        System.out.println("Bilhetes: " +calcularBilheteira(ocupacaoEspetaculo ) + "$");
        int lugares = ler.nextInt();
        System.out.println("Fila: " + informarLugares(ocupacaoEspetaculo, lugares));
        System.out.println();
    }
}
