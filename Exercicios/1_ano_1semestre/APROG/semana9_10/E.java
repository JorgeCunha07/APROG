import java.util.Locale;
import java.util.Scanner;

public class E {
    public static final int MAX = 20;
    static Scanner ler = new Scanner(System.in).useLocale(Locale.US);

    public static int lerNomesVencimentos(String[] nome, float[] vencimento) {
        int i = 0;
        nome[i] = ler.next();
        while (!nome[i].equals("fim")) {
            vencimento[i] = ler.nextFloat();
            i++;
            nome[i] = ler.next();
        }
        return i;
    }

    public static double fazerMediaSalario(float[] vencimento, int n) {
        float soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vencimento[i];
        }
        soma /= n;
        return soma;
    }

    public static void verificarAbaixoMedia(String[] nome, float[] vencimento, double mediaSalarios, int n) {
        for (int i = 0; i < n; i++) {
            if (vencimento[i] < mediaSalarios) {
                System.out.println(nome[i]);
            }
        }
    }

    public static void main(String[] args) {
        ler.useLocale(Locale.US);
        String[] nome = new String[MAX];
        float[] vencimento = new float[MAX];
        int n = lerNomesVencimentos(nome, vencimento);
        double mediaSalarios = fazerMediaSalario(vencimento, n);
        System.out.printf(Locale.US, "%.1f\n", mediaSalarios);
        verificarAbaixoMedia(nome, vencimento, mediaSalarios, n);
    }
}
