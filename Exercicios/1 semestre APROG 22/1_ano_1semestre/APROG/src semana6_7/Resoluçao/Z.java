import java.util.Scanner;

public class Z {

    static Scanner ler = new Scanner(System.in);

    public static int lerValorInteiroPositivo() {
        int nrInteiroPositivo;

        do {
            nrInteiroPositivo = ler.nextInt();
        } while (nrInteiroPositivo <= 0);
        return nrInteiroPositivo;
    }

    public static void intervaloPrimoTempoInteiro(int limINF, int limSUP) {
        int cout = 0;
        for (int i = limINF; i <= limSUP; i++) {
            if (mostrarPrimoTempoInteiro(i)) {
                cout++;
                System.out.println(i);
            }
        }
        System.out.println("(" + cout + ")");
    }

    public static boolean mostrarPrimoTempoInteiro(int limINF) {
        int alg = 0, copia;
        copia = limINF;
        do {
            alg++;
            copia /= 10;
        } while (copia != 0);

        copia = limINF;

        for (int i = 0; i < alg; i++) {

            copia = copia / 10 + (copia % 10) * (int) Math.pow(10, (alg - 1));
            if (!primo(copia)) {
                return false;
            }
        }
        return true;
    }

    public static boolean primo(int copia) {
        for (int i = 2; i < copia; i++) {
            if (copia % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int limINF, limSUP;

        limINF = lerValorInteiroPositivo();
        limSUP = lerValorInteiroPositivo();

        if (limINF > limSUP) {
            int aux = limSUP;
            limSUP = limINF;
            limINF = aux;
        }

        intervaloPrimoTempoInteiro(limINF, limSUP);
    }
}
