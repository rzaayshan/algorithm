package hackerrank;

public class BalancedBrackets {
    static private final String YES = "YES";
    static private final String NO = "NO";
    static String isBalanced(String s) {
        int i=0, j=0, k=0;
        for(int z=0;z<s.length();z++){
            switch (s.charAt(z)){
                case '{':
                    i++;
                    break;
                case '(':
                    j++;
                    break;
                case '[':
                    k++;
                    break;
                case '}':
                    i--;
                    break;
                case ')':
                    j--;
                    break;
                case ']':
                    k--;
                    break;
            }
            if(i<0 || j<0 || k<0)
                return NO;
            if(i==0 && (j>0 || k>0))
                return NO;
            if(j==0 && k>0)
                return NO;
        }
        return i==0 ? YES : NO;


    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{{([])}}"));
    }
}
