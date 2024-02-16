import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int num = 0;
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
                            System.out.println("O número " + numS.charAt(i) + " aparece " + count + "vezes, nas posições " + i + "e" + j);
                        }
                    }
                }
                count = 0;
            }
        } while (num >= 0);

    }

}