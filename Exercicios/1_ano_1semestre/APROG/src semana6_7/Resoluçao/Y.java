import java.util.Scanner;

public class Y {
    static Scanner ler = new Scanner(System.in);

    public static int lerValorInteiroPositivo(){
        int nrInteiroPositivo;

        do{
           nrInteiroPositivo = ler.nextInt();
        }while(nrInteiroPositivo <= 0);
        return nrInteiroPositivo;
    }

    public static void mostrarTabuadasDoIntervalo (int limINF, int limSUP){

        if(limINF > limSUP){
            int aux =limSUP;
            limSUP = limINF;
            limINF = aux;
        }
        do {
            mostrarTabuadaDoNumero(limINF);
            limINF += 1;

        }while (limINF <= limSUP);
    }
    public static void mostrarTabuadaDoNumero (int limINF){
        int x = 1;
        System.out.println("Tabuada de " + limINF);

        do{
            System.out.println(limINF + " x " + x + " = " + (limINF * x));
            x++;
        }while (x <=10);

    }
    public static void main(String[] args) {
    int limINF,limSUP;

    limINF = lerValorInteiroPositivo();
    limSUP = lerValorInteiroPositivo();
    mostrarTabuadasDoIntervalo(limINF,limSUP);

    }
}
