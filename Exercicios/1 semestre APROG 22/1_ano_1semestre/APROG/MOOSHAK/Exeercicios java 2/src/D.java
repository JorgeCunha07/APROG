import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        double m;
        double n;
        double div; //div= divisor
        m =read.nextDouble();
        n=read.nextDouble();

        if(m>=n){
            div = m-n;
            combi(m,n,div);
            perm(m,n,div);
        }
    }

    public static double xfactor(double x ){
        double res =1;
        for(double i =2; i <= x; i++){
            res=res* i;
        }
        return res;
    }
    public static void perm (double m,double n,double div){
        double perm ;
        perm= xfactor(m) / xfactor(div);
        System.out.println("P(" + (int) m +"," + (int) n +")="+ (int) perm);
    }

    public static void combi (double m, double n,double div){
        double combi;
        combi= xfactor(m)/(xfactor(n) * xfactor(div));
        System.out.println("C(" + (int) m +"," + (int) n +")="+ (int) combi);
    }
}
