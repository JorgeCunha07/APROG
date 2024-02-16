import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        int numA,numD,pass;
        String cl;

        numA = read.nextInt();
        numD = read.nextInt();

        for(int i =0; i < numD; i++){
            cl = read.next();
            pass =read.nextInt();
            show (numA,cl ,pass);
        }
    }
    public static void show (int numA, String cl, int pass){
        System.out.println("Disciplina: " + cl);
        System.out.print("- Positivas: ");
        for (int i =0; i < pass ; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("- Negativas: ");
        int neg = numA-pass;

        for(int i =0; i < neg ;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
