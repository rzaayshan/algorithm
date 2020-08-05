package hackerrank;

import java.util.List;
import java.util.stream.Stream;

public class CarPasha {
    public static int widestGap(int n, List<Integer> start, List<Integer> finish) {
        int max=0;
        int max_finish=0;
        int max_start=0;
        for(int i=0;i<start.size()-1;i++){
            max_finish = Math.max(finish.get(i),max_finish);
            max_start = Math.max(start.get(i),max_start);
            max=Math.max(max_start-max_finish-1,max);
        }
        return max;
    }
}
