import java.util.Scanner;

public class A {
    static Scanner read=new Scanner(System.in);
    public static void main(String[] args) {
        String x;
        x=read.next();
        int count=0;

        do {

            if (inv(x).equals("nao palindromo")) {

                x = read.next();
                count ++;
            }

        }while(inv(x).equals("nao palindromo"));
        System.out.println(count);
    }

    public static String inv (String x){
        String fr = x;
        String aux ="";
        while(x.length() !=0){

            aux = x.charAt(0) + aux;
            x = x.substring (1);
        }

        if(fr.equals(aux)){
            return("palindromo");
        }else{
           return ("nao palindromo");
        }

    }
}
