import java.util.Scanner;

public class teste6 {
    static int num1,num2;
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        num1=read.nextInt();

          for(int i  =0 ; i <= num1 ;i++) {
                if (primti(i) != 0) {
                System.out.println((i));
           }
        }
    }
    public static int primti (int num){
        int aux; // Salvar o numero para o converter
        int t = 0; // contar numero de vezes que é convertido

        aux = num;
            do {

                if (primo(convertInt(aux)).equals("primo")) {
                    t++;
                }
                aux = convertInt(aux);

                if (num == 11) {
                    t =2;
                }


            } while (aux != num);

            //System.out.println(t);
            if (t == digitos(num)) {
                return t;
            }


        return 0;
    }
    public static int convertInt(int i) {
        String s = i + "";
        int index = s.length() - 1;
        String newS = s.charAt(index) + s.substring(0, index);      //Reverter os numeros
        return Integer.parseInt(newS);
    }

    public static int digitos(int num) {
        int d = 0;

        do {
            num = num / 10;
            d++;                                        //Calcular numero de digitos

        } while (num != 0);
        return d;
    }

    public static String primo(int num) {
        int qtdDiv = 2;

        if (num < 2) {
            return ("nao e primo");
        } else {

            int raiz = (int) Math.sqrt(num);
            while ((qtdDiv <= Math.sqrt(num)) && (num % qtdDiv != 0)) {     //Numero Primo
                qtdDiv = qtdDiv + 1; // contador
            }
            if (qtdDiv > raiz) {
                return ("primo");
            } else {
                return ("nao e primo");
            }

        }
    }

    public static int multiplos(int num) {
        int aux = num;
        int alg;
        int x = 0;
        do {
            alg = aux % 10;
            aux = aux / 10;
            //Se Numero tiver 0's
            if (alg == 0) {
                x++;
            }
        } while (aux != 0);

        return x;
    }
}