package hackerrank;

public class SOS {
    static int marsExploration(String s) {
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='S'){
                r++;
            }
            if(s.charAt(++i)!='O'){
                r++;
            }
            if(s.charAt(++i)!='S'){
                r++;
            }

        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }
}
