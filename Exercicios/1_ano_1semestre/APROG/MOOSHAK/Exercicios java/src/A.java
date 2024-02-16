import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int alg, num;
        int soma = 0;
        do {
           num = read.nextInt();
        } while (num <=0);

        while (num > 0) {
            alg = num % 10;
            if (alg % 2 ==0) {
                soma = soma + alg;
            }
            num = num / 10;
        }
        System.out.println(soma);
    }
}
