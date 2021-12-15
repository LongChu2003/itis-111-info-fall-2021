import  java.util.*;
public class P12 {

        public static int[] multiplyDigit(int q, int[] a, int k) {
                int n = a.length;
                int[] c = new int[n];
                for (int i=0; i<n; i++) {
                        c[i] = a[i] * k;
                }
                c = P11.carry(q, c);
                return c;
        }

        public static void main(String[] args) {
                System.out.println(Arrays.toString(multiplyDigit(100,new int[]{2,1}, 0)));
        }
}