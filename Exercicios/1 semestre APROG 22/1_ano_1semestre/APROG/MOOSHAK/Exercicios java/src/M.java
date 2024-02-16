import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        int n,num,num1,num2,sum;

        do {
            n = read.nextInt();
        }while (n < 0);

        num1= 0;
        num2= 1;

        if(n == 1){
            System.out.println(num1);
        }

        if(n == 2){
            System.out.println(num1);
            System.out.println(num2);
        }

        if(n == 3){
            sum = num1 +num2;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(sum);
        }

        if(n > 3){
            sum= num1 + num2;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(sum);

            for (num =4; num <= n;num++){
                num1= num2;
                num2 =sum;
                sum =num1+num2;
                System.out.println(sum);
            }
        }
    }
}
