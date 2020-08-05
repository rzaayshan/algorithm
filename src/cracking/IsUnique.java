package cracking;


public class IsUnique {
    static boolean isUnique(String s){
        return s.chars().distinct().count()==s.length();
//        if(s.length()==1) return true;
//        int []a = new int[52];
//        for(int i=0;i<s.length();i++){
//            char c= s.charAt(i);
//            int idx;
//            if(c<'A')
//                idx=c-'A'+26;
//            else
//                idx=c-'a';
//            if(a[idx]!=0)
//                return false;
//            a[idx]++;
//        }
//        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("abca"));
    }

}
