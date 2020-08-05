package hackerrank;

import java.util.Arrays;

public class CountingSort1 {
    static int max(int []a){
        int max = a[0];
        for (int value : a) {
            max = Math.max(max, value);
        }
        return max;
    }
    static int[] countingSort(int[] a) {
        int l = max(a);
        int[] c = new int[l+1];
        for (int value : a) {
            c[value]++;
        }
        return c;
    }
}
