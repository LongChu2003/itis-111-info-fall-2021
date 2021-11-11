import java.util.Scanner;
public class P5{
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int max_1 = n;
        int max_2 = n;
        int sum_all =0;
        int sum = 0;
        int x = 0;
        int count_x = -1;

        while (n !=0) {
            if (n > max_1) {
                max_2 = max_1;
                //System.out.println("max_2 = " + max_2 );
                max_1 = n;
                //System.out.println("max_1 = " + max_1);
                sum = sum_all;


                //System.out.println("if sum = " + sum);
                sum_all = 0;
                //System.out.println("if sum_all = " + sum_all);
            } else if (n > max_2) {
                max_2 = n;
                //System.out.println("max_2 = " + max_2 );
                sum = sum_all;
                //System.out.println("else if sum = " + sum);
                sum_all = 0;
                //System.out.println("else if sum_all = " + sum_all);
            } else {
                sum_all+=n;
                x++;
                //System.out.println("else sum_all = " + sum_all);
            }
            if (max_1 != max_2){
                x = 0;
                sum = 0;
            }
            n = vvod.nextInt();
        }
        //System.out.println(max_1 +" " + max_2);
        if (x>0){
            System.out.println(sum);
        } else {
            System.out.println("NO");
        }
    }
}