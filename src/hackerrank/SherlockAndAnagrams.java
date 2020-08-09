package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SherlockAndAnagrams {
    static int sherlockAndAnagrams(String s) {
        int len = s.length();
        Map<String, Integer> map = new HashMap<>();
        IntStream.range(0, len).forEach(i ->
                IntStream.range(i + 1, len + 1).forEach(j ->{
                           String key=s.substring(i, j).chars().mapToObj(c->(char) c).sorted().map(c->String.valueOf(c)).collect(Collectors.joining());
                           int val= map.getOrDefault(key,0);
                           map.put(key, ++val);

                        })

        );

        //map.forEach((key, value) -> System.out.println(key + value));
        map.entrySet().stream().filter(m->m.getValue()>1).forEach(m-> System.out.println(m.getKey()+" "+m.getValue()));
        return map.values().stream().mapToInt(i->i).filter(i->i>1).map(i->(i*(i-1))/2).sum();
    }

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("cdcd"));
        System.out.println(sherlockAndAnagrams("ifailuhkqq"));
        System.out.println(sherlockAndAnagrams("kkkk"));
    }

}
