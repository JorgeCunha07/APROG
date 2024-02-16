import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, alg, n;
        double perc;
        double hP = 0;

        n = read.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                num = read.nextInt();
                double algT = 0;
                double divT = 0;

                while (num <= 0) {
                    num = read.nextInt();
                }
                while (num > 0) {
                    alg = num % 10;
                    if ((alg != 0) && (num % alg == 0)) {
                        divT++;
                    }
                    algT++;
                    num = num/10;
                }
                perc = (divT/algT) *100 ;
                if (hP < perc) {
                    hP = perc;
                }
                System.out.printf("%.2f%%\n", perc);
            }
            System.out.printf("("+"%.2f%%"+")\n", hP);
        }
    }
}