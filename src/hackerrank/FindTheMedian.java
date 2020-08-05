package hackerrank;

import java.util.Arrays;

public class FindTheMedian {
    static int findMedian(int[] arr) {
        int[] ints = Arrays.stream(arr).sorted().toArray();
        return ints[ints.length/2];


    }
}
