package hackerrank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class TwoCharacters {
    static class Pair<A,B>{
        A a;
        B b;

        public Pair(A a, B b) {
            this.a=a;
            this.b=b;

        }
    }

    static boolean isValid(List<Character> l){
        char first=l.get(0);
        return IntStream.range(0,l.size())
                .allMatch(i-> ((i & 1) == 0) == (l.get(i) == first));
    }

    static int alternate(String s) {
        List<Character> chars = s.chars().distinct().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Pair> pairs =
                IntStream.range(0, chars.size() - 1).boxed().flatMap(i ->
                        IntStream.range(i + 1, chars.size()).boxed().map(j ->
                                new Pair(chars.get(i), chars.get(j))))
                        .collect(Collectors.toList());

        List<List<Character>> filters = pairs.stream().map(p -> s.chars().mapToObj(c -> (char) c)
                .filter(c -> c == p.a || c == p.b).collect(Collectors.toList()))
                .collect(Collectors.toList());
        return filters.stream().filter(f->isValid(f)).mapToInt(f->f.size()).max().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(alternate("beabeefeab"));
    }
}
