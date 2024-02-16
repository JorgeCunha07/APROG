import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        int num,numf,num1,alg;
        int total =0;
        int totalA =0;
        int alg1 = 10;

        num=read.nextInt();
        num1 =num;

        while (num >= 0){
            numf =num;
            if(num > num1){

                while (num!=0){
                    alg = num % 10;
                    num = num/10;

                    if (alg < alg1){
                        alg1 =alg;
                        totalA ++;
                    }
                    total ++;
                }
                if (total == totalA){
                    System.out.println(numf);
                }
            }
            num=read.nextInt();
            num1 =numf;
            total=0;
            totalA=0;
            alg1=10;
        }
    }
}
