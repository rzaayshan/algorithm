package hackerrank;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinimumAbsoluteDifference {
    static int minimumAbsoluteDifference(int[] arr) {
        int len = arr.length;
        int[] a = Arrays.stream(arr).sorted().toArray();
        return IntStream.range(0, len - 1).map(i->Math.abs(a[i]-a[i+1])).min().orElse(-1);
    }

}
