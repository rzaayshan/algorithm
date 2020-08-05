package hackerrank;

import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    static int anagram(String s) {
        int n=s.length();
        if((n&1)==1)
            return -1;

        Map<Integer, Long> first = s.substring(0, n / 2).chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Integer, Long> second = s.substring(n/2,n).chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return (int) first.entrySet().stream()
                .filter(m->m.getValue()>second.getOrDefault(m.getKey(),0L))
                .mapToLong(m->m.getValue()-second.getOrDefault(m.getKey(),0L))
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(anagram("fdhlvosf" +
                                      "pafhalll"));
    }
}
