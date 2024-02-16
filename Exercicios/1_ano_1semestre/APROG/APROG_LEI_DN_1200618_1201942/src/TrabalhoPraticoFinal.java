import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrabalhoPraticoFinal {
    static final int LADO_CUBO = 3;
    static final String FICHEIRO = "Ficheiro.txt";

    public static void main(String[] args) throws FileNotFoundException {
        int[][] terrenoInfo = lerMatriz();

        imprimirTerr(terrenoInfo);
        int nivelAgua = alterarNivelDeAgua(terrenoInfo);
        percTerrSub(terrenoInfo);
        variacaoDaAreaInundada(terrenoInfo, nivelAgua);
        volAgua(terrenoInfo);
        int maiorDistancia = inundarTodoTerreno(terrenoInfo);
        visualizarTerrenoInun(terrenoInfo, maiorDistancia);
        coordenadasCubo(terrenoInfo);
        caminhoSeco(terrenoInfo);
    }

    public static int[][] lerMatriz() throws FileNotFoundException {
        Scanner lerFicheiro = new Scanner(new File(FICHEIRO));
        String nome = lerFicheiro.nextLine();
        String dimensaoMatriz = lerFicheiro.nextLine();
        String[] parteDim = dimensaoMatriz.split(" ");

        int linhas = Integer.parseInt(parteDim[0]);
        int colunas = Integer.parseInt(parteDim[1]);

        int[][] terrenoInfo = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            //String line = lerFicheiro.nextLine();
            for (int j = 0; j < colunas; j++) {
                String line = lerFicheiro.next();
                terrenoInfo[i][j] = Integer.parseInt(line);
            }

        }
        return terrenoInfo;
    }

    public static void imprimirTerr(int[][] arr) {
        //imprime o arr de um terreno dado
        System.out.println("b)");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int alterarNivelDeAgua(int[][] arr) {
        //altera o mapa do terreno com uma alteraçao de -1m no nivel de agua
        int m = -1;

        System.out.println("c)");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arr[i][j] - (m);
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        return m;
    }

    public static void percTerrSub(int[][] arr) {
        //calcula a percentagem de terreno que se encontra submerso
        int somaNeg = 0, somaTotal = 0;
        double perc;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < 0) {
                    somaNeg++;
                }
                somaTotal++;
            }
        }
        perc = (double) somaNeg / somaTotal * 100;
        System.out.printf("d)\narea submersa: %.2f%%\n", perc);
    }

    public static void variacaoDaAreaInundada(int[][] terrenoInfo, int nivelAgua) {
        //calcula a variaçao da area inundada em m2
        int varm = 0;

        for (int i = 0; i < terrenoInfo.length; i++) {
            for (int j = 0; j < terrenoInfo[0].length; j++) {
                if (terrenoInfo[i][j] + nivelAgua < 0 && terrenoInfo[i][j] >= 0) {
                    varm -= 1;
                }
            }
        }
        System.out.println("e)\nvariacao da area inundada: " + varm + " m2");
    }


    public static void volAgua(int[][] arr) {
        //calcula o volume da agua existente no terreno
        int vol = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < 0) {
                    vol += (arr[i][j] * -1);
                }
            }
        }
        System.out.println("f)\nvolume de agua: " + vol + " m3");
    }

    public static int inundarTodoTerreno(int[][] arr) {
        //calcula a quantidade de agua necessaria para inundar o terreno
        int inc = 1, maiorDistancia = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > maiorDistancia) {
                    maiorDistancia = arr[i][j];
                }
            }
        }
        maiorDistancia = maiorDistancia + inc;
        System.out.println("g)\npara inundacao total, subir :" + maiorDistancia + " m");

        return maiorDistancia;
    }
    public static int[][] copiaArray(int[][] arr) {
        //copia a array original
        int[][] copia = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copia[i][j] = arr[i][j];
            }
        }
        return copia;
    }

    public static void visualizarTerrenoInun(int[][] arr, int num) {
        //imprime as alteraçoes da area inundada no terreno por incremento de 1m2
        int subidaAgua = 1, contArea = 0, cont = 1;
        int[][] copia = copiaArray(arr);

        System.out.println("h)\nsubida da agua (m) | area inundada (m2)\n------------------ | ------------------");

        while (cont <= num) {
            for (int i = 0; i < copia.length; i++) {
                for (int j = 0; j < copia[0].length; j++) {
                    copia[i][j]--;
                    if (copia[i][j] == -1) {
                        contArea++;
                    }
                }
            }
            imprimirLinhaTabela(subidaAgua, contArea);
            contArea = 0;
            subidaAgua++;
            cont++;
        }
    }

    public static void imprimirLinhaTabela(int subidaAgua, int contArea){

        if ((subidaAgua >= 10) && (contArea >= 10)) {
            System.out.println("----------------" + subidaAgua + " | ----------------" + contArea);
        } else if (subidaAgua >= 10) {
            System.out.println("----------------" + subidaAgua + " | -----------------" + contArea);
        } else if (contArea >= 10) {
            System.out.println("-----------------" + subidaAgua + " | ----------------" + contArea);
        } else {
            System.out.println("-----------------" + subidaAgua + " | -----------------" + contArea);
        }
    }


    public static void coordenadasCubo(int[][] arr) {
        //calcula o ponto (mais a norte e oeste) e a menor quantidade de terra a mobilizar para que caiba um dado cubo no terreno
        int linhasPossiveis = arr.length - LADO_CUBO;
        int colunasPossiveis = arr[0].length - LADO_CUBO;
        int somaArrCubo = (-1 * (int) Math.pow(LADO_CUBO, 3));
        int menorI = 0, menorJ = 0, menorValor = 999, qtdTerra, soma;

        if (arr.length >= LADO_CUBO && arr[0].length >= LADO_CUBO) {
            for (int i = 0; i <= linhasPossiveis; i++) {
                for (int j = 0; j <= colunasPossiveis; j++) {
                    soma = soma(i, j, arr);
                    qtdTerra = qtdTerraMobilizar(soma, somaArrCubo);
                    if (qtdTerra < menorValor) {
                        menorValor = qtdTerra;
                        menorI = i;
                        menorJ = j;
                    } else if (qtdTerra == menorValor) {
                        // guarda menor i e menor j se i for igual
                        if (i < menorI) {
                            menorI = i;
                        } else if (i == menorI) {
                            if (j < menorJ) {
                                menorJ = j;
                            }
                        }
                    }
                }
            }
            System.out.println("i)\ncoordenadas do cubo: (" + menorI + "," + menorJ + "), terra a mobilizar: " + menorValor + " m2");
        } else {
            System.out.println("i)\nImpossivel,Matriz inferior ao lado do cubo");
        }
    }

    public static void caminhoSeco(int[][] arr) {
        //calcula o caminho seco mais a este onde e possivel atravessar o terreno sem se molhar, iterando pelas colunas do arr
        int cont = 0, coluna = 0, colunaOeste = -1;

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] >= 0) {
                    cont++;
                }
                coluna = i;
            }
            if (cont == arr.length && coluna > colunaOeste) {
                colunaOeste = coluna;
            }
            cont = 0;
        }
        if (colunaOeste < 0) {
            System.out.println("j)\nnão há caminho seco na vertical");
        } else {
            System.out.println("j)\ncaminho seco na vertical na coluna (" + colunaOeste + ")");
        }
    }

    public static int soma(int linha, int coluna, int[][] arr) {
        // metodo auxiliar, calcula a soma dos pontos da arr onde cabe o cubo pretendido
        int soma = 0;

        for (int i = linha; i < linha + LADO_CUBO; i++) {
            for (int j = coluna; j < coluna + LADO_CUBO; j++) {
                soma += arr[i][j];
            }
        }
        return soma;
    }

    public static int qtdTerraMobilizar(int soma, int somaArrCubo) {
        // metodo auxiliar, calcula a qtd de terra a mobilizar para caber o cubo pretendido
        int qtdTerra;
        qtdTerra = (somaArrCubo - soma);

        if (qtdTerra < 0) {
            qtdTerra = qtdTerra * (-1);
        }
        return qtdTerra;
    }
}

