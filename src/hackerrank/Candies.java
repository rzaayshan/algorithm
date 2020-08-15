package hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Candies {
    static long candies(int n, int[] a) {

        int []c = new int[n];

        IntStream.range(0,n).forEach(i->{
            if(i==0){
                c[i]=a[i]>a[i+1]?2:1;
            }
            else if(i==n-1){
                c[i]=a[i]>a[i-1]?c[i-1]+1:1;
            }
            else if(a[i]>a[i-1] || a[i]>a[i+1])
                c[i]=Math.max(c[i-1],c[i+1])+1;
            else
                c[i]=1;

        });

        System.out.println(Long.parseLong(Arrays.stream(c).mapToObj(Integer::toString).collect(Collectors.joining())));

        return Arrays.stream(c).sum();


    }

    public static void main(String[] args) {
//        System.out.println(candies(3, new int []{1,2,2}));

//        System.out.println(candies(8, new int []{2,4,3,5,2,6,4,5}));

        System.out.println(candies(10, new int []{2,4,2,6,1,7,8,9,2,1}));
    }
}
