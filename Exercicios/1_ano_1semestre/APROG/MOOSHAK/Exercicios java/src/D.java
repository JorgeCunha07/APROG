import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int alg, num;
        int prod = 1;
        int count = 0;
        do {
            num = read.nextInt();
        } while (num <= 0);

        while (num > 0) {
            do {
                alg = num % 10;
                if (alg % 2 != 0) {
                    prod = prod * alg;
                    count = count + 1;
                }
                num = num / 10;
            } while (num != 0);

                if (count == 0) {
                    System.out.println("nao ha algarismos impares");
                } else System.out.println(prod);

                prod = 1;
                count = 0;
                num = read.nextInt();

        }
    }
}
