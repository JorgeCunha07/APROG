import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nr, maiorIM = 0, nrPar = 0, contador = 0, aux;
        float percentagem;

        nr = ler.nextInt();
        while (nr > 0) {
            aux = nr % 10;
            nr = nr / 10;
            contador += 1;
            if (aux % 2 != 0) {
                if (aux > maiorIM) {
                    maiorIM = aux;
                }
            } else {
                nrPar += 1;
            }
        }
        percentagem = (float) nrPar / contador * 100;
        System.out.printf("%.2f%%%n", percentagem);

       if(maiorIM > 0){
           System.out.println(maiorIM);
       }
       else {
           System.out.println("nao ha algarismos impares");
       }
    }
}
