package hackerrank;

public class HighestValuePalindrome {
    static String highestValuePalindrome(String s, int n, int k) {
        int mid = n/2;
        int c=0;
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for(int i=0;i<mid;i++){
            char fi=s.charAt(i);
            char se=s.charAt(n-i-1);
            if(fi!=se){
                if(fi>se)
                    first.append(fi);
                else
                    second.append(se);
                c++;
            }

        }
        StringBuilder secr = second.reverse();

        System.out.println(first.toString());
        System.out.println(second.toString());

        c=k-c;
        int i=0;
        while (c>1 && i<mid){
            first.delete(i,i+1);
            secr.delete(n-i-1,n);
            first.insert(i,'9');
            secr.insert(n-i-1, '9');
            i++;
            c+=2;
        }


        return (n^(n-1))==1?
                first.append(s.charAt(mid)).append(second).toString():
                first.append(second).toString();

    }


    public static void main(String[] args) {
        System.out.println(highestValuePalindrome("3943", 4, 1));

    }
}
