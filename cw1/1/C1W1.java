
import java.util.Scanner;
public class C1W1{
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int del_1 = 0;
        int del_2 = 0;
        boolean end_1 = true;
        boolean isProst = true;
        while (n!=-1)
        {
            for (int i = 2; i*i <=n;i++)
            {
//              int del_1=0;
//              int del_2=0;
                if (n % i ==0)
                {
                    //System.out.println("n = "+n +" "+ "i = " +i );
                    del_1 = i;
                    del_2 = n/i;
                    //System.out.println("del_1 = " + del_1 + "; del_2 = " + del_2);
                }
                for (int j = 2; j < del_1;j++)
                {
                    if (del_1 % j ==0)
                        isProst = false;
                }
                for (int j = 2; j < del_2;j++)
                {
                    if (del_2 % j ==0)
                        isProst = false;
                }
            }
            end_1 = (del_1 % 10 ==1 || del_2 % 10 ==1 );
            n = vvod.nextInt();
        }
        if (isProst && end_1)
        {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }    }
}