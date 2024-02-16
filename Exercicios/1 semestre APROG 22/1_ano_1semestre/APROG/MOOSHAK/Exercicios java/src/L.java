import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num,n;
        double powperf,perfect,powpow;

        do {
            num = read.nextInt();
        }while (num < 0);


        for(n=2; n <= num+1; n++) {
            powperf = Math.pow(2, n - 1);
            powpow = Math.pow(2, n);
            perfect = powperf * (powpow - 1);
            System.out.printf("%.0f\n", perfect);
        }
    }
}
