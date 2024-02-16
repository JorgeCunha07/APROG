import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        int num ;
        Scanner leitura = new Scanner(System.in);
        int count = 1;
        do {
            System.out.println("Introduza um número: ");
            num = leitura.nextInt();

            String numS = String.valueOf(num);

            for (int i = 0; i < numS.length(); i++) {
                for (int j = 1; j < numS.length(); j++) {
                    if (numS.charAt(i) == numS.charAt(j)) {
                        count++;
                        if(count !=1){
                            System.out.println("algarismo (" + numS.charAt(i) + ") repetido nas posicoes (" + i + ") e (" + j + ")");
                        }
                    }
                }
                count = 0;
            }
        } while (num >= 0);

    }

}
