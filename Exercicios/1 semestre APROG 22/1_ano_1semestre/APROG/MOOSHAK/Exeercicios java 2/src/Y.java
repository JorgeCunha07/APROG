import java.util.Scanner;

public class Y {
    static int num1,num2;
    static Scanner read=new Scanner(System.in);
    public static void main(String[] args) {

        mostrarTabuadasDoIntervalo((lerValorInteiroPositivo(num1)),(lerValorInteiroPositivo(num2)));
    }
    public static int lerValorInteiroPositivo(int num) {

        do{
            num =read.nextInt();
        }while(num <= 0);
        return num;
    }

    public static void mostrarTabuadaDoNumero(int num){
        int aux;
        System.out.println("Tabuada de " + num);
        aux = num;
        for (int i =1; i <= 10;i++){
            num = num *i;
            System.out.println(aux+ " x " + i + " = " + num );
            num = aux;
        }
    }
    public static void  mostrarTabuadasDoIntervalo (int num1,int num2){
        int min, max;
        max= (Math.max(num1,num2));
        for (min = (Math.min(num1, num2)); min <= max; min++){
            mostrarTabuadaDoNumero(min);
        }

    }
}
