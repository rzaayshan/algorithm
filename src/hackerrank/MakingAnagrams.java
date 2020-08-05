package hackerrank;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MakingAnagrams {

    static Map<Integer, Long> count(String s){
        return s.chars().sorted().boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    static int makingAnagrams(String s1, String s2) {
        Map<Integer, Long> a = count(s1);
        Map<Integer, Long> b = count(s2);
        System.out.println(a);
        System.out.println(b);

        int count1 = a.entrySet().stream()
                .filter(x -> x.getValue() > b.getOrDefault(x.getKey(), 0L))
                .mapToInt(x->(int)(x.getValue()-b.getOrDefault(x.getKey(), 0L))).sum();
        int count2 = b.entrySet().stream()
                .filter(y -> y.getValue() > a.getOrDefault(y.getKey(), 0L))
                .mapToInt(y -> (int) (y.getValue() - a.getOrDefault(y.getKey(), 0L))).sum();

        return (count1+count2);
    }


    public static void main(String[] args) {
        System.out.println(makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj","djfladfhiawasdkjvalskufhafablsdkashlahdfa"));
    }
}
