import java.util.Scanner;

public class H2 {
    public static void main(String[] args) {
        int num;
        int count = 2;
        Scanner read =new Scanner (System.in);
        do{
            num =read.nextInt();
        }while (num <= 0);

        if (num < 2){
            System.out.println("nao e primo");
        }else {
            int sqrtNum = (int) Math.sqrt (num);
            while ((count <=sqrtNum ) && (num % count !=0)){
            count = count + 1;
            }
            if (count > sqrtNum) {
                System.out.println("primo");
            }else{
                System.out.println("nao e primo");
            }
        }
    }
}
