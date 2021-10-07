import java.util.Scanner;
public class C1W2 {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int count_Chet = 0;
        int chet_do= 0;
        int max = n;
        while (n!=-1)
        {
            if (n % 2 ==0)
            {
                count_Chet++;
                System.out.println("count_Chet = " + count_Chet);

            }
            if (max < n)
            {
                max = n;
                System.out.println("max = "+max);
                chet_do = count_Chet;
                System.out.println("chet_do = " + chet_do);
                count_Chet = 0;
                System.out.println("count_Chet = " + count_Chet);
            }
            n = vvod.nextInt();
        }
        System.out.println(max + "  " +chet_do);
    }
}