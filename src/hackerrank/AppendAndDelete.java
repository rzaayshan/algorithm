package hackerrank;

public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        int i=0;
        while(i<s.length() && i<t.length() && s.charAt(i)==t.charAt(i)){
            i++;
        }
        if(s.length()<t.length()&&i==s.length()) return s.length()+t.length()<=k?"Yes":"No";
        int n = (s.length()-i)+(t.length()-i);
        return n<=k ? "Yes" : "No";

    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("abcd","abcdert",10));
    }
}
