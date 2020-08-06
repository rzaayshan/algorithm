package hackerrank;

import java.util.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class FullCountingSort2 {
    static void countSort(List<List<String>> a) {
        Map<String, List<String>> map = new TreeMap<>();
        int n=a.size();
        for(int i=0;i<n/2;i++){
            String key = a.get(i).get(0);
            map.computeIfAbsent(key, k -> new LinkedList<>());
            map.get(key).add("-");
        }
        for(int i=n/2;i<n;i++){
            String key = a.get(i).get(0);
            String val = a.get(i).get(1);
            map.computeIfAbsent(key, k -> new LinkedList<>());
            map.get(key).add(val);
        }

        String result = map.values().stream().map(s -> String.join(" ", s)).collect(Collectors.joining(" "));

        map.values().forEach(s-> System.out.printf("%s ", String.join(" ", s)));


    }
}
