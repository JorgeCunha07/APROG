/* import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, aux1 = 0, aux2 , algarismo1, algarismo2, contador, copia = 0;

        n = ler.nextInt();
        if (n > 0) {
            aux1 = n;
            n = ler.nextInt();
            if (n > 0) {
                copia = n;
            }
        }
            while (n > 0) {

                if (copia> aux1) {
                    aux2 = copia;
                    algarismo1 = aux2 % 10;
                    aux2 = aux2 / 10;
                    contador = 0;
                    while (aux2 > 0) {
                        algarismo2 = algarismo1;
                        algarismo1 = aux2 % 10;
                        aux2 = aux2 / 10;
                        if (algarismo1 >= algarismo2) {
                            contador = contador + 1;
                        }
                    }
                    if (contador == 0) {
                        System.out.println(copia);

                    }
                    aux1 = aux2;
                }

                n = ler.nextInt();
                copia = n;
            }
    }
}
*/
import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, aux1 = 0, aux2 , algarismo1, algarismo2, contador, copia = 0, contN = 0;
        String resultado = "";

        n = ler.nextInt();
        if (n >= 0) {
            aux1 = n;
            n = ler.nextInt();
            if (n >= 0) {
                copia = n;
            }
        }
        while (n >= 0) {
            if (copia > aux1) {
                aux2 = copia;
                algarismo1 = aux2 % 10;
                aux2 = aux2 / 10;
                contador = 0;
                while (aux2 > 0) {
                    algarismo2 = algarismo1;
                    algarismo1 = aux2 % 10;
                    aux2 = aux2 / 10;
                    if (algarismo1 >= algarismo2) {
                        contador = contador + 1;
                    }
                }
                if (contador == 0) {
                    contN++;
                    if(contN != 1)
                        resultado += "\n";

                    resultado = resultado + copia;
                }
            }
            aux1 = copia;
            n = ler.nextInt();
            copia = n;
        }

        System.out.println(resultado);
    }
}