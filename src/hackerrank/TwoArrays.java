package hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;


public class TwoArrays {
    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        if(IntStream.range(0,A.length).map(i->A[i]+B[B.length-i-1]).allMatch(x->x>=k))
            return "YES";

        return "NO";
    }

}
