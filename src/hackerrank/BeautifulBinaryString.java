package hackerrank;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.IntStream;

public class BeautifulBinaryString {
    static int beautifulBinaryString(String b) {
        Character[] chars = b.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        int[] k ={0};
        IntStream.range(0,chars.length-2).forEach(i->{
            if(chars[i]=='0' && chars[i+1]=='1' && chars[i+2]=='0'){
                chars[i+2]='1';
                k[0]++;
            }
            System.out.printf("%s%s%s\n",chars[i],chars[i+1],chars[i+2]);
            System.out.println(k[0]);
        });
        return k[0];


    }

    public static void main(String[] args) {

        System.out.println(beautifulBinaryString("0101010"));
        //0111010
        //
    }
}
