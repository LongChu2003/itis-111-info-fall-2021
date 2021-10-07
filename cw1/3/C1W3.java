
import java.util.Scanner;
public class C1W3 {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int proizved = 1;
        int min_5 = 0;
        int krat_5 = 0;
        while (n !=-1)
        {
            proizved *=n;
            for (int i = 1; i<=n;i++)
            {
                if (i % 5 ==0)
                {
                    min_5 = i;
                    break;
                }
            }
//            if (n % 5 ==0)
//            {
//                krat_5 = n;
//                System.out.println("krat_5 = " + krat_5);
//            }
            n = vvod.nextInt();
        }
        System.out.print(proizved + " ");
        if (min_5==0)
        {
            System.out.println("NO");
        } else {
            System.out.println(min_5);
        }
        //System.out.println(proizved);
        //System.out.println(min_5);
    }
}