import java.util.Scanner;

public class B {
    static Scanner read=new Scanner(System.in);
    public static void main(String[] args) {
        int [] arr1 = new int [100];
        int count =fillarr(arr1);
        int m =minornum(arr1,count);
        int o =occ(arr1,m,count);

        if(count != 0) {
            System.out.println("menor=" + m);
            System.out.println("ocorrencias=" + o);
        }
    }

    public static int fillarr (int[] arr1){
        int count = 0;
        int num = read.nextInt();

        while(num > 0){
            arr1[count]= num;
            num =read.nextInt();
            count ++;
        }
        return count;
    }

    public static int minornum (int[]arr1, int count){
        int m = arr1[0];

        for (int i=0;i < count;i++){
            if(arr1[i]<m){
                m=arr1[i];
            }
        }
        return m;
    }

    public static int occ (int[] arr1, int m ,int count){
        int oc=0;

        for(int i=0; i < count; i++){
            if(arr1[i] == m){
                oc ++;
            }
        }
        return oc;
    }

}
