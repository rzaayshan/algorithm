package hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class MissingNumbers2 {
    static int[] missingNumbers(int[] arr, int[] brr) {
        LinkedList<Integer> res = new LinkedList<>();
        Map<Integer, Long> a = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Map<Integer, Long> b = Arrays.stream(brr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        b.entrySet().stream().filter(x -> !a.containsKey(x.getKey()) || x.getValue() > a.get(x.getKey()))
                .forEach(x->{
                    int len=(int)(x.getValue()-a.getOrDefault(x.getKey(),0L));
                    for(int i=0;i<len;i++)
                        res.add(x.getKey());
                });

        return res.stream().mapToInt(x->x).toArray();
    }
}
