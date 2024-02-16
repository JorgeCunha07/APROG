import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int tDiv = 1;
        do {
            num = read.nextInt();
        } while (num <= 0);

        for (int div = 1; div <= num / 2; div++) {
            if (num % div == 0) {
                tDiv = tDiv + 1;
            }
        }
        if (tDiv <= 2) {
            System.out.println("primo");
        } else {
            System.out.println("nao primo");

        }
    }
}