package hackerrank;

import java.lang.constant.ConstantDesc;
import java.util.stream.Collectors;

public class CeaserCipher {
    static String caesarCipher(String s, int k) {
        return s.chars().mapToObj(c->{
            if(c>='a' && c<='z'){
                return (char)((c + k-71)%26+97);
            }
            else if(c>='A' && c<='Z')
                return (char)((c + k-39)%26+65);
            return (char)c;
        }).map(Object::toString).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz",2));
    }
}
