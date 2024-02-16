import java.util.Locale;
import java.util.Scanner;

public class X2 {
    static int K =5;
    static Scanner read =new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n;
        int num;
        int aux;
        int m= 0;
        double t= 0;
        double x;
        int p=1;

        do{
            n=read.nextInt();
        }while(n < 0);
        do{

        num =read.nextInt();
        aux =num;

            if(dig(num) <= n) {
                m = aux + m;
                t++;
            }
            p++;
        }while((dig(num) <= n) && (p <= K));
        x= (float) m/t;


        System.out.printf("%.2f\n",x);
    }

    public static double dig(int num){
        int cont;
            cont =1;

            do {
                num = num / 10;
                cont++;             //numeros de digitos
            } while (num != 0);

        return cont;
    }
}

