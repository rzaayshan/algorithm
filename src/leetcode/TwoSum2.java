package leetcode;

import java.util.OptionalInt;
import java.util.Optional;
import java.util.stream.IntStream;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        for(int i=0;i<n;i++){
            if(i>target)
                continue;
            for(int j=i+1;j<n;j++){

                if(numbers[i]+numbers[j]==target)
                    return new int[]{i+1,j+1};
                if(numbers[i]+numbers[j]>target)
                    break;
            }
        }

        return new int[]{-1,-1};


    }
}
