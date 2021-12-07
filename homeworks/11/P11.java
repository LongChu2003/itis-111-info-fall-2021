import  java.util.*;
public class kcass {
    public static int[] carry(int q, int[] a){
        int div = 0;
        int k = a.length;

        for (int i = 0; i < a.length; i++) {
            a[i] += div;
            div = a[i] / q;
            a[i] = a[i] % q;
        }

        if (div>0){
            int[] b = new int[k+1];
            for (int i=0; i<Math.min(a.length, k+1); i++) {
                b[i] = a[i];
                //System.out.println("b[i] = " +  b[i] + ", i = "+ i);
                a = b;
            }
            a[k] = div;
            k++;
        }
        while (k>0 && a[k-1]==0) {
            k--;
        }
        int[] b = new int[k];
        for (int i=0; i<Math.min(a.length, k+1); i++) {
            b[i] = a[i];
        }
        a = b;
        return a;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(carry(10, new int[] {42})));
    }
}