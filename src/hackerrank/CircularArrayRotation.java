package hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int d, int[] queries) {
        int []result=new int [a.length];
        int l=a.length;

        IntStream.range(0, d).forEach(i->result[i]=a[l-d+i]);
        IntStream.range(d,l).forEach(i->result[i]=a[l-i-1]);

        int []r = new int[queries.length];
        IntStream.range(0,queries.length).forEach(i->r[i]=result[queries[i]]);


        return r;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularArrayRotation(new int[]{3, 4, 5}, 1, new int[]{1, 2, 1, 0})));

    }
}
