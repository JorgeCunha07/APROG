import java.util.Scanner;

public class G {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int divisores,nrDivisores = 0;
        divisores = ler.nextInt();

        for(int i = 1 ; i <= divisores; i++){
            if(divisores % i == 0){
                System.out.println(i);
                nrDivisores= nrDivisores + 1;
            }
        }
        System.out.println("(" + nrDivisores + ")");
    }
}
