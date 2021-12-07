import  java.util.*;
public class kcass {
    public static int[] carry(int q, int[] a){
        int div = 0;
        int l = a.length;

        for (int i = 0; i < a.length; i++) {
            a[i] += div;
            div = a[i] / q;
            a[i] = a[i] % q;
        }

        if (div>0){
            int[] b = new int[l+1];
            for (int i=0; i<a.length; i++) {
                b[i] = a[i];
                a = b;
            }
            a[l] = div;
            l++;
        }
        while (l>0 && a[l-1]==0) {
            l--;
        }
        int[] b = new int[l];
        for (int i=0; i<a.length; i++) {
            b[i] = a[i];
        }
        a = b;
        return a;
    }

    public static int[]  multiplyDigit(int q , int[] a, int k){
        int n = a.length;
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            b[i] = a[i] * k;
        }
        b = carry(q, b);
        return b;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(multiplyDigit(10, new int[] {6,5,4,3,2,1}, 3)));
    }
}