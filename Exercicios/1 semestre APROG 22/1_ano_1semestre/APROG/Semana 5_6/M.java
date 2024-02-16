import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int sucessao, aux1 = 0, aux2 = 1, aux3, contador = 2;

        sucessao = ler.nextInt();

        if (sucessao <= 0) {

        } else {
            if (sucessao == 1) {
                System.out.println(aux1);
            } else {
                if (sucessao == 2) {
                    System.out.println(aux1);
                    System.out.println(aux2);
                } else {
                    System.out.println(aux1);
                    System.out.println(aux2);

                    while (sucessao != contador) {
                        aux3 = aux1 + aux2;
                        System.out.println(aux3);
                        aux1 = aux2;
                        aux2 = aux3;
                        contador += 1;
                    }
                }
            }
        }
    }
}