package iba;

public class IsNotNull {

    static String notNull(String a, String b, String c){
        String s = a+b+c;
        String sub=s.substring(0,c.length());
        return sub.substring(sub.length()-3);
    }

    public static void main(String[] args) {
        System.out.println(notNull("abc","dec",""));
    }
}
