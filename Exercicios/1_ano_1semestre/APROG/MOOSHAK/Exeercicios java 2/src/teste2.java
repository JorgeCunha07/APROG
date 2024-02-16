import java.util.Scanner;

public class teste2 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num;
        num =read.nextInt();
        System.out.println(digitos(num));
    }

    public static int digitos (int num){
        int d =0;

        do{
            num = num/10;
            d++;

        }while(num!= 0);
        return d;
    }
}
