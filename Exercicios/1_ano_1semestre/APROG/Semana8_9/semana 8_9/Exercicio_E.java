
import java.util.Formatter;
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
public class Exercicio_E {

    static Formatter out = new Formatter(System.out);
    static Scanner in = new Scanner(System.in);
    static final int NUM = 20;

    /**
     * Lista os funcionários com vencimentos inferiores à média
     *
     * @param nome[] Vector String com o nome dos funcionários
     * @param venc[] Vector double com os vencimentos dos funcionários
     * @param nFunc número de funcionarios lidos
     */
    public static void listaInferiores(String nome[], double venc[], int nFunc) {
        double s = 0;

        for (int i = 0; i < nFunc; i++) {
            s += venc[i];
        }

        if (nFunc != 0) {
            double med = s / nFunc;
              
              System.out.println(med);
//            out.format("%.1f\n", med);

            for (int i = 0; i < nFunc; i++) {
                if (venc[i] < med) {
                    out.format("%s\n", nome[i], i + 1);
                }
            }

        }

    }

    public static void main(String[] args) {
        String nomes[] = new String[NUM];
        double venc[] = new double[NUM];
        int nFunc = 0;
        String inserido;

        do {
            out.format("", nFunc + 1);
            inserido = in.nextLine();
            if (!inserido.equalsIgnoreCase("fim")) {
                nomes[nFunc] = inserido;
                out.format("", nomes[nFunc], nFunc + 1);
                venc[nFunc] = in.nextDouble();
                in.nextLine();
                nFunc++;
            }
        } while ((!inserido.equalsIgnoreCase("fim")) && (nFunc < nomes.length));

        listaInferiores(nomes, venc, nFunc);
    }
}
