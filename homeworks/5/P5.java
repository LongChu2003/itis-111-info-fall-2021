import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int max1 = -11111;
        int max2 = 0;
        int sum =0;
        int sum_final = 0;
        boolean f = true;
        while (n!=0){
            if (n > max1){
                max1 = n;
                sum = 0;
            } else if (n == max1 && f) {
                max2 = max1;
                sum_final = sum - max2 ;
                f = false;
            }
            sum +=n;
            n = vvod.nextInt();
        }
        if (sum_final == 0){
            System.out.println("NO");
        } else {
        System.out.println(sum_final);
        }
    }
}