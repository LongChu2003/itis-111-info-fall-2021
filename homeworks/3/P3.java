import java.util.Scanner;
public class P3{
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        boolean isProst = true;
        for (int i = 2; i<n;i++)
        {
            if (n % i == 0)
            {
                isProst = false;
            }
        }
        if (isProst == true){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
