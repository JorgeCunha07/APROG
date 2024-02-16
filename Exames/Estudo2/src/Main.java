import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    static int LINHAS = 7;
    static int HORA = 24;
    static Scanner ler = new Scanner(System.in);

    public static double[][] lerTemperaturasDoFicheiro(String FICHEIRO) throws FileNotFoundException{

        double[][] tempSaladeAula = new double[LINHAS][HORA];
        Scanner lerFicheiro = new Scanner(new File(FICHEIRO));
        int x = 0;
        while(lerFicheiro.hasNext()){
            String dia = lerFicheiro.nextLine();
            String[] tempsdoDia = dia.split(" ");

            for (int i = 0; i < tempsdoDia.length; i++) {
                tempSaladeAula[x][i] = Double.parseDouble((tempsdoDia[i]));
            }
            x++;
        }
        lerFicheiro.close();
        return  tempSaladeAula;
    }

    public static int ligacoesDoAquecimentoNoDia(double [][] temSaladeAula,int dia){
        int onAquecimento = 0;
        int offAquecimento = 0;

        for (int i = 1; i < temSaladeAula[dia].length  ; i++) {
            if(i >=7 && i <=17 ){
                if(temSaladeAula[dia][i] > 20 && onAquecimento > 0){
                    offAquecimento += 1;
                }
                if(temSaladeAula[dia][i] < 10){
                if(temSaladeAula[dia][i-1] > 10 & offAquecimento == 0 )
                   onAquecimento += 1;
                    offAquecimento =0;
                }

            }
        }
        return onAquecimento;
    }
    public static boolean [] sugestaoParaLigarAquecimentoAsHoras(double [][] temSaladeAula){
        boolean [] aquecimentoRegulador = new boolean[temSaladeAula[0].length];

        for (int i = 0; i < temSaladeAula[0].length ; i++) {
            int contador = 0;

            for (int j = 0; j < temSaladeAula.length; j++) {
                if(temSaladeAula[j][i] < 10){
                    contador++ ;
                }
            }
            if (contador == temSaladeAula[0].length){
                aquecimentoRegulador[i] = true;
            }
            else {
                aquecimentoRegulador[i]=false;
            }
        }

        return aquecimentoRegulador;
    }

    public static void main(String[] args) throws FileNotFoundException{

        String FICHEIRO = "temperaturasSemanaXX.txt";
        double[][] tempSaladeAula = lerTemperaturasDoFicheiro(FICHEIRO);
        int diaSemanal = ler.nextInt();
        int aquecimentoONREPS = ligacoesDoAquecimentoNoDia(tempSaladeAula,diaSemanal);
        System.out.println("O aquecimento foi ligado: " + aquecimentoONREPS + "vezes.");
        boolean [] aquecimentoRegulador = sugestaoParaLigarAquecimentoAsHoras(tempSaladeAula);
        for (int x = 0; x < aquecimentoRegulador.length; x++) {
            System.out.print(aquecimentoRegulador[x]);
        }
    }
}