package hackerrank;


import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SparseArrays {
    static long[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Long> collect = Arrays.stream(strings).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        return Arrays.stream(queries).mapToLong(q->collect.getOrDefault(q, 0L)).toArray();


    }
}
