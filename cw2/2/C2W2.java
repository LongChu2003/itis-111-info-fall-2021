import java.io.*;
import java.util.*;

public class C2W2 {
    // Решение задачи 2 следует писать здесь
    public static int solve2(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 ==0){
                sum += a[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
      System.out.println(solve2(new int[]{1,2,3,4,5}));
    }
}
