import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        double alg,perc,total, algi = 0;
        double algp = 0;
        double algim = 0;

        do {
            num = read.nextInt();
        } while (num <= 0);

        do {
            alg = num % 10;
            num = num / 10;

            if (alg % 2 != 0) {
                algim++;
                if (alg > algi){
                    algi =alg ;
                }
            } else {
                algp++;
            }
        } while (num != 0);
        total = algim + algp;
        perc = (algp/total)*100;
        System.out.printf("%.2f%%\n",perc);

        if (algim > 0){
            System.out.printf("%.0f\n",algi);
        }else {
            System.out.println("nao ha algarismos impares");
        }
    }
}
