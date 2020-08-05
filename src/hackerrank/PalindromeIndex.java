package hackerrank;

import java.util.stream.IntStream;

public class PalindromeIndex {

    static int palindromeIndex(String s) {
        int i=0;
        int n=s.length();
        int res = -1;
        while(i!=n/2){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                res=s.charAt(i+1)==s.charAt(n-i-1)?i:n-i-1;
                break;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh".length());
        System.out.println(palindromeIndex("hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh"));
    }//                                        hgygsvlfwcwns

}
