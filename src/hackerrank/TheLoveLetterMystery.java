package hackerrank;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.IntStream;

public class TheLoveLetterMystery {
    static int theLoveLetterMystery(String s) {
        int len = s.length();
        return IntStream.range(0,len/2)
                .map(i->Math.abs(s.charAt(i)-s.charAt(len-i-1))).sum();
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("cba"));
    }
}
