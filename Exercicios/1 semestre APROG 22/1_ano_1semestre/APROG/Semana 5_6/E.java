import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero,algarismo,ordem,soma;
        numero = ler.nextInt();

        while (numero > 0){
            ordem = 0;
            soma =0;

            while(numero > 0){
                algarismo =numero % 10 ;
                numero = numero / 10 ;
                soma = soma + algarismo * (int) Math.pow(8,ordem);
                ordem++;
            }
            System.out.println(soma);
            numero = ler.nextInt();
        }
    }
}
