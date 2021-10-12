import java.util.Scanner;
public class P6{
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int max = 0;
        int min = 0;
        int sum = 0;
        int sum_all = 0;
        while (n !=0){
            if (n<=min) {
                min = n;
                sum = sum_all;
                //System.out.println("min/ sum = "+sum);
            }
            sum_all +=n;
            //System.out.println("sum_all = " + sum_all);
            if (n>max) {
                max = n;
                sum_all = 0;
                //System.out.println("max/ sum_all = "+sum_all);
            }
            n = vvod.nextInt();
        }
        System.out.println(sum + max + min );
        //System.out.println(max + " " + min);
    }
}