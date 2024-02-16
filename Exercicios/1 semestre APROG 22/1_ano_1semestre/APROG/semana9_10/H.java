import java.util.Scanner;

public class H {
    static Scanner ler = new Scanner(System.in);

    public static int lerNumero() {
        int n;
        do { n = ler.nextInt();
        } while (n <= 0);
        return n;
    }
    public static void gravarArray(int[] sequencia) {
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = ler.nextInt(); }
    }

    public static void alterarOrdemArray(int[] sequencia) {
        String direcao;
        direcao = ler.next();
        while (!direcao.equals("sair")) {
            switch (direcao) {
                case "esquerda":
                    rodarEsquerda(sequencia);
                    soutPRINT(sequencia);
                    break;
                case "direita":
                    rodarDireita(sequencia);
                    soutPRINT(sequencia);
                    break;
            }
            direcao = ler.next();
        }
    }
    public static void rodarEsquerda(int[] sequencia){
        int n = sequencia.length;
        int aux = sequencia[0];
        for (int i = 0; i < n - 1; i++) {
            sequencia[i] = sequencia[i + 1];
        }
        sequencia[n - 1] = aux;
    }
    public static void rodarDireita(int[] sequencia){
        int n = sequencia.length;
        int aux = sequencia[n - 1];
        for (int i = n - 1; i > 0; i--) {
            sequencia[i] = sequencia[i - 1];
        }
        sequencia[0] = aux;
    }
    public static void soutPRINT(int[] sequencia){
        for (int i = 0; i < sequencia.length; i++) {
            System.out.printf("[%d]",sequencia[i]);
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int n = lerNumero();
        int[] sequencia = new int[n];
        gravarArray(sequencia);
        alterarOrdemArray(sequencia);
    }
}
