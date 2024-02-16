import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in) ;
        int num, alg,pow,res;
        double decNumber;
        decNumber = 0;
        pow = 0 ;

        do {
            num = read.nextInt();
        }while (num <=0 );

        while ( num > 0) {
        do {
            alg = num % 10;
            decNumber = decNumber + alg * Math.pow(8, pow);
            pow = pow + 1;
            num = num / 10;
        }while (num!=0);
            res = (int)decNumber ;
            System.out.println(res);
            decNumber = 0;
            pow = 0;
            num = read.nextInt();
        }
    }
}
