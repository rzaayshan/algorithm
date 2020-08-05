package hackerrank;

import java.util.stream.IntStream;

public class ArraysDS {
    static int[] reverseArray(int[] a) {
        int l = a.length;
        return IntStream.range(0,l).map(i->a[l-i-1]).toArray();
    }
}
