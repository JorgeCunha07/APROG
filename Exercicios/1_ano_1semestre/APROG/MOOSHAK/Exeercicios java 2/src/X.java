import java.util.Locale;
import java.util.Scanner;

public class X {
    static Scanner read =new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n;

        do{
            n=read.nextInt();
        }while(n < 0);

        System.out.printf("%.2f\n",dig(n));
    }
    public static double dig(int n){
        int cont;
        int num;
        int m= 0;
        double t= 0;
        int  aux;
        double x;

        do {
            cont =1;

            num = read.nextInt();//ler num

            aux =num;
            do {
                num = num / 10;
                cont++;             //numeros de digitos
            } while (num != 0);

            if(cont <= n) {
                m = aux + m;
                t++;
            }
        }while(cont <= n);

        x= (float) m/t;

        return x;
    }
}
