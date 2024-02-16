import java.util.Scanner;
import java.lang.Math;

public class C {
    public static Scanner ler = new Scanner(System.in);
    //static final int MAX =3;
    public static double ArcCos(float l1,float l2,float l3){
        double resultado;
        resultado = Math.toDegrees(Math.acos((Math.pow(l1,2)+Math.pow(l2,2) - Math.pow(l3,2)) / (2*l1*l2)));
        return resultado;
    }

    public static void main(String[] args) {
    float a,b,c;

    a = ler.nextFloat();
    b = ler.nextFloat();
    c = ler.nextFloat();

    if(Math.abs(b - c) < a && a < (b + c) || Math.abs(a - c) < b && b < (a + c) || Math.abs(a - b) < c && c < (a + b)){
        System.out.printf("a=%.2f%n",a);
        System.out.printf("b=%.2f%n",b);
        System.out.printf("c=%.2f%n",c);
        System.out.printf("ang(a,b)=%.2f%n",ArcCos(a,b,c));
        System.out.printf("ang(a,c)=%.2f%n",ArcCos(a,c,b));
        System.out.printf("ang(b,c)=%.2f%n",ArcCos(b,c,a));
    }
    else{
        System.out.println("impossivel");
    }
    }
}
