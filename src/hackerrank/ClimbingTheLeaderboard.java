package hackerrank;

import java.util.Arrays;

public class ClimbingTheLeaderboard {
    static int binarySearch(int []a, int l, int r,int x, int mid){
        if(r>=l){
            mid=l+(r-l)/2;
            if(a[mid]==x)
                return mid;
            if(a[mid]>x)
                return binarySearch(a,mid+1,r,x,mid);
            return binarySearch(a,l,mid-1,x,mid);
        }
        return (-1)*mid;
    }
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] s = Arrays.stream(scores).distinct().toArray();
        System.out.println(Arrays.toString(s));

        return Arrays.stream(alice)
                .map(x-> {
                    int pos = Math.abs(binarySearch(scores,0, scores.length-1,x,0));
                    return pos==0?pos+1:pos;
                })
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(climbingLeaderboard(new int[] {100, 100, 50, 40, 40, 20, 10},
        new int[]{5, 25, 50, 120})));
    }
}
