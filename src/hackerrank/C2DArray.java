package hackerrank;

import java.util.stream.IntStream;

public class C2DArray {
    static int hourglassSum(int[][] a) {
        int r=a.length;
        int c=a[0].length;
        return IntStream.range(1,r-1).flatMap(i->
                IntStream.range(1,c-1).map(j->
                        a[i][j]+a[i-1][j-1]+a[i-1][j]+a[i-1][j+1]+a[i+1][j-1]+a[i+1][j]+a[i+1][j+1]))
                .max().getAsInt();
    }
}
