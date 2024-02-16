import java.util.Scanner;

public class D {
    static Scanner read =new Scanner(System.in);
    public static void main(String[] args) {
        int [] arr;
        int n;
        n =read.nextInt();
        if(n > 0) {
            arr = new int[n];
            readnotas(arr);
            show(arr);

        }
    }

    public static void readnotas (int[]arr){
        int num;
        for(int i=0; i <arr.length; i++){
            num= read.nextInt();
            arr[i] = num;
        }
    }

    public static void show (int[]arr){
        for(int nota =0; nota <=20; nota++ ){
            System.out.println(nota + " " + freq(arr,nota));
        }
    }

    public static int freq (int[]arr,int nota) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (nota == arr[i]) {
                count++;
            }
        }
        return count;

    }
}
