
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
public class Exercicio_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalAlunos;
        int totalDisciplinas;

        String disciplinaNome;
        int disciplinaAprovados;

        String impressao;

        Scanner sc = new Scanner(System.in);

        do {
            totalAlunos = sc.nextInt();
        } while (totalAlunos <= 0);

        do {
            
            totalDisciplinas = sc.nextInt();
            
        } while (totalDisciplinas <= 0);

        for (int i = 1; i <= totalDisciplinas; i++) {

            disciplinaNome = sc.next();

            do {

                disciplinaAprovados = sc.nextInt();
            } while (disciplinaAprovados > totalAlunos);

            impressao = imprimirInfoDisciplina(disciplinaNome, totalAlunos, disciplinaAprovados);
            System.out.println(impressao);

        }

    }

    public static String imprimirInfoDisciplina(String nome, int alunosTotal, int alunosAprovados) {

        String positivas = "";
        String negativas = "";
        String retorno;

        for (int i = 1; i <= alunosAprovados; i++) {
            positivas += "*";
        }
        for (int i = 1; i <= (alunosTotal - alunosAprovados); i++) {
            negativas += "*";
        }

        retorno = "Disciplina: " + nome + "\n- Positivas: " + positivas + "\n- Negativas: " + negativas;
        return retorno;

    }

}
