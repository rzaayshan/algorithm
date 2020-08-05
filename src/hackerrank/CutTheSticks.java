package hackerrank;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        List<Integer> result = new LinkedList<>();
        result.add(arr.length);

        while (true){
            int min = Arrays.stream(arr).filter(x->x!=0).min().orElse(0);
            arr = Arrays.stream(arr).filter(el -> el != 0).map(el -> el - min).filter(el -> el != 0).toArray();
            if(arr.length==0)
                break;
            result.add(arr.length);
        }

        return result.stream().mapToInt(x->x).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cutTheSticks(new int[]{5, 4, 4, 2, 2, 8})));
    }
}
