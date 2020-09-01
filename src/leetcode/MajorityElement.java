package leetcode;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate=null;
        for(int el:nums){
            if(count==0)
                candidate=el;
            count = (candidate==el)?++count:--count;
        }
        return candidate;

    }
}
