package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Long> collect = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        return collect.entrySet().stream().filter(m->m.getValue()>nums.length/3)
                .map(m->m.getKey()).collect(Collectors.toList());

    }
}
