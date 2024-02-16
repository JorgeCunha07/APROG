import java.util.Scanner;

public class J {
    public static final int MAX = 40;
    public static final int TOP3 = 3;
    static Scanner ler = new Scanner(System.in);

    public static int lerNomeOrdenado(String[] nomes, int[] ordenado) {
        int i = 0;
        nomes[i] = ler.nextLine();
        while (!nomes[i].equals("FIM") && i <= MAX) {
            ordenado[i] = ler.nextInt();
            i++;
            ler.nextLine();
            nomes[i] = ler.nextLine();
        }
        return i;
    }

    public static void organizarOrdenado(String[] nomes, int[] ordenado, int size) {
        for (int i = 0; i < size; i++) {
            for (int k = i + 1; k < size; k++) {
                if (ordenado[i] < ordenado[k]) {
                    trocaArray(nomes, ordenado, i, k);
                } else if (ordenado[i] == ordenado[k]) {
                    if (nomes[i].compareTo(nomes[k]) > 0) {
                        trocaArray(nomes, ordenado, i, k);
                    }
                }
            }
        }
    }

    public static void trocaArray(String[] nomes, int[] ordenado, int i, int k) {
        int aux;
        String auxNome;
        aux = ordenado[i];
        auxNome = nomes[i];
        ordenado[i] = ordenado[k];
        nomes[i] = nomes[k];
        ordenado[k] = aux;
        nomes[k] = auxNome;
    }
    public static void imprimirOsTop3(String[] nomes, int[] ordenado,int size){
        int i = 0;
        do{
            System.out.println("#" + (i+1) + ":" + nomes[i] + ":" + ordenado[i]);
            i++;
        } while (i < TOP3 && i < size);
    }
    public static void main(String[] args) {
        String[] nomes = new String[MAX];
        int[] ordenado = new int[MAX];
        int size = lerNomeOrdenado(nomes, ordenado);
        organizarOrdenado(nomes, ordenado, size);
        imprimirOsTop3(nomes,ordenado,size);

    }

}                                                                                                                           
                                                                                                                            