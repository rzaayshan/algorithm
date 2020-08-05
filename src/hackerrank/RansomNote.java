package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String,Integer> dict = new HashMap<>();
        for (String value : magazine) {
            dict.put(value, dict.getOrDefault(value, 0) + 1);
        }
        for (String s : note) {

            if (dict.containsKey(s)) {
                int wordCount = dict.get(s);
                if(wordCount>0)
                dict.put(s, wordCount-=1);
                else{
                    System.out.println("No");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        String []a= {"two", "times", "three", "is", "not", "four"};
        String []b = {"two", "times", "two", "is",  "four"};
        checkMagazine(a,b);
    }
}
