package hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class FullCountingSort3 {
    static void countSort(List<List<String>> a) {

        Map<Integer, StringBuilder> map = new TreeMap<>();

        int n = a.size();

        IntStream.range(0,n/2).forEach(i->{
            int key = Integer.parseInt(a.get(i).get(0));
            if(!map.containsKey(key))
                map.put(key, new StringBuilder());
            map.get(key).append("-").append(" ");
        });

        IntStream.range(n/2,n).forEach(i->{
            int key = Integer.parseInt(a.get(i).get(0));
            String val = a.get(i).get(1);
            if(!map.containsKey(key))
                map.put(key, new StringBuilder());
            map.get(key).append(val).append(" ");
        });

        System.out.println(String.join("", map.values()));
    }
}
