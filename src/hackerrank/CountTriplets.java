package hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CountTriplets {
    static long countTriplets(List<Long> arr, long r) {
        Iterator<Long> it = arr.iterator();
        Iterator<Long> it2 = arr.iterator();
        long count = 0L;
        HashMap<Long,Long> map = new HashMap<>();
        while (it.hasNext()){
            long el = it.next();
            map.put(el,map.getOrDefault(el,0L)+1);
        }
        while (it2.hasNext()) {
            long first = it2.next();
            long second1 = first * r;
            long second2 = first / r;
            long third1 = second1 * r;
            long third2 = second2 / r;

            if (arr.contains(second1) && arr.contains(third1)) {
                long firstC = map.get(first);
                long second1C = map.get(second1);
                long third1C = map.get(third1);
                if (firstC > 0 || second1C > 0 || third1C > 0) {
                    count++;
                    map.put(first, firstC -= 1);
                    map.put(second1, second1C -= 1);
                    map.put(third1, third1C -= 1);
                }
            } else if (arr.contains(second2) && arr.contains(third2)) {
                long firstC = map.get(first);
                long second2C = map.get(second2);
                long third2C = map.get(third2);
                if (firstC > 0 || second2C > 0 || third2C > 0){
                    count++;
                    map.put(first, firstC -= 1);
                    map.put(second1, second2C -= 1);
                    map.put(third1, third2C -= 1);
                }
            }
        }
        return count;
    }
}
