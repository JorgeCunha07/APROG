import java.util.Scanner;
import java.lang.Math;

public class C_EXG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int x = 1 ; x <= n ; x++){

            System.out.println( x + " " + Math.pow(x,2) + " " + Math.pow(x,3));
        }
    }
}
