import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n, num1,num2,highestp, a=0, b=0;
        int max =0;

        do {
            n = read.nextInt();
        }while(n < 0);

        for(int i =0; i < n ; i++){
               num1 = read.nextInt();
               num2 = read.nextInt();
               highestp = digcom(num1,num2);

            if(max <= highestp){
                max = highestp;
                a =num1;
                b =num2;
            }
        }
        if(max > 0){
            System.out.println(a + "/" + b);
        }else{
            System.out.println("sem resultados");
        }
    }

    public static int digcom(int a,int b ){
        int count =0;
        int alg1;
        int alg2;

        do{
            alg1 = a % 10;
            alg2 = b % 10;
            if(alg1 == alg2){
                count++;
            }
            a = a / 10;
            b= b / 10;

        }while((a > 0 && b >0 ));

        return count;
    }
}
