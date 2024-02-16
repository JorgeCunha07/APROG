import java.util.Scanner;

public class teste4 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num;
        num =read.nextInt();
        System.out.println(multiplos(num));
    }

    public static int multiplos (int num){
        int aux =num;
        int alg;
        int x=0;
      do {
          alg = aux % 10;
          aux = aux / 10;

          if(alg ==0){
              x++;
          }
      }while (aux !=0);

      return x;
    }
}
