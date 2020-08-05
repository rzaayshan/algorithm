package hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HackerRankInAString {
    static String hackerrankInString(String s) {
        String h="hackerrank";
        String res = s.chars().mapToObj(c -> (char) c).map(Object::toString)
                .filter(h::contains)
                .collect(Collectors.joining());
        int j=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)==h.charAt(j)){
                j++;
            }
            if(j==10)
                return "YES";
        }
        if(j==10)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }
}
