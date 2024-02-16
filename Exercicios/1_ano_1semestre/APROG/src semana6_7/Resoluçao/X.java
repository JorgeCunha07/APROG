import java.util.Scanner;

public class X {
    static Scanner ler = new Scanner(System.in);
    public static boolean palindromoTest(String palavra){
       String palindromo = "";
        int x = palavra.length();

        for (int i = x -1; i >= 0 ;i-- ){
            palindromo += palavra.charAt(i);
        }


       return (palindromo.equals(palavra));
    }
    public static void main(String[] args) {
        int contador = 0 ;
        String palavra;
        boolean palindromo ;

        do{
            palavra = ler.nextLine();
            contador ++;
            palindromo = palindromoTest(palavra);
            if (palindromo){
                contador --;
            }
        }while (!palindromo);

        System.out.println(contador);
    }
}
