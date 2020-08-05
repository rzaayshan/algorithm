package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),0);
        }
        for(int i=0;i<s2.length();i++){
            if(map.containsKey(s2.charAt(i))){
                return "YES";
            }
        }
        return "NO";


    }
}
