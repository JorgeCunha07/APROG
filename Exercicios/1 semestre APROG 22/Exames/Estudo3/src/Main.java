import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    static final double JURO = 0.75;

        static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        double[][] arr = {{1000, 4}, {15500, 12}, {20000, 8}, {2575.5, 6}, {500, 2}};

        System.out.println("Investimento inicial: ");
        double investimentoMensal = ler.nextInt();
        System.out.println("Duração investimento (meses): ");
        int durabilidade = ler.nextInt();
        simularInvestimentoaJuro(investimentoMensal,durabilidade);
        String ficheiro = "simulacaoInvestimento.txt";
        double lucro = calcularLucro(ficheiro);
        System.out.println("Lucro sera: " + lucro);
        double lucroAcumulado = simulacoesLucroTotal(arr);
        System.out.println("Lucro acumulado : " + lucroAcumulado);

    }
    public static void simularInvestimentoaJuro(double investimentoMensal,int durabilidade) throws FileNotFoundException {
        PrintWriter escrever = new PrintWriter(new File("simulacaoInvestimento.txt"));
        escrever.printf("%-10s%-10s%-10s%-10s\n","Mês","Capital","Juro","Final");
        escrever.printf("---------|---------|---------|---------");
        for (int meses = 1; meses < durabilidade + 1; meses++) {
            double aux= investimentoMensal;
            double juroMES = aux * JURO;
            investimentoMensal += juroMES;
            escrever.printf("\n%-10d %-10.2f %-10.2f %-10.2f",meses,aux,juroMES,investimentoMensal);
        }
        escrever.close();
    }
    public static double calcularLucro(String ficheiro) throws NumberFormatException, FileNotFoundException {
        double lucro, valorInicial, valorFinal;
        String linha;

        Scanner sc = new Scanner(new File(ficheiro));
        sc.nextLine();
        sc.nextLine();
        linha = sc.nextLine();
        String[] itemsLinha = linha.split("\s+");
        valorInicial = Double.parseDouble(itemsLinha[1]);
        valorFinal = Double.parseDouble(itemsLinha[3]);

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            itemsLinha = linha.split("\s+");
            valorFinal = Double.parseDouble(itemsLinha[3]);
        }

        lucro = valorFinal - valorInicial;
        sc.close();
        return lucro;
    }
    public static double simulacoesLucroTotal(double [][] arr) throws FileNotFoundException {
        double lucroTotal = 0;
        double investimento;
        int meses;
        for (int i = 0; i < arr.length; i++) {
            investimento = arr[i][0];
            meses = (int) arr[i][1];
            simularInvestimentoaJuro(investimento,meses);
            String ficheiro = "simulacaoInvestimento.txt";
            lucroTotal += calcularLucro(ficheiro);
        }
    return lucroTotal;
    }

}