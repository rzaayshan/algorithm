package hackerrank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumDistances {
    static class Pair<A, B>{
        A a;
        B b;
        Pair(A a, B b){
            this.a=a;
            this.b=b;
        }

        @Override
        public String toString() {
            return String.format("Pair{a=%s, b=%s}", a, b);
        }
    }
    static int minimumDistances(int[] a) {

        List<List<Object>> collect = IntStream.range(0, a.length).mapToObj(i -> new Pair(i, a[i]))
                .collect(Collectors.groupingBy(p -> p.b,
                        Collectors.mapping(p -> p.a, Collectors.toList())))
                .values().stream().filter(v -> v.size() > 1).collect(Collectors.toList());
        return collect.size()>0 ? collect.stream().map(v -> (int) v.get(v.size() - 1) - (int) v.get(0))
                .min(Comparator.naturalOrder()).get() : -1;


    }

    public static void main(String[] args) {
        System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));

    }
}
