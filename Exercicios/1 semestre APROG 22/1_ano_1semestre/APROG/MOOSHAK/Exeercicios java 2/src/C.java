import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        double a,b,c;
        a = read.nextDouble();
        b = read.nextDouble();
        c = read.nextDouble();

        if( (a+b) > c && (a+c) > b && (b+c) > a) {
            if((a*b*c) !=0){

                System.out.println("a=" + (int) a);
                System.out.println("b=" + (int) b);
                System.out.println("c=" + (int) c);
                System.out.println("ang(a,b)=" + calcAng(a,b,c));
                System.out.println("ang(a,c)=" + calcAng(a,c,b));
                System.out.println("ang(b,c)=" + calcAng(b,c,a));
            }
        }else{
            System.out.println ("impossivel");
        }

    }

    public static int calcAng(double a, double b, double c){
        double aux = (Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b);
        double ang = Math.toDegrees(Math.acos(aux));
        return (int) ang;
    }
}
