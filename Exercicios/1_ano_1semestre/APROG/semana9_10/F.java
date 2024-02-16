import java.util.Locale;
import java.util.Scanner;

public class F {
    public static final int JURO = 6;
    static Scanner ler = new Scanner(System.in);

    public static void lerTaxasJuros(double[] juroAcrescido) {
        for (int i = 0; i < juroAcrescido.length; i++) {
            juroAcrescido[i] = ler.nextDouble();
        }
    }

    public static double calcularJuros(float depositoInicial, double[] juroAcrescido) {
        double resultadoFinal = depositoInicial;
        for (double v : juroAcrescido) {
            resultadoFinal = resultadoFinal * (1 + v);
        }
        return resultadoFinal;
    }

    public static void main(String[] args) {
        ler.useLocale(Locale.US);
        double[] juroAcrescido = new double[JURO];
        lerTaxasJuros(juroAcrescido);

        float depositoInicial = ler.nextFloat();
        double resultadoFinal = calcularJuros(depositoInicial, juroAcrescido);
        System.out.printf(Locale.US, "valor final=%.2f\n", resultadoFinal);
    }
}
