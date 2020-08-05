package hackerrank;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class EqualizeTheArray {
    static int equalizeArray(int[] arr) {
        Map<Integer, Long> count = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        long max = count.values().stream().mapToLong(x -> x).max().orElse(0L);
        return (int) (count.values().stream().mapToLong(x->x).sum()-max);


    }
}
