import java.util.Locale;
import java.util.Scanner;

public class E {
    static Scanner read =new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String []arr= new String[20];
        double []arr1 = new double[20];
        show(arr,arr1);

    }

    public static int read (String[]arr,double[]arr1){
        String name;
        double money;
        int n= 0;


        name=read.next();

        while(!name.equals("fim") && n < 20){
            arr[n] =name;
            money =read.nextDouble();
            arr1[n] = money;
            n++;
            name=read.next();
        }

        return n;
    }


    public static double med (double[]arr1,int n){
        double m ;
        double count =0;

        for(int i=0; i <= n ; i++){
            count = count+ arr1[i];

        }

        m= count/n;

        return m;
    }

    public static void show (String[] arr,double[] arr1){
        int funcionarios = read(arr,arr1);
        double media;

            media = med(arr1, funcionarios);

        if(funcionarios !=0) {
            System.out.printf("%.1f\n", media);
        }

        for (int i=0 ;i < funcionarios; i++) {

            if(arr1[i] < media) {
                System.out.println(arr[i]);
            }
        }
    }
}