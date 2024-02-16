import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, num2, mmc;
        num1 = ler.nextInt();
        num2 = ler.nextInt();

        if (num1 > num2) {
            if (num1 % num2 == 0) {
                mmc = num1;
                System.out.println(mmc);
            } else {
                mmc = num1 * num2;
                System.out.println(mmc);
            }
        } else {
            if (num2 % num1 == 0) {
                mmc = num2;
                System.out.println(mmc);
            } else {
                mmc = num1 * num2;
                System.out.println(mmc);
            }
        }
    }
}