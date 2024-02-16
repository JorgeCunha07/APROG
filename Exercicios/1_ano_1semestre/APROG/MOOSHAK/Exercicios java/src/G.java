import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int tDiv = 1;
        do {
            num = read.nextInt();
        }while (num < 0);

        for (int div = 1; div<= num/2; div ++ ) {
            if (num % div == 0) {
                tDiv = tDiv + 1;
                System.out.println(div);
            }
        }
        System.out.println(num);
        System.out.println("("+tDiv+")");
    }
}
