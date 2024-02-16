import java.util.Scanner;

public class C {
    static Scanner read=new Scanner(System.in);
    public static void main(String[] args) {
        int n ;
        n = read.nextInt();
        int[] arr;

        if(n > 0) {
            arr =new int [n];
            fillarr(arr, n);

            if (sec(arr) == true) {
                System.out.println("sempre crescente = true");
            } else {
                System.out.println("sempre crescente = false");
            }
        }

    }

    public static void fillarr (int[]arr, int n){
        int num;
        for(int i = 0; i < n; i++){
            num =read.nextInt();
            arr[i] = num;
        }

    }

    public static boolean sec (int[]arr) {
        int m = arr[0];
        int count = 0;
        for (int j : arr) {

            if (j > m) {
                m = j;
                count++;
            }

        }
        if (count == arr.length -1) {
            return true;
        } else {
            return false;
        }
    }
}
