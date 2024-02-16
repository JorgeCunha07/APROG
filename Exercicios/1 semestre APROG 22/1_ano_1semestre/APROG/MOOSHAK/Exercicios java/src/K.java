import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, prime;
        int count = 2;

        do {
            num = read.nextInt();
        } while (num < 2);

        for (prime = 2; prime <= num; prime ++) {
            int sqrtPrime = (int) Math.sqrt(prime);

            while ((count <= sqrtPrime) && (prime % count != 0)) {
                count = count + 1;
            }
            if (count > sqrtPrime) {
                System.out.println(prime);
            }
            count =2;
        }
    }
}
