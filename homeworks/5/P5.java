import java.util.Scanner;
public class P5{
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int max_1 = n;
        int max_2 = n;
        int sum_all =0;
        int sum = 0;
        while (n !=0) {
            if (n > max_1) {
                max_2 = max_1;
                max_1 = n;
                sum = sum_all;
                //System.out.println("if sum = " + sum);
                sum_all = 0;
                //System.out.println("if sum_all = " + sum_all);
            } else if (n > max_2) {
                max_2 = n;
                sum = sum_all;
                //System.out.println("else if sum = " + sum);
                sum_all = 0;
                //System.out.println("else if sum_all = " + sum_all);
            } else {
                sum_all+=n;
                //System.out.println("else sum_all = " + sum_all);
            }
            n = vvod.nextInt();
        }
        //System.out.println(max_1 +" " + max_2);
        System.out.println(sum);
    }
}