import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        int numero,a, produto,impar=0;
        Scanner ler = new Scanner(System.in);
        numero = ler.nextInt();
        do {
            produto = 1;
            impar=0;
        while(numero > 0){
            a = numero % 10;
            numero= numero /10;
            if(a % 2 != 0){
                produto= produto * a;
                impar = impar +1;
            }}
            if (impar >= 1){
                System.out.println(produto);
            }
            else{ System.out.println("nao ha algarismos impares");
            }
            numero = ler.nextInt();
        } while (numero > 0);

        }
}
