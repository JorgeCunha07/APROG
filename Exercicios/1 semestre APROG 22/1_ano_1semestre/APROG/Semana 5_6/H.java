import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int divisores,nrDivisores = 0;
        divisores = ler.nextInt();

        for(int i = 1 ; i <= divisores; i++){
            if(divisores % i == 0){
                nrDivisores= nrDivisores + 1;
            }
        }
        if( nrDivisores > 2){
            System.out.println("nao e primo");
        }
        else {
            System.out.println("primo");
        }
    }
}
