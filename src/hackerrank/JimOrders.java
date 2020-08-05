package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class JimOrders {
    static int[] jimOrders(int[][] orders) {
        HashMap<Integer, Integer> time = new HashMap<>();
        IntStream.range(0,orders.length).forEach(i->time.put(i+1,orders[i][0]+orders[i][1]));
        return time.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .mapToInt(Map.Entry::getKey).toArray();


    }
}
