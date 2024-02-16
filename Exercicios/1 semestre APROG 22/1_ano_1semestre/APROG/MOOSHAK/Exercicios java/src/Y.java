import java.util.Scanner;

public class Y {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, div;
        int mult = 0;

        do {
            num = read.nextInt();
        } while (num <= 0);

        for (div = 1; div <= num / 2; div++) {

            if ((num % div == 0) && (div % 3 == 0)) {
                System.out.println(div);
                mult++;
            }
        }
        if (mult == 0){
            System.out.println("sem divisores multiplos de 3");

        }
    }
}