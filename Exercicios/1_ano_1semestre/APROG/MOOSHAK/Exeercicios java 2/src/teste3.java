import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        num = read.nextInt();
        if(primo(num).equals("primo")){
            System.out.println(num);
        }

    }

    public static String primo(int num) {
        int  qtdDiv = 2;

        if (num <2){
            return("nao e primo");
        } else {

            int raiz = (int) Math.sqrt(num);
            while ((qtdDiv <= Math.sqrt(num)) && (num % qtdDiv != 0)) {
                qtdDiv = qtdDiv + 1; // contador
            }
            if (qtdDiv > raiz) {
                return("primo");
            } else {
                return("nao e primo");
            }

        }
    }
}

