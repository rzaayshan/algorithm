package hackerrank;

import java.util.Arrays;
import java.util.HashMap;


public class GemStones {
    static int gemstones(String[] arr) {
        HashMap<Character,Integer> count = new HashMap<>();
        Arrays.stream(arr).forEach(s->s.chars()
                .mapToObj(c->(char)c).distinct().forEach(c->{
                            int i=count.getOrDefault(c,0);
                            count.put(c,++i);
                }));
        return (int)count.values().stream().filter(v->v==arr.length).count();
    }

    public static void main(String[] args) {
        System.out.println(gemstones(new String[]{"abcdde","baccd","eeabg"}));
    }

}
