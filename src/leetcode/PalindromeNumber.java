package leetcode;

import java.util.LinkedList;

public class PalindromeNumber {
    public boolean isPalindrome2(int x) {
        if(x<0)
            return false;

        LinkedList<Integer> l = new LinkedList<>();
        while(x/10!=0){
            l.add(x%10);
            x=x/10;
        }
        l.add(x);
        for(int i=0;i<l.size()/2;i++){
            if(!l.get(i).equals(l.get(l.size() - i - 1)))
                return false;
        }
        return true;

    }

    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int org = x;
        int rev=0;
        int r;
        while(x!=0){
            r=x%10;
            x=x/10;
            rev = rev*10+r;
        }
        return org==rev;


    }
}
