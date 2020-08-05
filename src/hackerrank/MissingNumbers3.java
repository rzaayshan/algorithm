package hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers3 {
    static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Long> a = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Integer, Long> b = Arrays.stream(brr).boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return b.entrySet().stream()
                .filter(bi->bi.getValue()>a.getOrDefault(bi.getKey(),0L))
                .mapToInt(bi->bi.getKey()).toArray();
    }

    static int[] missingNumbers1(int[] arr, int[] brr) {
        Map<Integer, Long> a = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Integer, Long> b = Arrays.stream(brr).boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        LinkedList<Integer> res = new LinkedList<>();
        b.entrySet().stream().filter(bi->bi.getValue()>a.getOrDefault(bi.getKey(),0L))
                .forEach(bi->{
                    int key=bi.getKey();
                    int count= (int) (bi.getValue()-a.getOrDefault(key,0L));
                    for(int i=0;i<count;i++)
                        res.add(key);
                });
        return res.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        int []a={11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
        int []b={11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};
        System.out.println(Arrays.toString(missingNumbers(a, b)));
    }

}
