import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num,div,sum,perfect,total;
        perfect =6;
        total =0;

        num =read.nextInt();

        while (total < num ){
            sum=0;

            for(div=1;div <= perfect/2;div++){
                if(perfect % div==0 ){
                    sum=sum +div;
                }
            }
            if(perfect==sum){
                System.out.println(perfect);
                total ++;
            }
            perfect ++;
        }
    }
}
