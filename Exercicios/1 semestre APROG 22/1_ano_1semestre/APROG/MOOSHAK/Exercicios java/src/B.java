import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        int alg,num;
        int som = 0;
        num = read.nextInt();
        while(num>=0){
            do {
                alg = num % 10;
                if (alg % 2 == 0) {
                    som = som + alg;
                }
                num = num / 10;

            } while (num != 0);
            System.out.println(som);
            som =0;
            num = read.nextInt();
        }
    }
}
