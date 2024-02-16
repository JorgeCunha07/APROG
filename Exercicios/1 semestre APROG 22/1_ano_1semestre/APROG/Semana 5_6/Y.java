import java.util.Scanner;
// divisores multiplos de 3

public class Y {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nr,contador = 0;

        nr = ler.nextInt();

        for (int i = 1; i < nr; i++){
            if(nr % i == 0 &&  i % 3 == 0){
                System.out.println(i);
                contador += 1;
            }
        }
        if(contador == 0){
            System.out.println("sem divisores multiplos de 3");
        }
    }
}
