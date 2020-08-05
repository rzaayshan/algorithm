package hackerrank;

import java.util.Map;
import java.util.stream.Collectors;

public class GameOfThrones {

    static String gameOfThrones(String s) {
        Map<Integer, Long> count = s.chars().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return count.entrySet().stream().filter(m->(m.getValue()&1)!=0)
                .count()>2?"NO":"YES";
    }

    public static void main(String[] args) {
        System.out.println(gameOfThrones("cdefghmnopqrstuvw"));
    }


}
