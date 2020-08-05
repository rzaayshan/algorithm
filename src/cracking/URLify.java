package cracking;

import java.util.stream.Collectors;

public class URLify {

    static String s(String s, int n){
        return s.substring(0,n).chars().mapToObj(c->(char) c)
                .map(c->c.toString().equals(" ")?"%20":c.toString())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(s("Mr John Smith       ",13));

    }
}
