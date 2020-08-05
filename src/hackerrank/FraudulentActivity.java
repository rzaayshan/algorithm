package hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FraudulentActivity {
    /*static double median(int []b,int i, int d){
        int n=a.size();
        int mid=n/2;
        List<Integer> sorted = a.stream().sorted().collect(Collectors.toList());
        return (n&1)==1 ? sorted.get(mid) : (double)(sorted.get(mid)+sorted.get(mid-1))/2;
    }
    static int activityNotifications(int[] expenditure, int d) {
        int n = expenditure.length;
        int count=0;
        int [] b = new int[d];
        if (d >= 0) System.arraycopy(expenditure, 0, b, 0, d);
        for(int i=0;i<n-d;i++){
            //int[] days = Arrays.copyOfRange(expenditure, i, i + d);
            //int[] days = Arrays.stream(expenditure, i, i + d).toArray();
            double med = median(System.arraycopy(expenditure, 0, b, 0, d),i,d);
            if(expenditure[i+d]>=med*2)
                count++;
            b[i]=0;
            l.add(expenditure[i+d]);
        }
        return count;
    }*/
}

