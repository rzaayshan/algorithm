package hackerrank;

import java.util.Arrays;

public class MinMaxSum {
    static void miniMaxSum(long[] arr) {
        long min=arr[0];
        long max=arr[0];
        long sum=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
            sum+=arr[i];
        }
        System.out.printf("%d %d",  sum-max,sum-min);


    }
}
