import java.util.Scanner;

class ExL {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num,div,som,perfect,total;
        perfect=1;
        total = 0;

        num= ler.nextInt();

        while(total<num){
            som=0;
            for(div=1; div <= perfect/2; div++){
                if(perfect % div == 0){
                    som=som+div;
                }
            }
            if(perfect==som){
                System.out.println(perfect);
                total=total+1;
            }
            perfect=perfect+1;
        }
    }
}
