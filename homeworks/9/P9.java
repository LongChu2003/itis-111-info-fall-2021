import java.util.*;
public class P9 {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int m =vvod.nextInt();
        int[][] a = new int [n][m];
        int s = 1;
        for (int j = 0;j < m; j++){
            a[0][j] = s;
            s++;
        }
        for (int i = 1; i< n; i++){
            a[i][m-1] = s;
            s++;
        }
        for (int j = m-2; j>=0; j-- ){
            a[n-1][j] = s;
            s++;
        }
        for (int i =n-2;i>0;i--){
            a[i][0] = s;
            s++;
        }
        for (int i =0;i<n;i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}