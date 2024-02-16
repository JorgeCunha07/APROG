import java.util.Scanner;

public class B {
    public static Scanner ler = new Scanner(System.in);

    public static void Disciplina(int nrDisciplinas, int nrAlunos) {
        int i, nrAlPositivo, nrAlNegativo;
        String Disciplina, Positivo, Negativo;
        for (i = 0; i < nrDisciplinas; i++) {
            Disciplina = ler.next();
            nrAlPositivo = ler.nextInt();
            nrAlNegativo = nrAlunos - nrAlPositivo;
            Positivo = FazString(nrAlPositivo);
            Negativo = FazString(nrAlNegativo);

            System.out.println("Disciplina: " + Disciplina);
            System.out.println("- Positivas: " + Positivo);
            System.out.println("- Negativas: " + Negativo);
        }
    }

    //public static String FazString(int num, char car){
    public static String FazString(int num) {
        String texto = "";
        int x;
        for (x = 0; x < num; x++) {
            texto = texto + "*";
        }
        return texto;
    }

    public static void main(String[] args) {
        int nrAlunos, nrDisciplinas;

        nrAlunos = ler.nextInt();
        nrDisciplinas = ler.nextInt();

        Disciplina(nrDisciplinas, nrAlunos);


    }

}


