import java.util.Scanner;

public class I {
    static Scanner ler = new Scanner(System.in);

    public static void leitura(String[][] nomes) {
        for (int i = 0; i < nomes[0].length; i++) {
            for (int a = 0; a < nomes.length; a++) {
                nomes[a][i] = ler.nextLine();
            }
        }
    }

    public static void checkNomes(String[][] nomes) {
        String morador = ler.nextLine();
        boolean flag = false;
        for (int i = 0; i < nomes[0].length; i++) {
            for (int a = 0; a < nomes.length; a++) {
                if (nomes[a][i].equals(morador)) {
                    flag = true;
                    soutPRINT(nomes, a, i);
                }
            }
        }
        if (!flag) {
            System.out.println("Nao mora no predio");
        }
    }

    public static void soutPRINT(String[][] nomes, int a, int i) {
        System.out.println("nome=" + nomes[a][i]);
        System.out.println("entrada=" + i);
        System.out.println("piso=" + a);
    }

    public static void main(String[] args) {
        final int fil = 4;
        final int col = 3;
        String[][] nomes = new String[fil][col];
        leitura(nomes);
        checkNomes(nomes);
    }
}
