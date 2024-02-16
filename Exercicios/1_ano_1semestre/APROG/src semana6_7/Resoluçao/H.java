import java.util.Scanner;

public class H {
    static final int MAX = 5;

    public static boolean verificarCapicua(int capicua) {
        boolean resultado = false;
        int copia = 0, aux = 0;
        copia = capicua;
        while (capicua != 0) {
            aux = aux * 10 + capicua % 10;
            capicua = capicua / 10;
        }
        if (aux == copia) {
            resultado = true;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int capicua, contador = 0;
        boolean resultado = false;

        while (resultado == false && contador < MAX) {
            capicua = ler.nextInt();
            if (verificarCapicua(capicua)) {
                System.out.println("capicua");
                resultado = true;
            }
            contador += 1;
        }
        if (resultado == false && contador == MAX){
            System.out.println("tentativas excedidas");
        }
    }
}
