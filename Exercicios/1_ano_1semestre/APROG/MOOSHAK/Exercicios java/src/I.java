import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner read= new Scanner( System.in);
        int numM,numD;// numM vai ser o numero que vai ser multiplicado e numD o numero que vai fazer mod

        do {
            numM = read.nextInt();
            numD = read.nextInt();
        }while(numM < 0 && numD <0);
        int mmc = numM * numD;

        for(int i =numM; i <= numM*numD; i ++) { //i = multiple
            if ((i % numM == 0)&& (i % numD ==0)) {
                if(i < mmc ){
                    mmc = i;
                }
            }
        }
        System.out.println(mmc);
    }
}
