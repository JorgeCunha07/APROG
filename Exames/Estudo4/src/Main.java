import java.util.Scanner;
import java.io.*;

public class Main {

   static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException{
        String[][] alimentos = lertabelaDeAlimentos("alimentosCalorias.txt");
        String[] refeicao =new String[10];
        for (int i = 0; i <10; i++) {
            refeicao[i] = ler.nextLine();
        }
        int caloriasTotais =(int) calcularCaloriasDeRefeicao(refeicao,alimentos);
        gravarRefeicao(refeicao,caloriasTotais);
    }
    public static String [][] lertabelaDeAlimentos(String ficheiro) throws FileNotFoundException{
        int arr = 0,i = 0;
        Scanner lerlinhas = new Scanner(new File(ficheiro));
        while (lerlinhas.hasNextLine()){
            lerlinhas.nextLine();
            arr ++;
        }
        lerlinhas.close();

        String[][] alimentos =  new String[arr][4];
        Scanner lerficheiro = new Scanner(new File(ficheiro));
        while (lerficheiro.hasNextLine()){
            String[] aux = lerficheiro.nextLine().split(";");
            alimentos[i][0]= aux[0];
            alimentos[i][1]= aux[1];
            alimentos[i][2]= aux[2];
            alimentos[i][3]= aux[3];
            i++;
        }
        return alimentos;
    }

    public static double calcularCaloriasDeRefeicao(String [] refeicao,String [][] alimentos){
        double caloriasTotais = 0;
        String[][] refeicaoCalorias = new String[refeicao.length][2];
        for (int i = 0; i < refeicao.length; i++) {
            String[] aux = refeicao[i].split(";");
            refeicaoCalorias[i][0]= aux[0];
            refeicaoCalorias[i][1]= aux[1];
        }
        int contador ;
        for (int x = 0; x <refeicaoCalorias.length; x++) {
            contador = 0;
            while (!refeicaoCalorias[x][0].equals(alimentos[contador][0])){
                contador++;
            }
            double porcao,porcaoAli,calorias;
            porcao =Double.parseDouble(refeicaoCalorias[x][2]);
            porcaoAli =Double.parseDouble(alimentos[contador][3]);
            porcao = (porcao *100)/porcaoAli;
            calorias = Double.parseDouble(alimentos[contador][4]);
            caloriasTotais += porcao*calorias;
        }
        return caloriasTotais;
    }
    public static void gravarRefeicao(String[] vetorRefeicao  ,int caloriasTotais) throws FileNotFoundException {
        PrintWriter escrever = new PrintWriter(new File("refeicao.txt"));
        escrever.println("Alimento          Quantidade (g/ml)");
        escrever.println("=====================================");
        for (int i = 0; i < vetorRefeicao.length; i++) {
            escrever.println(vetorRefeicao[i]);
        }
        System.out.println("Total de calorias ingeridas:" + caloriasTotais );
    }

}
