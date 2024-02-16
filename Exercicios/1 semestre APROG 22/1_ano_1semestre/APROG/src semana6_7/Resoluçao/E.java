import java.util.Scanner;

public class E {
    public static Scanner ler = new Scanner(System.in);

    public static int DigitosComuns(int num1, int num2) {
        int dig1, dig2, cont = 0;

        while (num1 != 0 && num2 != 0) {
            dig1 = num1 % 10;
            dig2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            if (dig1 == dig2) {
                cont += 1;
            }
        }
        return cont;
    }

    public static void main(String[] Args) {
        int x, n, num1, num2, contador, save1 = 0, save2 = 0, contMax = 0;


        do {

            n = ler.nextInt();

        } while (n <= 0);

        for (x = 0; x < n; x++) {
            do {
                num1 = ler.nextInt();
                num2 = ler.nextInt();
            } while (num1 <= 0 || num2 <= 0);
            contador = DigitosComuns(num1, num2);
            if (x == 0) {
                save1 = num1;
                save2 = num2;
                contMax = contador;
            } else if (contador >= contMax) {
                contMax = contador;
                save1 = num1;
                save2 = num2;
            }
        }

        if (contMax == 0) {
            System.out.println("sem resultados");
        } else {
            System.out.println(save1 + "/" + save2 + "");
        }
    }
}


