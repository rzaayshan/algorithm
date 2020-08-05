package hackerrank;

import java.util.Arrays;

public class IceCream {
    static int[] icecreamParlor(int m, int[] arr) {
        int len = arr.length;
        int i,j;

        for(i=0;i<len-1;i++){
            for(j=i+1;j<len;j++){
                if(arr[i]+arr[j]==m)
                    return new int[]{i+1,j+1};
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(icecreamParlor(4, new int[]{1, 4, 5, 3, 2})));
    }
}
