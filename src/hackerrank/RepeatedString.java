package hackerrank;

public class RepeatedString {

    static long count_a(String s){
        return s.chars().filter(c->c=='a').count();
    }

    static long repeatedString(String s, long n) {
        int len = s.length();
        long time = n/len;
        long rem = n%len;

        return count_a(s)*time+count_a(s.substring(0,(int) rem));
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba",10));
    }
}
