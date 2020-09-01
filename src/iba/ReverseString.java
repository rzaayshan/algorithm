package iba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    static String reverseIter(String s){
        int n=s.length();
        return IntStream.range(0,n).mapToObj(i->s.charAt(n-i-1))
                .map(Object::toString).collect(Collectors.joining());
    }

    static void reverseRec(StringBuilder b, int n, String s){
        if(n==0) {
            b.append(s.charAt(n));
            return;
        }
        b.append(s.charAt(n));
        reverseRec(b,n-1,s);
    }

    static String reverseRec(String s){
        StringBuilder b = new StringBuilder();
        reverseRec(b, s.length()-1, s);
        return b.toString();
    }


    static int findNumber(int []a, int []b){
        int n = a.length;
        int m = b.length;
        int sum1=0;
        int sum2=0;
        int i;
        for(i=0;i<Math.min(n,m);i++){
            sum1+=a[i];
            sum2+=b[i];
        }
        if(i==n)
            sum2+=b[i];
        else
            sum1+=a[i];
        return Math.abs(sum1-sum2);

    }

    static String empty(String a, String b, String c){
//        if(!(a.isEmpty() || b.isEmpty() || c.isEmpty()))
//            return a;
//        if(a.isEmpty() && b.isEmpty())
//            return c;
//        if(a.isEmpty())
//            return b;

        return !(a.isEmpty() || b.isEmpty() || c.isEmpty())?a:
                a.isEmpty() && b.isEmpty()?c:
                        a.isEmpty()?b:"All are empty";


    }

    static void insertionSort(char[] l){
        int n = l.length;
        for (int i = 1; i < n; ++i) {
            char min = l[i];
            int j = i - 1;

            while (j >= 0 && l[j] > min) {
                l[j + 1] = l[j];
                j = j - 1;
            }
            l[j + 1] = min;
        }
    }

    static char[] toArray(String s){
        char[] l = new char[s.length()];
        for(int i=0;i<s.length();i++){
            l[i]=s.charAt(i);
        }
        return l;
    }

    static boolean isEqual(String a, String b){
        if(a.length()!=b.length()) return false;
        char[] l1 = toArray(a);
        char[] l2 = toArray(b);
        insertionSort(l1);
        insertionSort(l2);
        for(int i=0;i<a.length();i++){
            if(l1[i]!=l2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(reverseIter("abc"));
        System.out.println(reverseRec("abc"));
        System.out.println(findNumber(new int []{1,2,3,4,29}, new int[]{1,2,3,29}));
        System.out.println(empty("","","g"));
        System.out.println(isEqual("bca","bc"));

    }
}
