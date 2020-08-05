package cracking;

import java.util.Map;
import java.util.stream.Collectors;

public class PalindromePermutation {

    static boolean isPal(String s){
        Map<Character, Long> m = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return true;
    }

    public static void main(String[] args) {

    }
}
