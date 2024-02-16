import java.util.Scanner;

public class B_EXC {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] Args) {
        int alcool = 0, gasolina = 0, diesel = 0;
        int n;


        do {
            n = sc.nextInt();

            switch (n) {
                case 1 -> alcool += 1;
                case 2 -> gasolina += 1;
                case 3 -> diesel += 1;
                case 4 -> System.out.println("MUITO OBRIGADO");
            }

        } while (n != 4);
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
