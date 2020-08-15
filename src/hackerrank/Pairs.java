package hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Pairs {

    static int pairs1(int k, int[] arr) {
        int[] r ={0};
        IntStream.range(0, arr.length - 1).forEach(i -> {
            IntStream.range(i, arr.length).forEach(j->{
                if(Math.abs(arr[i]-arr[j])==k) r[0]++;
            });
        });

        //return r[0];
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==k) c++;

            }
        }
        return c;

    }

    static int pairs(int k, int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        int j;
        int c=0;
        for(int i=0;i<sorted.length;i++){
            j=i+1;
            while (j<sorted.length && Math.abs(sorted[j]-sorted[i])<=k){
                if(Math.abs(sorted[j]-sorted[i])==k)
                    c++;
                j++;
            }
        }
        return c;
    }
}
