import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int num3=num;
        int dig1,dig2,pos1=0,pos2=0;
        while(num>=0)
        {
            while(num2 > 0)
            {
                dig1 = num2 % 10;
                pos1 =pos1 + 1;
                num2 =num2 / 10;
                while(num > 0)
                {
                    dig2= num % 10;
                    pos2 = pos2 + 1;
                    num = num / 10;
                    if(pos1 != pos2)
                    {
                        if (dig2 == dig1)
                        {
                            System.out.println(num3 + " : algarismo (" + dig2 + ") repetido nas posicoes (" + pos1 + ") e (" + pos2 + ")");
                        }
                    }
                }
            }
            num= sc.nextInt();
            pos1=0;
            pos2=0;
            num2=num;
            num3=num;

        }
    }
}