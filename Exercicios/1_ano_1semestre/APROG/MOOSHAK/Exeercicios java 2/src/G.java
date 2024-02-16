import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num;

        do {
            num = read.nextInt();
        }while (num < 0);

        for(int i = 0; i <= num; i++){
            if(armstrong (i) == i ){
                System.out.println(i);
            }
        }
    }

    public static int armstrong (int num){
        int count =0;
        int alg,aux ;
        int arm =0 ;

        aux = num;

        do{
            num = num / 10;
            count++;
        }while(num != 0);

        if (count == 1){
            arm = (int) Math.pow (aux,count);
        }

        if( count > 1 ){
            do{
                alg = aux % 10 ;
                aux = aux/10;
                arm = (int) Math.pow (alg,count) + arm;

            }while(aux != 0);

        }
        return arm;
    }
}
