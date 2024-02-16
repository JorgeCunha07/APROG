import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num ,alg,init ;
        int rev = 0; //rev = reverse

        num =read.nextInt();
        init = num ;

        while (num > 0) {
            alg = num % 10;
            rev = (rev * 10) + alg;
            num = num / 10 ;
        }
            if (init == rev) {
                System.out.println("capicua");
            } else {
                System.out.println("nao capicua");
            }
    }
}
