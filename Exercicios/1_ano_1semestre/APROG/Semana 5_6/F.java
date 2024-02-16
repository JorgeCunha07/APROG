import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, invNumero = 0, algarismo, copia;
        numero = ler.nextInt();
        copia = numero;
        if (numero > 10) {
            do {
                algarismo = numero % 10;
                invNumero = invNumero * 10 + algarismo;
                numero = numero / 10;
            } while (numero > 0);
        }
        if (copia == invNumero) {
            System.out.println("capicua");
        } else {
            System.out.println("nao capicua");
        }
    }
}