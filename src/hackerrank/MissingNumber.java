package hackerrank;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1,2,4,5};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        int missing = nums.length;
        for(int i=0;i<nums.length;i++){
            missing ^= nums[i]^i;
        }
        return missing;

    }
}