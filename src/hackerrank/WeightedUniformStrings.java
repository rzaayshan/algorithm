package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class WeightedUniformStrings {

    static String[] weightedUniformStrings(String s, int[] queries) {
        Map<Integer, Long> count = s.chars().map(c -> c - 96).boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return Arrays.stream(queries).mapToObj(q->
                count.containsKey(q)?"Yes":"No").toArray(String[]::new);

    }

}
