import java.util.Scanner;

public class L {
    static Scanner ler = new Scanner(System.in);

    public static int frasePalavra(String frase){
        int contador = 1,palavras;
        char d = ' ';

        if(frase.charAt(0) == d){
            palavras = 0;
        }
        else {
            palavras = 1;
        }

        while(frase.length() != contador){
            char b = frase.charAt(contador - 1);
            char c = frase.charAt(contador );
            if (b == d && c != d){
                palavras += 1 ;
            }
            contador ++;
        }
        return palavras;
    }

    public static void main(String[] args) {
        String frase ;
        int palavras;

        frase = ler.nextLine();
        palavras = frasePalavra(frase);
        System.out.println(palavras);

    }
}
