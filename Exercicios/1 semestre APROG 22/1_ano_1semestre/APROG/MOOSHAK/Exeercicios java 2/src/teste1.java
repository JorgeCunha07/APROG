import java.util.Scanner;

public class teste1 {
    static int num;
    static Scanner read=new Scanner (System.in);
    public static void main(String[] args) {
       num =read.nextInt();
       int aux ;
       int t=0;

       if(multiplos(num) ==0){
           aux =num;
           do {

               System.out.println(convertInt(aux));
               aux =convertInt(aux);
               t++;

           }while(aux != num);
       }else{

       }



    }
    private static int convertInt(int i) {
        String s = i+"";
        int index = s.length()-1;
        String newS = s.charAt(index) + s.substring(0, index);
        return Integer.parseInt(newS);
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
