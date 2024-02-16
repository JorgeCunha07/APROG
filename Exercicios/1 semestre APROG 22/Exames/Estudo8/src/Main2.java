import java.util.Scanner;
import java.io.*;

public class Main2 {
    final static int MAX_ALUNOS = 20;
    final static int DISCIPLINAS = 4;
    final static String FICHEIRO = "notas.txt";
    final static String FICHEIROGUARDAR = "resultados.txt";

    public static void main(String[] args)throws FileNotFoundException{
        String[][] matrizNotas = new String[MAX_ALUNOS][DISCIPLINAS];
        int alunos = lerNotasAlunos(matrizNotas);
        mediaaluno(matrizNotas,alunos);
        guardarFicheiro(matrizNotas,alunos);
    }
    public static int lerNotasAlunos(String[][] matrizNotas)throws FileNotFoundException{
        int alunosEstudo = 0;
        Scanner lerFicheiro =new Scanner(new File(FICHEIRO));
        String[] aux ;
        boolean isPerson = false;
        while(lerFicheiro.hasNextLine()){
            aux = lerFicheiro.nextLine().split(";");
            for (int i = 0; i < alunosEstudo; i++) {
                if (aux[0].equals(matrizNotas[i][0])){
                    matrizNotas[i][1] += "1 ";
                    matrizNotas[i][2] += " " + aux[2];
                    isPerson = true;
                    break; //-> Usei o break para usar menos memoria e ser mais rapido.
                }
            }

            if(!isPerson){
                if(matrizNotas[alunosEstudo][1] == null) {
                    matrizNotas[alunosEstudo][1] = " ";
                    matrizNotas[alunosEstudo][2] = " ";
                }
                matrizNotas[alunosEstudo][0] = aux[0];
                matrizNotas[alunosEstudo][1] += "1 ";
                matrizNotas[alunosEstudo][2] += aux[2] ;
                alunosEstudo++;
            }
            isPerson = false;
        }
        lerFicheiro.close();
        return alunosEstudo ;
    }
    public static void mediaaluno(String[][] matrizNotas,int alunosEstudo){
        double media,notas,cadeiras;
        for (int i = 0; i <alunosEstudo ; i++) {
            notas = 0;
            cadeiras = 0;
            String[] contagem = matrizNotas[i][1].split(" ");
            for (int j = 1; j < contagem.length; j++) {
                cadeiras += Double.parseDouble(contagem[j]);
            }
            String[] notasContagem = matrizNotas[i][2].split(" ");
            for (int j = 1; j < contagem.length; j++) {
                notas += Double.parseDouble(notasContagem[j]);
            }
            media = notas / cadeiras;
            matrizNotas[i][3] = String.valueOf(media);
        }
    }
    public static void guardarFicheiro(String[][] matrizNotas,int alunosEstudo) throws FileNotFoundException {
        PrintWriter escrever = new PrintWriter(new File(FICHEIROGUARDAR));
        for (int i = 0; i < alunosEstudo; i++) {
            escrever.println(matrizNotas[i][0] + ";" + matrizNotas[i][3]);}
        escrever.flush();
        escrever.close();
    }

}
