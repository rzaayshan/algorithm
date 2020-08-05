package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MissingNumbers {
    static int[] missingNumbers1(int[] arr, int[] brr) {
        LinkedHashMap<Integer, Long> count = Arrays.stream(brr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        LinkedHashMap<Integer, Long> count2 = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        for(Map.Entry<Integer,Long> e : count2.entrySet()){
            count.put(e.getKey(),count.get(e.getKey())-e.getValue());
        }
        return count.entrySet().stream().filter(e -> e.getValue() != 0)
                .map(Map.Entry::getKey).mapToInt(e -> e).toArray();
    }
    static int search(int[] b, int a) {
        // we need to apply binary search here
        return Arrays.binarySearch(b, a);
    }
    static int[] missingNumbers(int[] arr, int[] brr){
        int []sorted = new int[0];

        for (int value : arr) {
            sorted = Arrays.stream(brr).sorted().toArray();
            sorted[search(sorted,value)]=0;
        }
        return Arrays.stream(sorted).filter(e->e!=0).toArray();

    }


    public static void main(String[] args) {
        int []a={203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int []b={203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
        System.out.println(Arrays.toString(missingNumbers(a, b)));
    }
}
